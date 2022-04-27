/*
 *Crie uma classe Elevador para armazenar as informações de um elevador de prédio.
 *A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo),
 *capacidade do elevador e quantas pessoas estão presentes nele. 
 *A classe deve também disponibilizar os seguintes métodos:
    Inicializar: que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
    Entrar: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
    Sair: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
    Subir: para subir um andar (não deve subir se já estiver no último andar);
    Descer: para descer um andar (não deve descer se já estiver no térreo);
    Obs.: Encapsular todos os atributos da classe (criar os métodos set e get).
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
