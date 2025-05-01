# Etapa 1: Build con Gradle
FROM gradle:8.4-jdk17 AS build

# Copiamos todo el proyecto
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project

# Compilamos el proyecto (incluyendo test)
RUN ./gradlew clean build -x test

# Etapa 2: Imagen final con JDK 17
FROM eclipse-temurin:17-jdk-alpine

# Directorio en el contenedor
WORKDIR /app

# Copiamos el JAR compilado desde la etapa anterior
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

# Exponer el puerto si tu app escucha (Spring Boot usa 8080 por defecto)
EXPOSE 8080

# Comando para ejecutar la app
ENTRYPOINT ["java", "-jar", "app.jar"]