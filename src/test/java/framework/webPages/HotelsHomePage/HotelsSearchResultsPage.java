package framework.webPages.HotelsHomePage;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.PageUtil;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HotelsSearchResultsPage extends WebBasePage {
    private By dealOfTheDay = By.xpath("(//div[@class = 'price'])[1]//ins");
    private By starRatingCheckBox = By.xpath("//div[@id = 'filter-star-rating-contents']//input[@name = 'f-star-rating']");
    private By starRatings = By.xpath("//span[contains(@class, 'star-rating-text')]");
    private By careerLinkText = By.xpath("//a[contains(text(), 'Careers')]");
    private By sortByDistance = By.xpath("//a[@data-menu='sort-submenu-distance']");
    private By distanceOption = By.xpath("//ul[@id = 'sort-submenu-distance']//a");
    private By hotel = By.xpath("//li[starts-with(@class, 'hotel')]");
    private By hotelNameLink = By.xpath("//a[@class = 'property-name-link']");
    private By locationOfHotel = By.xpath("//ul[@class = 'property-landmarks']//li[1]");

    public int getDealOfTheDay(){
        String price = getTextFromElement(dealOfTheDay).trim();
        return Integer.parseInt(price.substring(1));
    }

    public boolean assertLessThan(int dealOfTheDay, int expectedDeal){

        return dealOfTheDay < expectedDeal;
    }

    public List<WebElement> getStarRatingCheckBoxList(){
        return getWebElements(starRatingCheckBox);
    }

    public void clickOnStarRatingCheckBox(String attributeValue){
        List<WebElement> starRatingCheckBoxList = getStarRatingCheckBoxList();

        for(WebElement checkBox: starRatingCheckBoxList){

            if(checkBox.getAttribute("value").equalsIgnoreCase(attributeValue)){

                checkBox.click();
                return;
            }
        }
    }

    public void scrollDownToBottomOfThePage(int scrollingTimeInSeconds) throws InterruptedException {
        int second = 0;
        while (second <= scrollingTimeInSeconds/2){
            scrollDownBy(500);
            PageUtil.syncWait(2000);
            second++;
        }
    }

    public int getNumberOfStarRatings(){
        return getWebElements(starRatings).size();
    }

    public List<String> getHotelsStarRatings(){
        return getTextFromElements(starRatings);
    }

    public boolean isDisplayedOnlyStarHotels(String value){
        List<String> listOfStarRatings = getHotelsStarRatings();

        for(String starRating: listOfStarRatings){
            String starValue = starRating.split("-")[0];

            if (!starValue.equals(value)){
                return false;
            }
        }
        return true;
    }

    public void scrollUpToCareerLinkText(){
        scrollUpToVisibleElement(careerLinkText);
    }

    public void clickOnSortByDistance(){
        clickOn(sortByDistance);
    }

    public List<WebElement> getAllDistanceOptions(){
        return getWebElements(distanceOption);
    }

    public void selectDistanceOption(String option){
        List<WebElement> distanceOptions = getAllDistanceOptions();

        for(WebElement distanceOption: distanceOptions){
            if(distanceOption.getText().equalsIgnoreCase(option)){
                distanceOption.click();
                return;
            }
        }
    }

    public List<Double> getLocationsOfHotels(){
        List<String> locations = getTextFromElements(locationOfHotel);
        List<Double> listOfRadius = new ArrayList<>();

        for(String location: locations){
            Double radius = Double.parseDouble(location.split(" ")[0]);
            listOfRadius.add(radius);
        }
        return listOfRadius;
    }

    public List<String> getNamesOfTheHotels(){
        return getTextFromElements(hotelNameLink);
    }

    public List<String> getHotels(){
        return getAttributeValuesFromElements(hotel, "data-title");
    }

    public Map<String, Double> getHotelsWithinRadius(double radius){
        List<String> hotels = getHotels();
        List<Double> locations = getLocationsOfHotels();
        Map<String, Double> hotelToDistance = new LinkedHashMap<>();

        int index = 0;
        for(Double distance: locations){
            if(distance <= radius){
                hotelToDistance.put(hotels.get(index), distance);
            }
            index++;
        }
        return hotelToDistance;
    }

    public void printHotels(Map<String, Double> map){
        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + ": " + entry.getValue() + " miles");
        });
    }

    public boolean isHotelWithinRadius(String nameOfTheHotel, double radius, Map<String, Double> hotelToRadius){
        boolean found = false;

        for(Map.Entry<String, Double> entry: hotelToRadius.entrySet()){
            if(entry.getKey().equalsIgnoreCase(nameOfTheHotel) && entry.getValue() <= radius){
                found = true;
                break;
            }
        }
        return found;
    }

    public boolean checkHotelsAreWithinRadius(Map<String, Double> hotelToRadius, double radius){
        boolean found = false;

        for(Map.Entry<String, Double> entry: hotelToRadius.entrySet()){
            if(entry.getValue() <= radius){
                found = true;
                break;
            }
        }
        return found;
    }

}
