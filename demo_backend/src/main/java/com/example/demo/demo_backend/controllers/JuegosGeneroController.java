package com.example.demo.demo_backend.controllers;

import com.example.demo.demo_backend.models.JuegosGenero;
import com.example.demo.demo_backend.services.impl.JuegosGeneroServiceImpl;
import com.example.demo.demo_backend.services.interfaces.JuegosGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/juegosGenero")
@CrossOrigin(origins = "https://virutal-vault.netlify.app", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class JuegosGeneroController {

    private JuegosGeneroService juegosGeneroService;

    @GetMapping("{id}")
    public ResponseEntity<List<JuegosGenero>> retunGenerosJuego(@PathVariable Long id) {
        List<JuegosGenero> juegosGenero = juegosGeneroService.EncontrarByID(id);
        return ResponseEntity.ok(juegosGenero);
    }

    @Autowired
    public void setJuegosGeneroService(JuegosGeneroService juegosGeneroService) {
        this.juegosGeneroService = juegosGeneroService;
    }
}
