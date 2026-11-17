package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.File_Upload_Page;

public class File_upload_Step {
    @And("Choose {string} from the data folder")
    public void Choose_File(String file){
        new File_Upload_Page().Choose_File(file);
    }

    @And("click submit button")
    public void sumbit_File(){
        new File_Upload_Page().sumbit_File();
    }

    @Then("Verify the file uploaded")
    public void verify_file_uploaded(){
        new File_Upload_Page().verify_file_uploaded();
    }
}
