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
        registry.addMapping("/**")  // Permitir todas las rutas
                .allowedOrigins("https://virutal-vault.netlify.app")  // Permitir el origen de Netlify
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Permitir los métodos relevantes
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true);  // Permitir cookies y credenciales si es necesario
    }
}
