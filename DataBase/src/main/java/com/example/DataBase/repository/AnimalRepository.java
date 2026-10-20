package com.example.DataBase.repository;

import com.example.DataBase.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository <Animal, Integer> {
    public List<Animal> findByNome(String nome);
    public List<Animal> findByIdadeGreaterThan(int idade);
    public List<Animal> findByNomeStartingWith(String nome);
    public List<Animal> findTop3ByOrderByIdadeDesc();
}
