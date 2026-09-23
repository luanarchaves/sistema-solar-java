package com.example.service;

import com.example.model.Estrela.Sol;
import com.example.model.Planeta.Terra;
import com.example.model.Planeta.Marte;
import com.example.model.Planeta.Jupiter;
import com.example.model.Satelite.Lua;
import com.example.model.Satelite.Hubble;

public class Services {

    public void InformacoesPlaneta(){
        System.out.println("🌍 === INFORMAÇÕES SOBRE PLANETAS === 🌍");
        System.out.println();

        // Terra
        Terra terra = new Terra();
        System.out.println("🟢 PLANETA TERRA:");
        terra.ElementosDoPlaneta();
        terra.MovimentoRotacao();
        terra.MovimentoTranslacao();
        terra.ContemRocha();
        System.out.println();

        // Marte
        Marte marte = new Marte();
        System.out.println("🔴 PLANETA MARTE:");
        marte.ElementosDoPlaneta();
        marte.MovimentoRotacao();
        marte.MovimentoTranslacao();
        marte.ContemRocha();
        System.out.println();

        // Jupiter
        Jupiter jupiter = new Jupiter();
        System.out.println("🟡 PLANETA JÚPITER:");
        jupiter.ElementosDoPlaneta();
        jupiter.MovimentoRotacao();
        jupiter.MovimentoTranslacao();
        jupiter.ContemGas();
        System.out.println();
        
        return;
    }

    public void InformacoesEstrelas(){
        System.out.println("☀️ === INFORMAÇÕES SOBRE ESTRELAS === ☀️");
        System.out.println();

        Sol sol = new Sol();
        System.out.println("🌞 ESTRELA SOL:");
        sol.setCor();
        sol.FusaoNuclear();
        sol.ContemGas();
        System.out.println();

        return;
    }

    public void InformacoesSatelites(){
        System.out.println("🌙 === INFORMAÇÕES SOBRE SATÉLITES === 🌙");
        System.out.println();

        // Lua (Satélite Natural)
        Lua lua = new Lua();
        System.out.println("🌕 SATÉLITE NATURAL - LUA:");
        lua.Orbitar();
        lua.MovimentoRotacao();
        lua.MovimentoTranslacao();
        System.out.println();

        // Hubble (Satélite Artificial)
        Hubble hubble = new Hubble();
        System.out.println("🔭 SATÉLITE ARTIFICIAL - HUBBLE:");
        hubble.Orbitar();
        hubble.Funções();
        hubble.Curiosidade();
        System.out.println();

        return;
    }

}
