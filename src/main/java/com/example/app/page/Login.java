package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class Login extends BasePageObject {
    private By loginIcon = By.xpath("(//android.widget.Button)[1]");
    private By fieldEmail = By.xpath("//android.widget.EditText[1]");
    private By fieldPassword = By.xpath("//android.widget.EditText[2]");
    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By errorMsgEmail = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By errorMsgPassword = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    private By errorMsg = MobileBy.AccessibilityId("Email atau password tidak valid.");
    private By header = By.xpath("//android.view.View[1]/android.widget.Button");
    public void inputEmail(String arg0) {
        click(fieldEmail);
        inputText(fieldEmail, arg0);
    }

    public void inputPassword(String arg1) {
        click(fieldPassword);
        inputText(fieldPassword, arg1);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }

    public void errorMsgEmailDisplayed() {
        isDisplayed(errorMsgEmail);
    }

    public void errorMsgPasswordDisplayed() {
        isDisplayed(errorMsgPassword);
    }

    public void errormsgDisplayed() {
        getText(errorMsg);
    }

    public void headerDisplayed() {
        isDisplayed(header);
    }
}
