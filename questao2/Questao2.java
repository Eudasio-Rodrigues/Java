/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao2;

/**
 *
 * @author eudasio
 */
public class Questao2 {

    public static void main(String[] args) {
        IngressoNormal ingresso= new IngressoNormal(10);
        IngressoVIP ingressovip= new IngressoVIP(10);

        ingresso.imprimirValor();
        ingressovip.imprimirValorVip();
    }
}
