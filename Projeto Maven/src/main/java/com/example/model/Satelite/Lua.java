package com.example.model.Satelite;
import com.example.interfaces.Rotacao; 
import com.example.interfaces.Translacao;

public class Lua extends SateliteNatural implements Rotacao, Translacao{

    public Lua(){
        super(
            "73 quintilhões de toneladas"
        );
    };

    @Override
    public void MovimentoRotacao(){
     System.out.println("A Lua realiza rotação em torno de seu próprio eixo, na qual esta quase sicronizado com o tempo de rotação da Terra, fazendo a gente observar o mesmo lado da Lua");
    };

    @Override
    public void MovimentoTranslacao(){
        System.out.println("A Lua realiza translação em torno da Terra, demorando 27,3");
    };
}
