/*
 * Crie um programa para um sistema de locação de filmes digitais. O sistema possui filmes nas categorias:
    *lançamento
    *promoção
    *infantil
    *geral
O filme deve ter os seguintes atributos:
    *título
    *categoria
    *preço de locação
*Crie os métodos getts e settes para os atributos
*Crie um método para calcular o preço da locação
*Crie um método para imprimir os atributos.
*Use como base para criação das classes as informações abaixo.
    *Filmes de um modo geral possui um valor normal de locação de R$4,00;
    *Filmes infantis possui um valor normal de locação + acréscimo de R$ 2,00;
    *Filmes em Lançamento possui um valor normal de locação + acréscimo de R$ 3,00;
    *Filmes em promoção possuem um valor normal de locação + desconto de R$ 2,00.
 */

package com.mycompany.questao5;

/**
 *
 * @author eudasio
 */
public class Questao5 {

    public static void main(String[] args) {
        /*
        Lancamento lancamento=new Lancamento("Harry potter", "Ficcao cientifica");
        lancamento.ImprimirInformacoes();
        lancamento.setTitulo("Animais fantastiscos");
        lancamento.ImprimirInformacoes();
*/
        //Promocao promocao=new Promocao("Senhor dos aneis", "Ficcao cientifica");
        //promocao.ImprimirInformacoes();

        //Infantil infantil=new Infantil("Zootopia","Infantil");
        //infantil.ImprimirInformacoes();

        Geral filmesgeral=new Geral("Missao impossivel", "Geral");
        filmesgeral.ImprimirInformacoes();
    }
}
