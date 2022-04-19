FROM openjdk:11-jre-slim

WORKDIR /app

ARG JAR_FILE

COPY target/${JAR_FILE} /app/auth.jar

EXPOSE 8081

CMD ["java", "-jar", "auth.jar"]