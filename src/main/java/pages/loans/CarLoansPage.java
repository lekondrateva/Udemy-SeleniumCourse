package pages.loans;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarLoansPage {
    WebDriver driver;
    private final By agreements = By.xpath("//div[contains(text(), 'Agreements')]");
    public CarLoansPage(WebDriver driver) {
        this.driver = driver;
    }

    public CarLoansPage selectAgreementsTab() {
        driver.findElement(agreements).click();
        return this;
    }

}
