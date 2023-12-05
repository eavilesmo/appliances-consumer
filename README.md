## Appliances Consumer Program

The "appliances-consumer" application is a Spring Boot-based service that interacts with RabbitMQ to receive messages related to household
appliances. Follow the steps below to launch the application and make a sample request.

## Prerequisites

Please follow the instructions to get the appliances-producer program running before executing this one.

## 2. Launch the Spring Boot Application

Follow these steps to run the "appliances-consumer" application:
Clone this repository or download the source code.
Navigate to the project directory and run the following command:

```bash
./gradlew bootRun # if you are using Gradle
./mvnw spring-boot:run # if you are using Maven
```

This will start the Spring Boot application on the default port.

After you make a request to the appliances-producer program, you will receive a notification like the following:

```bash
example notification
```

And done! You have configured the consumer application to receive messages.
