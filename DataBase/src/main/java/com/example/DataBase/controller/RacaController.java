package com.example.DataBase.controller;

import com.example.DataBase.model.Raca;
import com.example.DataBase.repository.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiRaca")
public class RacaController {

    @Autowired
    RacaRepository racaRepository;

    @GetMapping("/todos")
    public List<Raca> buscarTodos()
    {
        return  racaRepository.findAll();
    }

    @GetMapping("/buscarRa/{ra}")
    public Optional<Raca> buscarCod(@PathVariable int cod)
    {
        return racaRepository.findById(cod);
    }

    @GetMapping("/buscarNome/{nome}")
    public List<Raca> buscarNome(@PathVariable String nome)
    {
        return racaRepository.findByNome(nome);
    }


    @PostMapping("/cadastrar")
    public Raca cadastrar(@RequestBody Raca raca) {
        return racaRepository.save(raca);
    }

}

