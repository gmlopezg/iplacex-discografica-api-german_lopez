# STAGE 1
FROM gradle:jdk21 as builder

WORKDIR /app

COPY build.gradle settings.gradle gradlew ./
COPY gradle/ gradle/

COPY src ./src

RUN chmod +x gradlew && ./gradlew build --no-daemon

# STAGE 2

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=builder /app/build/libs/*.jar discografia-1.jar

EXPOSE 443

CMD ["java", "-jar", "discografia-1.jar", "--server.port=${PORT}"]
