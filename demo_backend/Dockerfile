# Usar una imagen base con Maven y OpenJDK 21
FROM maven:3.8.4-openjdk-17 AS build

# Establecer un directorio de trabajo
WORKDIR /app

# Copiar el archivo pom.xml y las dependencias
COPY pom.xml /app/
RUN mvn dependency:go-offline

# Copiar
COPY src /app/src

# Ejecutar Maven para construir el proyecto
RUN mvn clean package -DskipTests

# Crear una nueva imagen basada en OpenJDK 21 (solo JRE para ejecución)
FROM openjdk:17-jre-slim

# Exponer el puerto que utilizará la aplicación
EXPOSE 8080

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /app/target/demo_backend-0.0.1-SNAPSHOT.jar /app/demo_backend-0.0.1-SNAPSHOT.jar

# Establecer el punto de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demo-0.0.1-SNAPSHOT.jar"]
