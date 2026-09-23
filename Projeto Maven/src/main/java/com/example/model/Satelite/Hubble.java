package com.example.model.Satelite;

public class Hubble extends SateliteArtificial{
    private String descoberta = "O Hubble confirmou a existência de buracos negros supermassivos no centro da maioria das galáxias.";;

    public Hubble(){
        super(
            new String[]{"Fotografar", "Comunicar-se com a Terra"},
            "Hubble"
        );
    }

    public void Curiosidade(){
        System.out.println(this.descoberta);
    }


}
