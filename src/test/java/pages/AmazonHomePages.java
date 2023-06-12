package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonHomePages {

    public AmazonHomePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id= "something")
    public WebElement login;

}
