package com.example.demo.demo_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // Configuración global de CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Permite solicitudes desde cualquier origen (puedes especificar orígenes si lo deseas)
        registry.addMapping("/**")  // Aplícalo a todas las rutas
                .allowedOrigins("*")  // Permite todos los orígenes
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Permite estos métodos HTTP
                .allowedHeaders("Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization")  // Permite todos los encabezados
                .allowCredentials(true);  // Permite enviar cookies o autenticación
    }
}
