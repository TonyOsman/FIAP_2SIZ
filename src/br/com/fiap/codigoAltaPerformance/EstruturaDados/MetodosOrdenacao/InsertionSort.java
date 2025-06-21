package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosOrdenacao;

import java.util.Random;

public class InsertionSort {

    public static final int N = 10;

    public static void main(String[] args) {
        Random gerador = new Random();

        //cria a estrutura de dados (vetor) com N elementos gera vetor fora de ordem
        int vetor[] = new int[N];
        int i;

        System.out.println("Criando vetor com "+ N + " elementos: ");
        for(i = 0; i <N; i++) {
            vetor[i] = gerador.nextInt(50000);
            System.out.println(i+". "+ vetor[i]);
        }



        System.out.println("Ordenando o vetor com Insertionsort ... ");
        insertionSort(vetor);

        System.out.println("\n*********** Vetor Ordenado *********");
		for(i = 0; i <N; i++)
			System.out.println(i +"\t"+ vetor[i]);

    }

    public static void insertionSort(int vetor[]) {
        int comparacoes = 0, trocas=0;
        int eleito, j, i;

        for(i = 1; i < N ; i++) {

            eleito = vetor[i];
            j = i-1;
            comparacoes++;

            while (j >= 0 && vetor[j] > eleito) {
                trocas++;
                comparacoes++;
                vetor[j+1] = vetor[j];
                j = j-1;
            }

            vetor[j+1] =  eleito;
        }

        System.out.println("Numero de Trocas: "+ trocas);
        System.out.println("Numero de Comparacoes: "+ comparacoes);

}}
