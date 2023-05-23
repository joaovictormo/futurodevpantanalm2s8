package com.example.demo.repositories;

import com.example.demo.models.Genero;
import com.example.demo.models.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicaRepository extends JpaRepository<Musica, Integer> {

    public List<Musica> findByGenero(Genero genero);
}
