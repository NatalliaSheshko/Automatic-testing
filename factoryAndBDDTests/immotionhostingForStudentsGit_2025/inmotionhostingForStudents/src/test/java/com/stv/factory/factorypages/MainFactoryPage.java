package com.stv.factory.factorypages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainFactoryPage extends FactoryPage {

    @FindBy(css = "*[alt ='InMotion Hosting Logo']")
    private WebElement inmotionLogo;

    @FindBy(id = "navbarNavDropdown")
    private WebElement navigationPanel;

    @FindBy(xpath = "//button[contains(text(), 'Accept All Cookies')]")
    private WebElement acceptAllCookiesButton;

    @FindBy(css = "div.btn-login-container")
    private WebElement logInButton;

    public WebElement getNavigationPanel() {
        return navigationPanel;
    }

    public MainFactoryPage acceptAllCookiesIfVisible() {
        if (acceptAllCookiesButton.isEnabled())
            acceptAllCookiesButton.click();
        return this;
    }

    public boolean isMainLogoDisplayed() {
        //acceptAllCookiesIfVisible();
        return inmotionLogo.isDisplayed();
    }

    public boolean isNavigationPanelDisplayed() {
        return navigationPanel.isDisplayed();
    }

    public void clickOnLoginButton() {
        logInButton.click();
    }
}
