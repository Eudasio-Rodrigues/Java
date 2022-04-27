/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao5;

/**
 *
 * @author eudasio
 */
public class Lancamento extends Geral {

    public Lancamento(String titulo, String categoria) {
        super(titulo, categoria);
    }


    public float precoLocacao(){
        return getPreco()+3;
    }

    public void ImprimirInformacoes(){
        System.out.println("Titulo do filme: "+this.getTitulo()
                            + "\nCategoria: "+this.getCategoria()
                            + "\nPreco da locacao: " +precoLocacao());
        System.out.println("\n");
    }
}
