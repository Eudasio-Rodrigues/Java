/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao3;

/**
 *
 * @author eudasio
 */
public class Elevador{
        private int AndarAtual=0;
        private int QtdAndares;
        private int capacidadeElevador;
        private int QtdPessoasNoElevador;

        public int getAndarAtual() {
            return AndarAtual;
        }

        public void setAndarAtual(int andarAtual) {
            AndarAtual = andarAtual;
        }

        public int getQtdAndares() {
            return QtdAndares;
        }

        public void setQtdAndares(int qtdAndares) {
            QtdAndares = qtdAndares;
        }

        public int getCapacidadeElevador() {
            return capacidadeElevador;
        }

        public void setCapacidadeElevador(int capacidadeElevador) {
            this.capacidadeElevador = capacidadeElevador;
        }

        public int getQtdPessoasNoElevador() {
            return QtdPessoasNoElevador;
        }

        public void setQtdPessoasNoElevador(int qtdPessoasNoElevador) {
            QtdPessoasNoElevador = qtdPessoasNoElevador;
        }

       public void inicializar(int capacidadeElevador,int QtdAndares){
            this.capacidadeElevador=capacidadeElevador;
            this.QtdAndares=QtdAndares;

       }
        public void entrar(){
            if (capacidadeElevador>0){
                QtdPessoasNoElevador++;
                capacidadeElevador--;
                System.out.println("Tem "+ QtdPessoasNoElevador
                        +" pessoa(s) no elevador e ainda cabem "+ capacidadeElevador+" pessoa(s)");
            }else{
                System.out.println("Elevador cheio");
            }
        }

        public void sair(){
            if (QtdPessoasNoElevador>0){
                QtdPessoasNoElevador--;
                capacidadeElevador++;
                System.out.println("Saiu "+ QtdPessoasNoElevador
                        +" pessoa(s) do elevador e a capacidade do elevador subiu para "+ capacidadeElevador+" pessoa(s)");
            }else{
                System.out.println("Elevador vazio.");
            }
        }

        public void subir(){
            if (AndarAtual<5){
                AndarAtual++;
                System.out.println("Elevador subiu ate o andar numero "+ AndarAtual);
            }else{
                System.out.println("Voce  ja esta no ultimo andar");
            }
        }

        public void descer(){
            if (AndarAtual>0){
                AndarAtual--;
                System.out.println("Elevador desceu ate o andar numero "+ AndarAtual);
            }else{
                System.out.println("Voce  ja esta no terreo");
            }
        }
    }
