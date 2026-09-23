package com.example.model.Estrela; 

import com.example.interfaces.SuperficeGasosa; 

public class Sol extends Estrela implements SuperficeGasosa{

    //construtor da subclasse
    public Sol() {
        super(
            //ao declarar objetos e array é necessario colocar new
            new String[]{"Hélio","Hidrogenio"},
            new Double[]{5.500, 15.000000},
            "2 nonilhões de kg"
        );
    }
        
    @Override
    public void setCor(){
        System.out.println("A cor do Sol é laranja");
    }

    @Override
    final public void ContemGas(){
        System.out.println("O Sol é composto por gases como: ");
        for(String palavra : principaisElementos){
            System.out.println(palavra);
        } ;  
    };
    
}
