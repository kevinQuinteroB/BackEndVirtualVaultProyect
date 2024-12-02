# Usar una imagen base con JDK 17 (ajusta según tu versión de Java)
FROM amazoncorretto:17-alpine-jdk

# Copiar el archivo JAR al contenedor
COPY demo_backend/target/demo_backend-0.0.1-SNAPSHOT.jar app.jar

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "/app.jar"]
