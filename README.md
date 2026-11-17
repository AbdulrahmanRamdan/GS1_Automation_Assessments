# GS1 Automation Assessments

A Java-based test automation framework designed to support **Web UI Automation** and **REST API Testing** using industry-standard testing tools and automation practices.

The project demonstrates a structured, reusable, and maintainable approach to automated testing, combining Behavior-Driven Development (BDD), UI automation, API validation, and test reporting.

## Project Overview

This framework brings Web and API automation together in a single Maven project while keeping their implementation organized into separate components.

### Main Automation Areas

**1. Web UI Automation**
- Automated browser testing using Selenium WebDriver.
- BDD scenarios using Cucumber.
- Test execution and management using TestNG.
- Reusable automation components and maintainable test structure.
- Automated test execution through Maven.

**2. REST API Automation**
- API testing using Rest Assured.
- Validation of HTTP status codes and response bodies.
- GET request testing and response validation.
- Reusable API client and service layers.
- Configuration management for API endpoints.
- Scenario-level test data management using Scenario Context.

## Technology Stack

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Maven | Build and dependency management |
| Selenium WebDriver | Web UI automation |
| Rest Assured | REST API automation |
| Cucumber | BDD and Gherkin scenarios |
| TestNG | Test execution and assertions |
| Allure Reports | Test execution reporting |
| Git & GitHub | Version control and source management |
| IntelliJ IDEA | Development environment |

##  Framework Architecture

The framework follows a modular structure to separate test scenarios, step definitions, reusable services, and configuration.

```text
GS1_Automation_Assessments
│
├── src
│   ├── main
│   │   └── java
│   │       ├── API_java
│   │       │   ├── BaseApiClient.java
│   │       │   ├── BookService.java
│   │       │   ├── ConfigManager.java
│   │       │   └── ScenarioContext.java
│   │       │
│   │       └── web
│   │
│   └── test
│       ├── java
│       │   ├── stepdefinitions
│       │   └── runners
│       │
│       └── resources
│           ├── features
│           └── config
│               └── api.properties
│
├── pom.xml
└── README.md


*Note: This is an illustrative architecture. Adjust the package and file names to match the actual repository structure.*


---

*Built as part of the GS1 Automation Assessments.*
