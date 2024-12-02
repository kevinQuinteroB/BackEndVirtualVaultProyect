# Usar una imagen base con JDK 17 (ajusta según tu versión de Java)
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo en el contenedor
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY target/demo_backend-0.0.1-SNAPSHOT.jar /app/demo_backend.jar

# Exponer el puerto de la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app/demo_backend.jar"]
