package pageobjects;

import org.openqa.selenium.By;
import base.BasePageObject;
import org.openqa.selenium.WebDriver;

import java.util.logging.Level;

public class LoginPage extends BasePageObject {

    By txtEmail = By.xpath("//input[@id='login']");
    By txtPassword = By.id("password");
    By btnLogin = By.name("submit");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(String email) throws Exception {
        try {
            logger.log(Level.INFO, "Start | enterEmaill()");
            System.out.println(isElementDisplayedAfterWaiting(btnLogin ,10000));
            System.out.println(isElementDisplayedAfterWaiting(txtPassword ,10000));
            System.out.println(driver.getCurrentUrl());
            System.out.println(driver.getTitle());
            driver.findElement(txtEmail).sendKeys(email);
        } catch (Exception e) {
            logger.log(Level.INFO, "Fail | enterEmail()");
            throw e;
        }
    }

    public void enterPassword(String password) throws Exception {
        try {
            logger.log(Level.INFO, "Start | enterPassword()");
            driver.findElement(txtPassword).sendKeys(password);
        } catch (Exception e) {
            logger.log(Level.INFO, "Start | enterPassword()");
            throw e;
        }
    }

    public void clickOnLoginButton() throws Exception {
        try {
            logger.log(Level.INFO, "Start | clickOnLoginButton()");
            waitForElementToBeDisplayed(btnLogin);
            driver.findElement(btnLogin).click();
        } catch (Exception e) {
            logger.log(Level.INFO, "Fail | clickOnLoginButton()");
            throw e;
        }
    }
}
