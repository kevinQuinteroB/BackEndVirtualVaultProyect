package com.example.demo.demo_backend.controllers;

import com.example.demo.demo_backend.models.Generos;
import com.example.demo.demo_backend.services.impl.GeneroServiceImpl;
import com.example.demo.demo_backend.services.interfaces.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/generos")
@CrossOrigin(origins = "https://virutal-vault.netlify.app", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS})
public class GenerosController {

    private GeneroService generoService;

    @GetMapping("/all")
    public ResponseEntity<Object> retunListaPaises(){
        return ResponseEntity.ok(generoService.retunall());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Generos> retunGenerosJuego(@PathVariable Long id) {
        Generos generos = generoService.encontrarByID(id);
        return ResponseEntity.ok(generos);
    }

    @Autowired
    public void setGeneroService(GeneroService generoService) {
        this.generoService = generoService;
    }

    @RequestMapping(value = "/**", method = RequestMethod.OPTIONS) public ResponseEntity<?> handleOptions() { return ResponseEntity.ok().build();
    }
}
