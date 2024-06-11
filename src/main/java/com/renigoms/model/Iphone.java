package com.renigoms.model;

import com.renigoms.interfaces.AparelhoTelefonico;
import com.renigoms.interfaces.NavegadorInternet;
import com.renigoms.interfaces.ReprodutorMusicalI;

public class Iphone implements ReprodutorMusicalI, AparelhoTelefonico, NavegadorInternet{

    @Override
    public void exibirPagina(String url) {
        System.out.printf("A página endereçada em %s foi exibida\n", url);
    }

    @Override
    public void adicionarNovaAba() {
       System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada!");
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida!");
    }

    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para " + numero);
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado!");
    }

    @Override
    public void tocar() {
        System.out.println("Música tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
    
}
