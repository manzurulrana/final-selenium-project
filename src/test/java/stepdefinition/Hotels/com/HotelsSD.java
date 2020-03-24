package stepdefinition.Hotels.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HotelsHomePage.HotelsHomePage;
import framework.webPages.HotelsHomePage.HotelsSearchResultsPage;
import org.testng.Assert;
import util.DateUtil;
import util.PageUtil;

import java.time.LocalDate;
import java.util.Map;

public class HotelsSD {

    private HotelsHomePage hotelsHomePage = null;
    private HotelsSearchResultsPage hotelsSearchResultsPage = null;

    @Given("^I am on hotels.com home page$")
    public void iAmOnHotelsHomePage(){
        hotelsHomePage = new HotelsHomePage();

        String expectedURL = "https://www.hotels.com/";
        String actualURL = hotelsHomePage.getURL();

        String expectedTitle = "Hotels.com";
        String actualTitle = hotelsHomePage.getPageTitle().trim();
        boolean containsTitle = actualTitle.startsWith(expectedTitle);

        Assert.assertEquals(expectedURL, actualURL,
                "Not on Hotels.com Home Page: " + actualURL);

        Assert.assertTrue(containsTitle,
                "Actual title: "+ actualTitle + " doesn't start with: " + expectedTitle);

    }

    @When("^I enter (.*) on hotels home page$")
    public void enterDestination(String destination) throws InterruptedException {
        hotelsHomePage.selectDestination(destination);
    }

    @When("^I enter checkIn and checkOut dates$")
    public void enterCheckInCheckOutDate() throws InterruptedException {
        LocalDate checkInDate = DateUtil.getCurrentDate();
        LocalDate checkOutDate = DateUtil.getDateInFuture(checkInDate, 7);
        hotelsHomePage.selectCheckInCheckOutDate(checkInDate, checkOutDate);
    }

    @When("^I click on search button$")
    public void clickOnSearchButton() throws InterruptedException {
        hotelsSearchResultsPage = hotelsHomePage.clickOnSearchButton();
        PageUtil.syncWait(2000);
    }

    @Given("^I verify todays deal is less than (\\d+) at search result page$")
    public void verifyDealOfTheDay(int expectedDeal) {
        int dealOfTheDay = hotelsSearchResultsPage.getDealOfTheDay();
        boolean lessThan = hotelsSearchResultsPage.assertLessThan(dealOfTheDay, expectedDeal);

        Assert.assertTrue(lessThan,
                "Actual deal: $" + dealOfTheDay + " Expected deal: $" + expectedDeal );

    }

    @When("^I select (.+) from room dropdown$")
    public void selectRooms(String numberOfRooms) {
        hotelsHomePage.selectRoomsFromDropDown(numberOfRooms);
    }

    @Then("^I verify (.+) is displayed$")
    public void verifyNumberOfRooms(int numberOfRoomDropDown){
        int actualNumberOfRoomDropDown = hotelsHomePage.getNoOfAdultRoomDropDown();

        Assert.assertEquals(numberOfRoomDropDown, actualNumberOfRoomDropDown,
                "Expected number of room dropdown: " + numberOfRoomDropDown
                    + " actual number of room dropdown: " + actualNumberOfRoomDropDown);
    }

    @When("^I select property class (.*) at search result page$")
    public void clickOnStarRatingCheckBox(String starText){
        String starValue = starText.substring(0, 1);
        hotelsSearchResultsPage.clickOnStarRatingCheckBox(starValue);
    }

    @Then("^I verify system displays only (.*) hotels at search result page$")
    public void verifyDisplayOfStarHotels(String starText) throws InterruptedException {
        String starValue = starText.substring(0, 1);

        hotelsSearchResultsPage.scrollDownToBottomOfThePage(60);
        boolean isOnlyStarHotels = hotelsSearchResultsPage.isDisplayedOnlyStarHotels(starValue);

        Assert.assertTrue(isOnlyStarHotels,
                "System displays hotels other than " + starText + " hotels: " + hotelsSearchResultsPage.getHotelsStarRatings());
    }

    @When("^I click on sort by distance option on search result page$")
    public void clickOnSortByDistanceOption() throws InterruptedException {
        hotelsSearchResultsPage.clickOnSortByDistance();
        PageUtil.syncWait(2000);
    }

    @When("^I select (.*) from sort by distance options$")
    public void selectDistanceOption(String distanceOption) throws InterruptedException {
        hotelsSearchResultsPage.selectDistanceOption(distanceOption);
        PageUtil.syncWait(2000);
        hotelsSearchResultsPage.scrollDownToBottomOfThePage(120);
    }

    @When("^I verify system displays all hotels within (\\d+) miles radius of airport$")
    public void verifySystemDisplaysAllHotels(double radius){
        System.out.println(hotelsSearchResultsPage.getLocationsOfHotels());
        System.out.println(hotelsSearchResultsPage.getHotels());

        Map<String, Double> hotelToRadius = hotelsSearchResultsPage.getHotelsWithinRadius(radius);
        boolean withinRadius = hotelsSearchResultsPage.checkHotelsAreWithinRadius(hotelToRadius, radius);
        hotelsSearchResultsPage.printHotels(hotelToRadius);

        Assert.assertTrue(withinRadius,
                "Hotels are not within radius: " + radius + " miles" +
                hotelToRadius);

    }

    @Then("^I verify (.*) hotel is within (\\d+) miles radius of airport$")
    public void verifyHiltonHotelIsWithinRadius(String nameOfTheHotel, double radius) {
        Map<String, Double> hotelToRadius = hotelsSearchResultsPage.getHotelsWithinRadius(radius);
        boolean withinRadius = hotelsSearchResultsPage.isHotelWithinRadius(nameOfTheHotel, radius, hotelToRadius);

        Assert.assertTrue(withinRadius,
                nameOfTheHotel + " is not within radius: " + hotelToRadius);

    }
}
