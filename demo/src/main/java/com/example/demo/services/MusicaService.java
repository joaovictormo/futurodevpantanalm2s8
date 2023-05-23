package com.example.demo.services;

import com.example.demo.dtos.MusicaCadastroDTO;
import com.example.demo.dtos.MusicasGetRequestDTO;
import com.example.demo.models.Genero;
import com.example.demo.models.Musica;
import com.example.demo.repositories.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaService {

    @Autowired private MusicaRepository repository;

    public List<Musica> busca(MusicasGetRequestDTO params) {
        if (params != null) {
            if (params.getGeneroId() != null){
                Genero genero = new Genero();
                genero.setId(params.getGeneroId());
                return repository.findByGenero(genero);
            } else if (params.getPossuiGenero() != null) {
                // return repository.findByPossuiGenero(params.getPossuiGenero());
            }
        }

        return repository.findAll();
    }

    public void cadastra(MusicaCadastroDTO novaMusicaDTO) {
        Musica novaMusica = dtoToModel(novaMusicaDTO);
        repository.save(novaMusica);
    }

    private Musica dtoToModel(MusicaCadastroDTO dto) {
        Musica musica = new Musica();
        musica.setNome(dto.getNome());
        musica.setInterprete(dto.getInterprete());
        musica.setDuracaoEmSegundos(dto.getDuracaoEmSegundos());
        Genero genero = new Genero();
        genero.setId(dto.getGeneroId());
        musica.setGenero(genero);

        return musica;
    }
}
