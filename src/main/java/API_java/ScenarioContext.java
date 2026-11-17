package API_java;

import io.restassured.response.Response;

public class ScenarioContext {

    private Response response;
    private String bookId;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}