package com.example.model.Planeta;

import java.util.Arrays;


public class Planeta {
    protected String massa;
    protected Integer posicaoOrbita;
    protected String[] principaisElementos;
    protected String nome;

    protected Planeta(String massa, Integer posicaoOrbita, String[] principaisElementos, String nome){
        this.massa = massa;
        this.posicaoOrbita = posicaoOrbita;
        this.principaisElementos = principaisElementos; 
        this.nome = nome;
    }

    public void ElementosDoPlaneta(){
        System.out.println("O planeta "+this.nome+" tem como os 3 principais componentes "+ Arrays.toString(this.principaisElementos));
    }
}
