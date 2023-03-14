package common;

public class Config {
    /**
     * Specify the browser and platform for test:
     * CHROME_MAC
     * CHROME_WINDOWS
     * MOZILLA_MAC
     */
    public static final String BROWSER_AND_PLATFORM = "CHROME_WINDOWS";
    /*** Clean browser cookies after each iteration*/
    public static final Boolean CLEAR_COOKIES = false;
    /*** Keep browser open after all tests*/
    public static final Boolean HOLD_BROWSER_OPEN = true;
    /*** Clear the directory with screenshots*/
    public static final Boolean CLEAR_REPORT_DIR = true;
}
