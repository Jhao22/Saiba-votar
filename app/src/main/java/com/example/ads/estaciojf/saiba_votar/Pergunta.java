package com.example.ads.estaciojf.saiba_votar;

public class Pergunta {

    public int Id;
    public String Texto;

    public Pergunta() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Pergunta(int Id, String Texto) {
        this.Id = Id;
        this.Texto = Texto;
    }

    @Override
    public String toString() {
        return this.Texto;
    }
}