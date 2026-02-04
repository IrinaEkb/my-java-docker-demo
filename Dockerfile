FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY src/ .

RUN javac main/java/com/example/App.java

CMD ["java", "-cp", "main/java", "com.example.App"]
