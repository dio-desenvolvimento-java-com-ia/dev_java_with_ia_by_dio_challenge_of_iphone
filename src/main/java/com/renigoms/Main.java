package com.renigoms;

import com.renigoms.model.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.selecionarMusica("Gun's N' Roses - Civil War");
        iphone.tocar();
        iphone.pausar();
    }
}