package com.example.demo.controllers;

import com.example.demo.models.Genero;
import com.example.demo.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired private GeneroService service;

    @PostMapping
    public void cadastraGenero(@RequestBody Genero novoGenero) {
        service.cadastraGenero(novoGenero);
    }
}
