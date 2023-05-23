package com.example.demo.services;

import com.example.demo.models.Genero;
import com.example.demo.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository repository;
    public void cadastraGenero(Genero novoGenero) {
        repository.save(novoGenero);
    }
}
