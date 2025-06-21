package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosOrdenacao;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args)  {

        Random gerador = new Random();

        final int N = 10;    // define o tamanho do vetor a ser ordenado


        //cria a estrutura de dados (vetor) com N elementos gera vetor fora de ordem
        int vetor[] = new int[N];
        int i;
        System.out.println("Criando vetor com "+ N + " elementos: ");
        for(i = 0; i <N; i++) {
            vetor[i] = gerador.nextInt(50000);
            System.out.println(vetor[i]);
        }



        System.out.println("Ordenando o vetor com Bubblesort ... ");
        bubbleSort(vetor);

        System.out.println("\n*********** Vetor Ordenado *********");
        bubbleSort(vetor);
        for(i = 0; i <N; i++)
            System.out.println(i +"\t"+ vetor[i]);

    }

    public static void bubbleSort(int vetor[]) {
        int comparacoes = 0, trocas=0;
        int n = vetor.length;
        boolean troca= true; /* sup�e realizar troca */

        for (int i=0;(i<n-1) && (troca); i++){
            int aux;
            troca= false; /* sup�e n�o realizar troca */
            for (int j=0; j < n-i-1 ;j++){
                comparacoes++;
                if (vetor[j]> vetor[j+1]){
                    trocas++;
                    aux= vetor[j];
                    vetor[j]= vetor[j+1];
                    vetor[j+1]=aux;
                    troca=true;  //registra que houve troca na itera��o
                }
            }
        }

        System.out.println("Numero de Trocas: "+ trocas);
        System.out.println("Numero de Comparacoes: "+ comparacoes);
    }
}
