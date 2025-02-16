package com.stv.factory.factorytests;


import com.stv.factory.factorypages.LoginFactoryPage;
import com.stv.factory.factorypages.MainFactoryPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.stv.framework.core.lib.ImmotionPageURLs.LOGIN_URL;
import static com.stv.framework.core.utils.Waiters.waitForElementVisible;


public class MainFactoryTest extends BasicFactoryTest {

    MainFactoryPage mainFactoryPage = new MainFactoryPage();
    LoginFactoryPage loginFactoryPage = new LoginFactoryPage();

    @Test (description = "Assert the main page is loaded and main logo is visible")
    public void assertMainLogoIsDisplayed() {
        boolean actualResult = mainFactoryPage.isMainLogoDisplayed();
        Assert.assertEquals(actualResult, true, "Main Logo isn't visible");
    }

    @Test (description = "Assert the Navigation panel is loaded", dependsOnMethods = "assertMainLogoIsDisplayed")
    public void assertAdminPanelOpened() {
        waitForElementVisible(getDriver(), Duration.ofSeconds(2), mainFactoryPage.getNavigationPanel());
        Assert.assertEquals(mainFactoryPage.isNavigationPanelDisplayed(), true, "Admin panel isn't visible");
    }

    @Test(description = "Assert field userName is active", dependsOnMethods = "assertMainLogoIsDisplayed")
    public void clickOnLoginButton() {
        mainFactoryPage.clickOnLoginButton();
        waitForElementVisible(getDriver(), Duration.ofSeconds(5), loginFactoryPage.getLoginContainer());
        Assert.assertEquals(loginFactoryPage.isLoginContainerDisplayed(), true, "Container is not displayed");
        Assert.assertEquals(loginFactoryPage.getUrlLoginPage(), LOGIN_URL, "Url is not true");
        loginFactoryPage.checkFieldUserName();
        Assert.assertTrue(loginFactoryPage.checkFieldUserName(), "field userName is not active");

    }


}
