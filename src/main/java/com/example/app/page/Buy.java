package com.example.app.page;

import com.example.app.base.BasePageObject;
import org.openqa.selenium.By;

public class Buy extends BasePageObject {
    private By buyBtnPs5 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[1]");
    private By buyPs2 = By.xpath("(//android.widget.Button[@content-desc='Beli'])[5]");
    private By numberOnCart = By.xpath("//android.widget.Button[@content-desc='1']");
    public void clickBuyBtnPs5() {
        click(buyBtnPs5);
    }

    public void clickBuyBtnPs2() {
        click(buyPs2);
    }

    public void numberOnCartDisplayed() {
        isDisplayed(numberOnCart);
    }
}
