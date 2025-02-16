package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.stv.framework.core.lib.ImmotionPageURLs.FORGOT_URL;

public class LoginFactoryPage extends FactoryPage {

    @FindBy(id = "username")
    private WebElement userName;

    @FindBy(css = "div.new-login-simple")
    private WebElement loginContainer;

    @FindBy(css = "a.forgot-password")
    private WebElement forgotPasswordLink;

    public WebElement getLoginContainer() {
        return loginContainer;
    }

    public boolean isLoginContainerDisplayed() {
        return loginContainer.isDisplayed();
    }

    public boolean checkFieldUserName() {
        userName.click();
        String boxShadow = userName.getCssValue("box-shadow");
        return boxShadow != null && !boxShadow.equals("none");
    }

    public String getUrlLoginPage() {
        return getDriver().getCurrentUrl();
    }

    public void clickForgotPassword(){
        forgotPasswordLink.click();
        getDriver().get(FORGOT_URL);
        new ForgotPasswordPage();
    }

}
