package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosOrdenacao;

import java.util.Random;

public class QuickSort {


    public static int comparacoes = 0;
    public static int trocas = 0;

    public static final int N = 10;

    public static void main(String[] args) {


        /*cria a estrutura de dados (vetor) com N elementos  gera vetor fora de ordem*/

        int vetor[] = new int[N];
        int i;
        Random gerador = new Random();


        System.out.println("Criando vetor com "+ N + " elementos: ");
        for(i = 0; i <N; i++) {
            vetor[i] = gerador.nextInt(50000);
            System.out.println(i+". "+ vetor[i]+"  ");
        }

        System.out.println("Ordenando o vetor com Quicksort... ");
        quickSort(vetor,0, N-1);
        System.out.println("\n\nTrocas efetuadas: "+ trocas+ "\nComparacoes realizadas: "+ comparacoes);


        System.out.println("\n*********** Vetor Ordenado *********");
        for(i = 0; i <N; i++)
            System.out.println(i +"\t"+ vetor[i]);
    }

    public static int particiona (int x[], int li, int ls) //recebe um vetor (que será organizado,indice de inicio, e indice de fim)
    {
        int pivo,abaixo,temp,acima;
        pivo=x[ls];
        acima=ls;
        abaixo=li;
        while(abaixo<acima)
        {
            comparacoes++;
            while(x[abaixo]<pivo && abaixo<ls) {
                abaixo++;
                comparacoes++;
            }
            while (x[acima]>=pivo && acima > abaixo) {
                comparacoes++;
                acima--;
            }
            if (abaixo<acima){
                trocas++;
                temp=x[abaixo];
                x[abaixo]=x[acima];
                x[acima]=temp;
            }
        }
        trocas++;
        x[ls]=x[acima];
        x[acima]=pivo;
        return acima;
    }

    public static void quickSort(int x[],int li,int ls) { //recebe um vetor (que será organizado,indice de inicio, e indice de fim)
        int j;
        if (li<ls){ //só faz algo se tiver mais de um elemento no vetor
            j = particiona(x, li, ls); //pede para o metodo particiona para reorganizar o vetor e devolver.
            //chama si mesmo duas vezes para ordenar os subvetores
            quickSort(x, li, j-1);//chama o quicksort para a parte esquerda do pivô
            quickSort(x, j+1,ls);//chama o quicksort para a parte direita do pivô
        }
    }

}
