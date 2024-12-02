package com.example.demo.demo_backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    // Configuración global de CORS
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("https://virutal-vault.netlify.app")  // Asegúrate de que la URL de Netlify sea la correcta
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")  // Asegúrate de permitir OPTIONS
                .allowedHeaders("*")  // Permitir todos los encabezados
                .allowCredentials(true);  // Permitir cookies y credenciales si es necesario
    }

    // Configuración de seguridad (para permitir solicitudes sin autenticación si es necesario)
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Deshabilitar CSRF si es necesario para pruebas
                .authorizeRequests()
                .anyRequest().permitAll();  // Permitir todas las solicitudes

        return http.build();
    }
}
