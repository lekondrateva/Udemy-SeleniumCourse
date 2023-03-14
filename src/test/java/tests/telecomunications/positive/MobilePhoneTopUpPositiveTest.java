package tests.telecomunications.positive;

import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static constants.Const.MobileTopUpData.*;
import static constants.Const.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneTopUpPositiveTest extends BaseTest {

    @Test
    public void checkIsRedirectToAuth () {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage.selectCardFromWallet();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinTopUpAmount () {
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterAmount("1")
                .enterCard(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP)
                .enterCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToTheCard()
                .checkPaymentDetailsIsPresent("Mobile payment. Phone number +38099963522");
    }
}
