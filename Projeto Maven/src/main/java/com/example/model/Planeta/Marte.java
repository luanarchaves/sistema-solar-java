package com.example.model.Planeta;

import com.example.interfaces.Rotacao;
import com.example.interfaces.SuperficeRochosa;
import com.example.interfaces.Translacao;

public class Marte extends Planeta implements Rotacao, Translacao, SuperficeRochosa  {

    public Marte(){
        super(
            "642 sextilhões de kg", 
            4, 
            new String[]{"Ferro", "Oxigênio", "Silício"},
            "Marte"
        );
    }

    @Override
    public void MovimentoRotacao(){
     System.out.println("Marte realiza rotação em torno de seu próprio eixo, demorando 24 horas e 37 minutos");
    };

    @Override
    public void MovimentoTranslacao(){
        System.out.println("Marte realiza translação em torno do Sol, demorando 687 dias terrestres");
    };
    
    @Override
    public void ContemRocha(){
        System.out.println("Marte tem superficie rochosa");
    };
    

}
