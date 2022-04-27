/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao1;

/**
 *
 * @author eudasio
 */
public class Questao1 {

    public static void main(String[] args) {
        JogadorDeFutebol jogador1= new JogadorDeFutebol("Joao","goleiro", 1994,"brasileiro", 1.75F,55.8f);
        jogador1.imprimirDados();
        jogador1.calculoAposentadoria();
    }
}
