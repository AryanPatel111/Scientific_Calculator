FROM openjdk:11

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/javaCalc-with-dependencies.jar /app/

# docker exec -it <container-id> /bin/bash    -- to run the container
# java -cp javaCalc-with-dependencies.jar org.example.Main       -- to run the jar file