package com.example.demo.controllers;

import com.example.demo.dtos.MusicaCadastroDTO;
import com.example.demo.dtos.MusicasGetRequestDTO;
import com.example.demo.models.Musica;
import com.example.demo.services.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(value = "/musicas")
public class MusicaController {

    @Autowired private MusicaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void cadastraMusica(@RequestBody MusicaCadastroDTO novaMusica){
        service.cadastra(novaMusica);
    }

    @GetMapping
    public ResponseEntity<List<Musica>> buscaMusicas(@RequestParam MusicasGetRequestDTO getRequestDTO) {
        List<Musica> musicas = service.busca(getRequestDTO);

        return new ResponseEntity<>(musicas, HttpStatus.OK);
    }
}
