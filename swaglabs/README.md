# SwagLabs Test Automation Project

This project contains automated tests for the SwagLabs e-commerce application using Cucumber, Selenium WebDriver, and Java.

## Project Structure

```
swaglabs/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── swaglabs/
│   │               └── utils/
│   │                   ├── ConfigReader.java
│   │                   └── Driver.java
│   └── test/
│       ├── java/
│       │   └── com/
│       │       └── swaglabs/
│       │           └── steps/
│       │               ├── LoginSteps.java
│       │               └── ProductSteps.java
│       └── resources/
│           ├── config/
│           │   └── config.properties
│           └── features/
│               └── product.feature
└── pom.xml
```

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher
- Chrome browser installed

## Dependencies

- Cucumber
- Selenium WebDriver
- JUnit
- Maven

## Configuration

The project configuration is stored in `src/test/resources/config/config.properties`:
```properties
# User Credentials
username=standard_user
password=secret_sauce

# Application URL
base.url=https://www.saucedemo.com/
```

## Running Tests

### Run all tests
```bash
mvn test
```

### Run specific tagged tests
```bash
# Run highest product tests
mvn test -Dcucumber.filter.tags="@highestproduct"

# Run regression tests
mvn test -Dcucumber.filter.tags="@regression"

# Run cart tests
mvn test -Dcucumber.filter.tags="@cart"
```

## Test Scenarios

### Product Management
- Finding highest priced product
- Adding product to cart

## Tags

- `@all`: All tests
- `@highestproduct`: Highest product related tests
- `@regression`: Regression test suite
- `@cart`: Cart functionality tests

## Author

Annapurna Badiger 