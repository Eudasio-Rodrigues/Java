/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questao1;

import java.util.Scanner;

/**
 *
 * @author eudasio
 */
public class JogadorDeFutebol {
   
    String nome;
    String posicao;
    int datanascimento;
    String nacionalidade;
    float altura;
    float peso;

    public JogadorDeFutebol(String nome, String posicao, int datanascimento, String nacionalidade, float altura, float peso) {
        this.nome = nome;
        this.posicao=posicao;
        this.datanascimento=datanascimento;
        this.nacionalidade=nacionalidade;
        this.altura=altura;
        this.peso=peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(int datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void imprimirDados(){

        System.out.println("Nome:"+nome
                            +"\nPosicao:"+posicao
                            +"\nData de nascimento:"+datanascimento
                            +"\nNacionalidade:"+nacionalidade
                            +"\nAltura:"+altura
                            +"\nPeso:"+peso
                            +"\nIdade:"+ this.calculaIdade(2022));
        System.out.println("\n");
    }

    public int calculaIdade(int anoatual){
        return anoatual-datanascimento;
    }

    public void calculoAposentadoria(){
        Scanner entrada= new Scanner(System.in);
        int opcao = 0;
        int TempoParaAposentar;

            System.out.println("Escolha uma das opcoes abaixo.");
            System.out.println( "1->Defesa\n" +
                                "2->Meio-campo\n" +
                                "3->Atacante\n"+
                                "0->Sair");
            opcao=entrada.nextInt();
            switch (opcao){
                case 1:
                    TempoParaAposentar = 40 - calculaIdade(2022);
                    if (TempoParaAposentar >0) {
                        System.out.println("Ainda faltam " + TempoParaAposentar + " anos para voce se aposentar.");
                    } else if (TempoParaAposentar==0){
                        System.out.println("Voce ja pode se aposentar");
                    }
                    break;
                case 2:
                    TempoParaAposentar= 38-calculaIdade(2022);
                    if (TempoParaAposentar>0){
                        System.out.println("Faltam "+ TempoParaAposentar+" para voce se aposentar");
                    }else if (TempoParaAposentar==0){
                        System.out.println("Voce ja pode se aposentar");
                    }
                    break;
                case 3:
                    TempoParaAposentar= 35-calculaIdade(2022);
                    if (TempoParaAposentar>0){
                        System.out.println("Faltam "+ TempoParaAposentar+" para voce se apoesentar");
                    }else if (TempoParaAposentar==0){
                        System.out.println("Voce ja pode se aposentar");
                    }
                    break;
                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }

        }
