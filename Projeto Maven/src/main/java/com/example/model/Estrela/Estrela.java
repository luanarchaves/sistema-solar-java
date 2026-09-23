package com.example.model.Estrela;

abstract class Estrela {
    protected Double[] temperaturaMaxMin;
    protected String massa;
    protected String[] principaisElementos;

    protected Estrela(String[] principaisElementos, Double[] temperaturaMaxMin, String massa) {
        //apenas na superclasse escreve parametro na assinatura
        this.temperaturaMaxMin = temperaturaMaxMin;
        this.massa = massa;
        this.principaisElementos = principaisElementos; 
    }

    abstract void setCor();

    public void FusaoNuclear(){
        System.out.println("Estrelas realizam a fusão nuclear, elas queimam seus proprios elementos, criando energia, que emite luz");
    }

}


