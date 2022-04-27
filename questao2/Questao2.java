/*
 *Crie uma classe chamada Ingresso, que possui um valor em reais e um método imprimirValor(). 
 *Crie uma classe IngressoVIP, que herda de Ingresso e possui um valor adicional. 
 *Crie um método que retorne o valor do ingresso VIP (com o adicional incluído). 
 *Crie um programa para criar as instâncias de Ingresso e IngressoVIP, mostrando a diferença de preços.
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
