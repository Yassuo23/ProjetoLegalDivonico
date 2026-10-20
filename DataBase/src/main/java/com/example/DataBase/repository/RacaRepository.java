package com.example.DataBase.repository;

import com.example.DataBase.model.Raca;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RacaRepository extends JpaRepository<Raca, Integer> {
    List<Raca> findByNome(String nome);
}
