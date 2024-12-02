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

        // Permite solicitudes de todos los orígenes (o puedes especificar un solo dominio si quieres restringir el acceso)
        corsConfiguration.addAllowedOrigin("virutal-vault.netlify.app");  // Origen específico de Netlify

        // Permite todos los encabezados
        corsConfiguration.addAllowedHeader("*");

        // Permite todos los métodos
        corsConfiguration.addAllowedMethod("*");

        // Permite credenciales (cookies o autenticación basada en sesiones)
        corsConfiguration.setAllowCredentials(true);

        // Configuración para manejar preflight requests (OPTIONS)
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfiguration);

        return new CorsFilter(source);
    }
}
