package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DynanicLoadingPage extends BasePage  {
    @FindBy(linkText  = "Example 2: Element rendered after the fact")
    private WebElement example2_link;

    @FindBy(xpath ="//*[@id='start']/button")
    private WebElement start_BTN;

    @FindBy(id  = "finish")
    private WebElement finish_Header;

    public void click_Example2(){
        click(example2_link);
    }
    public void click_Start(){
        click(start_BTN);
    }
    public void verify_text_appearance(){
        Assert.assertEquals(gettext(finish_Header),"Hello World!","Hello world does not match");
    }
}
