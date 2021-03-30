# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8082

# The application's jar file
ARG JAR_FILE=target/foo-microservice-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
COPY ${JAR_FILE} foo-microservice.jar

# Run the jar file
ENTRYPOINT ["java","-jar","foo-microservice.jar"]