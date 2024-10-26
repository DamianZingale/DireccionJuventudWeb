FROM openjdk:17-jdk-slim

# Usamos el nombre correcto del archivo .jar generado
COPY target/app_estudiantes-0.0.1.jar /app_estudiantes.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app_estudiantes.jar"]