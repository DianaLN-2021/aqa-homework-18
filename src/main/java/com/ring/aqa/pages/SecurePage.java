package com.ring.aqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SecurePage extends BasePage {
    @FindBy(how = How.CSS, using = "h2")
    private WebElement title;

    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement logout;

    public String getTitle(){
        return title.getText();
    }

    public SecurePage clickLogout(){
        logout.click();
        return this;
    }

    public SecurePage(WebDriver driver) {
        super(driver);
    }

}
