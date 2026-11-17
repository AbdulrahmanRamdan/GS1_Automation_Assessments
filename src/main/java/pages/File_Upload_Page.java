package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.nio.file.Paths;

public class File_Upload_Page extends BasePage {
    @FindBy(id  = "file-upload")
    private WebElement choose_file_BTN;

    @FindBy(id  = "file-submit")
    private WebElement sumbit_file_BTN;

    @FindBy(tagName   = "h3")
    private WebElement sumbit_file_Header;

    public void Choose_File(String file){
        String filePath = Paths.get("src", "test", "resources", "data", file).toAbsolutePath().toString();
        sendkeys(choose_file_BTN,filePath);
    }
    public void sumbit_File(){
        click(sumbit_file_BTN);
    }
    public void verify_file_uploaded(){
        Assert.assertEquals(gettext(sumbit_file_Header),"File Uploaded!","File not uploaded");
    }

}
