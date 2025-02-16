package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends FactoryPage{

    @FindBy(css = "div.input_wrap")
    private static WebElement wrapInput;

    public String getUrlForgotPage() {
        return getDriver().getCurrentUrl();
    }

    public boolean isWrapInputDisplayed() {
        return wrapInput.isDisplayed();
    }
}
