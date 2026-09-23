package com.example.model.Planeta;

import com.example.interfaces.Rotacao;
import com.example.interfaces.SuperficeRochosa;
import com.example.interfaces.Translacao;

public class Terra extends Planeta implements Rotacao, Translacao, SuperficeRochosa  {

    public Terra(){
            super("6 septilhões de kg", 
            3, 
            new String[]{"Oxigênio", "Silício", "Ferro"}, 
            "Terra"
        );
    }

    @Override
    public void MovimentoRotacao(){
     System.out.println("A Terra realiza rotação em torno de seu próprio eixo, demorando 24 horas");
    };

    @Override
    public void MovimentoTranslacao(){
        System.out.println("A Terra realiza translação em torno do Sol, demorando 365 dias e 6 horas");
    };

    @Override
    public void ContemRocha(){
        System.out.println("A Terra tem superficie rochosa");
    };
    
}
