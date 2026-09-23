package com.example.model.Planeta;

import com.example.interfaces.Rotacao;
import com.example.interfaces.SuperficeGasosa;
import com.example.interfaces.Translacao;

public class Jupiter extends Planeta implements Rotacao, Translacao, SuperficeGasosa  {


    public Jupiter(){
        super(
            "642 sextilhões de kg", 
            4, 
            new String[]{"Hidrogênio", "Hélio", "Metano"},
            "Jupiter"
        );
    }

    @Override
    public void MovimentoRotacao(){
     System.out.println("Marte realiza rotação em torno de seu próprio eixo em 9 horas e 56 minutos");
    };

    @Override
    public void MovimentoTranslacao(){
        System.out.println("Marte realiza translação em torno do Sol, demorando 4.333 dias terrestres");
    };
    
    @Override
    final public void ContemGas(){
        System.out.println("Jupiter é um planeta gasoso composto por: ");
        for(String palavra : principaisElementos){
            System.out.println(palavra);
        } ;  
    };
    

}
