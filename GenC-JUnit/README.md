# Maven JUnit4 Project

This project is a simple Maven application that demonstrates the use of JUnit 4 for unit testing.

## Project Structure

```
my-maven-junit4-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── App.java
│   │   └── resources
│   │       └── application.properties
│   ├── test
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── AppTest.java
│   │   └── resources
├── pom.xml
└── README.md
```

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Apache Maven 3.6 or higher

## Building the Project

To build the project, navigate to the project directory and run the following command:

```
mvn clean install
```

## Running the Application

To run the application, use the following command:

```
mvn exec:java -Dexec.mainClass="com.example.App"
```

## Running Tests

To run the unit tests, use the following command:

```
mvn test
```

## Dependencies

This project uses the following dependencies:

- JUnit 4 for unit testing

## License

This project is licensed under the MIT License.