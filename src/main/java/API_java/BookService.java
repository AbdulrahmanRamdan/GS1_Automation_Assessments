package API_java;


import io.restassured.response.Response;

public class BookService extends BaseApiClient {

    private static final String BOOKS_ENDPOINT = "/books";

    public Response getAllBooks() {
        return get(BOOKS_ENDPOINT);
    }

    public Response getBookById(int id) {
        return get(BOOKS_ENDPOINT + "/" + id);
    }

    public Response createBook(Object book) {
        return post(BOOKS_ENDPOINT, book);
    }

    public Response updateBook(int id, Object book) {
        return put(BOOKS_ENDPOINT + "/" + id, book);
    }

    public Response deleteBook(int id) {
        return delete(BOOKS_ENDPOINT + "/" + id);
    }
}