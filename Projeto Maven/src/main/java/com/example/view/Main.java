package com.example.view;
import com.example.controller.Controller;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {   
        
        System.out.println("Olá, tudo bem? Voce gostaria de conhecer mais sobre astronomia? Escreva 1 para saber mais sobre planetas, escreva 2 para estrelas e escreva 3 para satelites.");
        
        Scanner leitor = new Scanner(System.in);
        char opcao = leitor.next().charAt(0);
        leitor.close();

        Controller controller = new Controller();
        controller.executarOpcao(opcao);
    
    }
}