/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao2;

/**
 *
 * @author eudasio
 */
public class IngressoVIP extends IngressoNormal {
    float valorAdicional=5;

    public IngressoVIP(float valor) {
        super(valor);
    }

    public float ingressoVip(){
        return valor+valorAdicional;
    }

    public void imprimirValorVip(){
        System.out.println("Valor do ingresso Vip:"+ ingressoVip());
    }
}