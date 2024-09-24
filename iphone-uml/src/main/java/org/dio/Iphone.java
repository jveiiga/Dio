package org.dio;

import org.dio.funcionalidades.AparelhoTelefonico;
import org.dio.funcionalidades.NavegadorInternet;
import org.dio.funcionalidades.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {
        System.out.println("No reprodutor musical");
        ReprodutorMusical reprodutor = new ReprodutorMusical();
        reprodutor.selecionarMusica("Lose Control - Teddy Swims");
//        reprodutor.tocar();
//        reprodutor.pausar();
        System.out.println("-----------------------------------");

        System.out.println("No telefone");
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("913235585");
//        telefone.atender();
//        telefone.iniciarCorreioVoz();
        System.out.println("-----------------------------------");

        System.out.println("No navegador");
        NavegadorInternet navegador = new NavegadorInternet();
        navegador.exibirPagina("google.com");
//        navegador.atualizarPagina();
//        navegador.adicionarNovaAba();
        System.out.println("-----------------------------------");
    }
}


