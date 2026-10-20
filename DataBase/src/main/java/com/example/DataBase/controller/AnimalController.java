package com.example.DataBase.controller;

import com.example.DataBase.model.Animal;
import com.example.DataBase.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiAnimal")
public class AnimalController {

    @Autowired
    AnimalRepository animalRepository;

    @GetMapping("/todos")
    public List<Animal> buscarTodos(){
        return  animalRepository.findAll();
    }

    @GetMapping("/buscarId/{cod}")
    public Optional<Animal> buscarCod(@PathVariable int cod){
        return animalRepository.findById(cod);
    }

    @GetMapping("/buscarNome/{nome}")
    public List<Animal> buscarNome(@PathVariable String nome){
        return animalRepository.findByNome(nome);
    }

    @GetMapping("/buscarIdadeMaiorQue/{idade}")
    public List<Animal> buscarIdadeGreaterThan(@PathVariable int idade){
        return animalRepository.findByIdadeGreaterThan(idade);
    }
    @GetMapping("/buscarNomeCom/{nome}")
    public List<Animal> buscarNomeStartingWith(@PathVariable String nome){
        return animalRepository.findByNomeStartingWith(nome);
    }
    @GetMapping("/buscarMaisVelhos")
    public List<Animal> buscarTop3ByOrderByIdadeDesc(){
        return animalRepository.findTop3ByOrderByIdadeDesc();
    }

    @PostMapping("/cadastrar")
    public Animal cadastrar(@RequestBody Animal animal) {
        return animalRepository.save(animal);
    }

    @DeleteMapping("/deletar/{cod}")
    public void deletar(@PathVariable int cod){
        animalRepository.deleteById(cod);
    }


}

