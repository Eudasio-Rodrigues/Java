/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.questao3;

/**
 *
 * @author eudasio
 */
public class Questao3 {

    public static void main(String[] args) {
        Elevador elevador=new Elevador();

        elevador.inicializar(6,5);
        elevador.entrar();
        elevador.entrar();
        elevador.sair();
        elevador.subir();
        elevador.subir();
        elevador.descer();
        elevador.descer();
        elevador.descer();
    }
}
