package com.example.senacbet.model;

public class Apostador {

    private String nome;
    private String saldo;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String endereco) { this.email = email; }


    @Override
    public String toString() {
        return nome;
    }

    public void add(Apostador apostador) {
    }
}

