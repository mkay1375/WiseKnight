FROM openjdk:17-alpine

COPY target/WiseKnight-*.jar /app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]