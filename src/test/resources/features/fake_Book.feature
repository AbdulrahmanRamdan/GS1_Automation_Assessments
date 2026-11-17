Feature: Bookstore API Management
  Background:

  @smoke @positive
  Scenario: Retrieve all available books
    When I send a GET request to retrieve all books
    Then the response status code should be 200
    And the response should contain a list of books

  @smoke @positive
  Scenario: Retrieve a book using a valid ID
    Given a valid book ID "1"
    When I send a GET request to retrieve the book
    Then the response status code should be 200
    And the response should contain the requested book ID

  @negative
  Scenario: Retrieve a book using an invalid ID
    Given an invalid book ID "-999"
    When I send a GET request to retrieve the book
    Then the response status code should be 404
    And the response should contain an appropriate error message