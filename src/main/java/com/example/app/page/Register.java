package com.example.app.page;

import com.example.app.base.BasePageObject;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.nio.file.Files.find;

public class Register extends BasePageObject {
    private By productHeader = By.xpath("//android.view.View[@content-desc=\"Products\"]");
    private By loginIcon = By.xpath("(//android.widget.Button)[1]");
    private By register = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By fieldFullName = By.xpath("//android.widget.EditText[1]");
    private By fieldEmail = By.xpath("//android.widget.EditText[2]");
    private By fieldPassword = By.xpath("//android.widget.EditText[3]");
    private By errorMsgFn = By.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
    private By errorMsgEmail = By.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    private By errorMsgPassword = By.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    private By registerBtn = By.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    private By productDisplayed = By.xpath("(//android.view.View[1])[1]");
    private String newemail;

    public void loginIconDisplayed() {
        isDisplayed(loginIcon);
    }

    public void clickLoginIcon() {
        click(loginIcon);
    }

    public void clickRegister() {
        click(register);
    }

    public void clearField() {
        clear(fieldFullName);
        clear(fieldEmail);
        clear(fieldPassword);
    }

    public void inputName(String arg0) {
        click(fieldFullName);
        inputText(fieldFullName, arg0);
    }

    public void inputEmail(String arg1) {
        List<Integer> category = new LinkedList<>();
        Random rand = new Random();
        newemail = "retiamelina" + rand.nextInt() + "@gmail.com";
        inputText(fieldEmail, arg1);
    }

    public void inputPassword(String arg2) {
        click(fieldPassword);
        inputText(fieldPassword, arg2);
    }

    public void clickRegisterButton() {
        click(registerBtn);
    }

    public void headerDisplayed() {
        isDisplayed(loginIcon);
    }

    public void errorMessageNameDisplayed() {
        isDisplayed(errorMsgFn);
    }

    public void errorMessageEmailDisplayed() {
        isDisplayed(errorMsgEmail);
    }

    public void errorMessagePasswordDisplayed() {
        isDisplayed(errorMsgPassword);
    }
}
