package com.example.demo.demo_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.addAllowedOrigin("*"); // Permite cualquier origen
        corsConfiguration.addAllowedHeader("*"); // Permite cualquier encabezado
        corsConfiguration.addAllowedMethod("*"); // Permite cualquier método HTTP
        corsConfiguration.setAllowCredentials(true); // Permite credenciales si es necesario

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration); // Aplica la configuración a todas las rutas

        return new CorsFilter(source);
    }
}
