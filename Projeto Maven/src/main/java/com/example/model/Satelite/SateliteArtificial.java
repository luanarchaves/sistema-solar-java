package com.example.model.Satelite;

import java.util.Arrays;

class SateliteArtificial extends Satelite{
    private String[] tecnologias;
    private String nome;

    public SateliteArtificial(String[] tecnologias, String nome){
        this.tecnologias = tecnologias;
        this.nome = nome;
    };

    void setTecnologias(String[] tecnologias){
        this.tecnologias = tecnologias;
    };

    public void Funções(){
        System.err.println("O satelite artificiai "+this.nome+" tem a capacidade de: " + Arrays.toString(this.tecnologias));
    }

    @Override
    public void Orbitar(){
        System.out.println("Satelites Artificiais orbitam planetas ou navegam pelo espaço");
    }


}

