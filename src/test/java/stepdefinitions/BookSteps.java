package stepdefinitions;


import API_java.BookService;
import API_java.ScenarioContext;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import org.testng.Assert;


import static org.hamcrest.Matchers.*;

public class BookSteps {

    private final ScenarioContext context;
    private final BookService bookService;

    public BookSteps(ScenarioContext context) {
        this.context = context;
        this.bookService = new BookService();
    }



    @When("I send a GET request to retrieve all books")
    public void retrieveAllBooks() {
        context.setResponse(bookService.getAllBooks());
    }

    @Given("a valid book ID {string}")
    public void validBookId(String id) {
        context.setBookId(id);
    }

    @Given("an invalid book ID {string}")
    public void invalidBookId(String id) {
        context.setBookId(id);
    }

    @When("I send a GET request to retrieve the book")
    public void retrieveBook() {
        context.setResponse(
                bookService.getBookById(
                        Integer.parseInt(context.getBookId())
                )
        );
    }

    @Then("the response status code should be {int}")
    public void validateStatusCode(int statusCode) {
        context.getResponse()
                .then()
                .statusCode(statusCode);
    }

    @Then("the response should contain a list of books")
    public void validateBooksList() {
        context.getResponse()
                .then()
                .body("$", not(empty()));
    }

    @Then("the response should contain the requested book ID")
    public void validateRequestedBookId() {
        context.getResponse()
                .then()
                .body("id", equalTo(
                        Integer.parseInt(context.getBookId())
                ));
    }

    @Then("the response should contain an appropriate error message")
    public void validateErrorMessage() {
        context.getResponse()
                .then()
                .body("message", not(emptyOrNullString()));
    }
}