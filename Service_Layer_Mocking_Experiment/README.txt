SERVICE LAYER DEPENDENCY MOCKING IN UNIT TESTS

Aim:
Test the UserController independently by mocking UserService with Mockito
and verifying the HTTP 200 response using JUnit 5 and MockMvc.

Requirements:
- Java 17
- Maven
- Spring Boot 3.5.7

Run the unit test:
1. Import this folder into Spring Tool Suite as an Existing Maven Project.
2. Wait for Maven dependencies to download.
3. Open UserControllerTest.java.
4. Right-click -> Run As -> JUnit Test.

Or run from a terminal in the project folder:
    mvn test

Expected test result:
    Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
    BUILD SUCCESS

Expected response checked by the test:
{
  "id": 1,
  "username": "Vanisha",
  "email": "vanisha@gmail.com"
}

Important:
- This experiment requires JUnit + Mockito controller unit testing.
- @WebMvcTest loads the MVC/controller test slice.
- @MockitoBean supplies a mock UserService bean.
- No database connection is required for this test.
- Postman is optional and is not a substitute for this mocked unit test.
- The application.properties file is included, but no database settings are needed.
