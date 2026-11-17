package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class HomePage extends BasePage {
    @FindBy(linkText  = "File Upload")
    private WebElement upload_file_BTN;

    @FindBy(linkText  = "Dynamic Loading")
    private WebElement dynamic_loading_BTN;
    public void click_Upload_File(){
        scrollToElement(dynamic_loading_BTN);
        click(upload_file_BTN);
    }
    public void click_Dynamic_Loading(){
        click(dynamic_loading_BTN);
    }

}
