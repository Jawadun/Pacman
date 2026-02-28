FROM eclipse-temurin:11-jdk

WORKDIR /app

COPY src/ ./src/

RUN mkdir -p out && javac -d out src/*.java
