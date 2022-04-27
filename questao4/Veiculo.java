/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao4;

/**
 *
 * @author eudasio
 */
public class Veiculo {
    private String placa;
    private int ano;
    public Veiculo(String placa, int ano){
        this.placa=placa;
        this.ano=ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Placa:"+placa
                            +"\nAno:"+ano);
    }
}