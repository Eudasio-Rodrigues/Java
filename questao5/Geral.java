/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao5;

/**
 *
 * @author eudasio
 */
public class Geral {
    private String titulo;
    private String categoria;
    private float preco=4;

    public Geral(String titulo, String categoria){
        this.titulo=titulo;
        this.categoria=categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float precoLocacao(){
        return getPreco();
    }

    public void ImprimirInformacoes(){
        System.out.println("Titulo do filme: "+titulo
                + "\nCategoria: "+categoria
                + "\nPreco da locacao: " +precoLocacao());
        System.out.println("\n");
    }
}