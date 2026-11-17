
package API_java;


import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseApiClient {

    protected RequestSpecification requestSpec;

    public BaseApiClient() {
        requestSpec = given()
                .baseUri("baseUrl")
                .contentType("application/json")
                .accept("application/json");
    }

    protected Response get(String endpoint) {
        return given()
                .spec(requestSpec)
                .when()
                .get(endpoint);
    }

    protected Response post(String endpoint, Object body) {
        return given()
                .spec(requestSpec)
                .body(body)
                .when()
                .post(endpoint);
    }

    protected Response put(String endpoint, Object body) {
        return given()
                .spec(requestSpec)
                .body(body)
                .when()
                .put(endpoint);
    }

    protected Response delete(String endpoint) {
        return given()
                .spec(requestSpec)
                .when()
                .delete(endpoint);
    }
}
