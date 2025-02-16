package com.stv.bdd.stepsdefinitions;

import com.stv.factory.factorypages.ForgotPasswordPage;
import com.stv.factory.factorypages.LoginFactoryPage;
import com.stv.factory.factorypages.MainFactoryPage;
import com.stv.factory.factorytests.BasicFactoryTest;
import com.stv.factory.factorytests.MainFactoryTest;
import com.stv.framework.core.drivers.MyDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static com.stv.framework.core.lib.ImmotionPageURLs.FORGOT_URL;
import static com.stv.framework.core.lib.ImmotionPageURLs.LOGIN_URL;
import static com.stv.framework.core.lib.ImmotionPageURLs.FORGOT_URL;

public class LoginStep extends BasicFactoryTest {

    private final MainFactoryPage mainFactoryPage = new MainFactoryPage();
    private final LoginFactoryPage loginFactoryPage = new LoginFactoryPage();
    public ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("Main page is loaded")
    public void mainPageIsLoaded(){
        setUp();
    }

    @When("The user click on loginButton")
    public void clickLoginButton(){
        mainFactoryPage.clickOnLoginButton();
    }

    @Then("The login page is loaded")
    public void loginPageIsLoaded(){
        Assert.assertTrue(loginFactoryPage.isLoginContainerDisplayed(), "Container is not displayed");
        Assert.assertEquals(loginFactoryPage.getUrlLoginPage(), LOGIN_URL, "Url is not true");
    }

    @When("The user click on ForgotPassword")
    public void clickForgotPassword()
    {loginFactoryPage.clickForgotPassword();
    }

    @Then("ForgotPassword page is loaded")
    public void ForgotPasswordPageIsLoaded(){
        Assert.assertTrue(forgotPasswordPage.isWrapInputDisplayed(), "Input is not displayed");
        Assert.assertEquals(forgotPasswordPage.getUrlForgotPage(), FORGOT_URL, "Url is not true");
    }
}
