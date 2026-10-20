package com.example.DataBase.model;

import jakarta.persistence.*;

import java.util.List;

public class Raca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cod;
    private String porte;
    private String cor;
    private String nome;
    @OneToMany(mappedBy = "raca",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Animal> animais;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
