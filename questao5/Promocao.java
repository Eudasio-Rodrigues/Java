/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao5;

/**
 *
 * @author eudasio
 */
public class Promocao  extends Geral{

    public Promocao(String titulo, String categoria) {
        super(titulo, categoria);
    }


    @Override
    public float precoLocacao() {
        return super.getPreco()-2;
    }

    public void ImprimirInformacoes(){
        System.out.println("Titulo do filme: "+this.getTitulo()
                + "\nCategoria: "+this.getCategoria()
                + "\nPreco da locacao: " +precoLocacao());
        System.out.println("\n");
    }
}
