package com.example.controller;

import com.example.service.Services;

public class Controller {
    
    public void executarOpcao(char opcao){

        Services service = new Services();

        switch (opcao) {
            case '1': 
            System.out.println("Voce escolheu saber mais sobre planetas");
            System.out.println();
            service.InformacoesPlaneta();
            break;
        case '2': 
            System.out.println("Voce escolheu saber mais sobre estrelas");
            System.out.println();
            service.InformacoesEstrelas();
            break;
            case '3': 
            System.out.println("Voce escolheu saber mais sobre satelites");
            System.out.println();
            service.InformacoesSatelites();
            break;
        default:
            break;
        }
    }
}
