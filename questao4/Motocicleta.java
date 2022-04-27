/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao4;

/**
 *
 * @author eudasio
 */
public class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String placa, int ano, int cilindradas) {
        super(placa, ano);
        this.cilindradas=cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Cilindradas:"+cilindradas);
    }
}
