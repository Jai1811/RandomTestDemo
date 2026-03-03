## Selenium TestNG Boilerplate

This project is a **Java Selenium + TestNG** boilerplate designed for quickly building and running UI automation tests using Maven.

### Tech stack
- **Language**: Java 17
- **Build tool**: Maven (`pom.xml`)
- **Test framework**: TestNG
- **UI automation**: Selenium WebDriver
- **Driver management**: WebDriverManager

### Project structure
- **`pom.xml`**: Maven configuration and dependencies.
- **`src/test/java`**:
  - `testcases` – TestNG test classes.
  - `testpages` – Page Object Model (POM) classes.
  - `webelements` – Element locators / page fragments.
  - `testutils` – Utilities such as `DriverManager` and config helpers.
- **`src/test/resources/settings.properties`** – Test configuration (URL, username, password).
- **`testng.xml`** – TestNG suite configuration.

### Prerequisites
- Java 17 or later installed and on your `PATH`.
- Maven 3.x installed (`mvn -v` should work).
- A modern browser (e.g. Chrome) – drivers are handled by WebDriverManager.

### Setup
1. **Clone the repository**
   ```bash
   git clone <REPLACE_WITH_REPO_URL>
   cd randomTest
   ```

2. **Configure test settings**
   Update `src/test/resources/settings.properties` with your environment details:
   ```properties
   URL=<your_application_url>
   Username=<your_username>
   Password=<your_password>
   ```

3. **Download dependencies**
   ```bash
   mvn clean compile
   ```

### Running tests

- **Run the full TestNG suite (using `testng.xml`):**


### Common customizations
- **Add new test cases**: create new classes under `src/test/java/testcases` and wire them into `testng.xml` or use TestNG annotations/groups.
- **Add new pages**: create new Page Object classes under `src/test/java/testpages` and share locators via `webelements` if desired.
- **Change browser / capabilities**: adjust the logic in `testutils/DriverManager.java` (e.g. Chrome, Firefox, headless mode).

### IDE usage
You can import this project as a **Maven project** into IntelliJ IDEA, Eclipse, or VS Code. Once imported, run tests either:
- via Maven goals (`mvn test`), or
- directly from the IDE using TestNG run configurations.

### Notes
- Avoid committing real credentials in `settings.properties`. Use placeholder values or environment-specific overrides.
- This repository is intended as a starting point; extend the page objects, utilities, and test suites to match your application under test.

