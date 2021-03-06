package framework.webPages.darkskyAPI;

import framework.webPages.BasePages.WebBasePage;
import org.openqa.selenium.By;
import util.PageUtil;

import java.util.Collections;
import java.util.List;

public class DarkSkyHomePageWeb extends WebBasePage {

    private By darkSkyApiLink = By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
    private By currentTemperature = By.xpath("(//span[starts-with(@class, 'summary')])[1]");
    private By timelineTemperatures = By.xpath("//div[@id='timeline']//div[@class = 'temps']//span//span");
    private By timelineHours = By.xpath("//div[@id='timeline']//div[@class = 'hours']//span[@class = 'hour']/span");
    private By todayTimeline = By.xpath("//span[@class = 'name' and contains(text(), 'Today')]");
    private By minTimelineTempOfToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'minTemp']");
    private By maxTimelineTempOfToday = By.xpath("(//div[@id = 'week']//a[@class = 'day'])[1]//span[@class = 'maxTemp']");
    private By lowestTempOfToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'highTemp')]//span[@class = 'temp']");
    private By highestTempOfToday = By.xpath("(//div[contains(@class, 'highLowTemp')])[1]//span[contains(@class, 'lowTemp')]//span[@class = 'temp']");

    public DarkSkyApiPageWeb clickOnDarkSkyApiLink(){
        clickOn(darkSkyApiLink);
        return new DarkSkyApiPageWeb();
    }
    public int getCurrentTemperature(){
        String currentTempText = getTextFromElement(currentTemperature);
        String currentTemp = currentTempText.split("˚")[0];
        return Integer.parseInt(currentTemp);
    }

    public List<String> getTimelineTemperatures(){
        return getTextFromElements(timelineTemperatures);
    }

    public int getMaxTimelineTemperature(){
        List<String> timelineTemperatures = getTimelineTemperatures();
        String maxTemp = Collections.max(timelineTemperatures).replace("°", "");
        return Integer.parseInt(maxTemp);
    }

    public int getMinTimelineTemperature(){
        List<String> timelineTemperatures = getTimelineTemperatures();
        String minTemp = Collections.min(timelineTemperatures).replace("°", "");
        return Integer.parseInt(minTemp);
    }

    public boolean isCurrentTemperatureInBetween(int currentTemp, int maxTemp, int minTemp){
        return currentTemp <= maxTemp && currentTemp >= minTemp;
    }

    public List<String> getTimelineHours(){
        return getTextFromElements(timelineHours);
    }

    public void clickOnTodayTimeline() throws InterruptedException {
        scrollUpToVisibleElement(todayTimeline);
        PageUtil.syncWait(2000);
        clickOn(todayTimeline);
    }

    public String getMinTimelineTempOfToday(){
        return getTextFromElement(minTimelineTempOfToday);
    }

    public String getMaxTimelineTempOfToday(){
        return getTextFromElement(maxTimelineTempOfToday);
    }

    public String getLowestTempOfToday(){
        return getTextFromElement(lowestTempOfToday);
    }

    public String getHighestTempOfToday(){
        return getTextFromElement(highestTempOfToday);
    }
}
