package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Logout extends BasePageObject {
    private By loginIcon = By.xpath("(//android.widget.Button)[1]");
    private By fieldEmail = By.xpath("//android.widget.EditText[1]");
    private By fieldPassword = By.xpath("//android.widget.EditText[2]");
    private By loginBtn = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    private By logoutBtn = By.xpath("//android.view.View[1]/android.widget.Button");
    public void clickLoginIcon() {
        click(loginIcon);
    }

    public void inputEmail(String s) {
        click(fieldEmail);
        inputText(fieldEmail, s);
    }

    public void inputPassword(String retiaah10) {
        click(fieldPassword);
        inputText(fieldPassword, retiaah10);
    }

    public void clickLoginBtn() {
        click(loginBtn);
    }

    public void headerdiplayed() {
        isDisplayed(logoutBtn);
    }

    public void clickLogoutIcon() {
        click(logoutBtn);
    }

    public void loginIconDisplayed() {
        isDisplayed(loginIcon);
    }
}
