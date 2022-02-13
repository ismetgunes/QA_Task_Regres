package RegRes.Pages;

import RegRes.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement search;

    @FindBy(id = "nav-search-submit-button")
    public WebElement searchBtn;

    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement verifySearchText;

    @FindBy(xpath = "//div//img[@class='s-image']")
    public List<WebElement> shoes;

    @FindBy(id = "canvasCaption")
    public WebElement verifySelectShoesText;


}
