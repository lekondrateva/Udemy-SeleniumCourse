package pages.telecomunications;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneTopUpPage extends BasePage {

    public MobilePhoneTopUpPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonWallet = By.xpath("//div[contains(text(), 'My wallet')]");
    private final By inputPhoneNumber = By.xpath("//input[@data-qa-node='phone-number']");
    private final By inputAmount = By.xpath("//input[@data-qa-node='amount']");
    private final By buttonTopUp = By.xpath("//button[@data-qa-node='submit']");
    private final By inputCardFrom = By.xpath("//input[@data-qa-node='numberdebitSource']");
    private final By inputCardExpDate = By.xpath("//input[@data-qa-node='expiredebitSource']");
    private final By inputCardCvv = By.xpath("//input[@data-qa-node='cvvdebitSource']");
    private final By paymentDetails = By.xpath("//div[@data-qa-node='details']");
//    @FindBy(xpath = "")
//    private WebElement buttonWallet;

    /**
     * Choose a card from the wallet
     */
    public MobilePhoneTopUpPage selectCardFromWallet() {
        driver.findElement(buttonWallet).click();
        return this;
    }

    /**
     * Enter phone number excluding country code
     * @param number phone number
     */
    public MobilePhoneTopUpPage enterPhoneNumber(String number) {
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    /**
     * Enter the amount to top up the balance
     * @param amount the amount to top up
     */
    public MobilePhoneTopUpPage enterAmount(String amount) {
        driver.findElement(inputAmount).sendKeys(amount);
        return this;
    }

    /**
     * Enter the number of the card from which the balance will be replenished
     * @param card is a card from which the balance is topped up
     */
    public MobilePhoneTopUpPage enterCard(String card) {
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    /**
     * Enter an expired date of a card from which the balance is topped up
     * @param date is a card expired date
     */
    public MobilePhoneTopUpPage enterCardExpDate(String date) {
        driver.findElement(inputCardExpDate).sendKeys(date);
        return this;
    }

    public MobilePhoneTopUpPage enterCvv(String cvv) {
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }
    public MobilePhoneTopUpPage submitToTheCard() {
        driver.findElement(buttonTopUp).click();
        return this;
    }

    public MobilePhoneTopUpPage checkPaymentDetailsIsPresent(String text) {
        WebElement details = waitElementIsVisible(driver.findElement(paymentDetails));
        Assertions.assertEquals(text, details.getText());
        return this;
    }
}
