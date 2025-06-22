package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosOrdenacao;

import java.util.Random;

public class QuickSort {


    public static int comparacoes = 0;
    public static int trocas = 0;

    public static final int N = 10;

    public static void main(String[] args) {

        int vetor[] = new int[] {1621,4291,3553,4691,3039,2684,3277,2378,3256,2985};
        int i;


        System.out.println("Criando vetor com "+ N + " elementos: ");
        for(i = 0; i <N; i++) {
            System.out.println(i+". "+ vetor[i]+"  ");
        }

        System.out.println("Ordenando o vetor com Quicksort... ");
        quickSort(vetor,0, N-1);
        System.out.println("\n\nTrocas efetuadas: "+ trocas+ "\nComparacoes realizadas: "+ comparacoes);


        System.out.println("\n*********** Vetor Ordenado *********");
        for(i = 0; i <N; i++)
            System.out.println(i +"\t"+ vetor[i]);
    }

    public static int particiona (int x[], int li, int ls)
    {
        int pivo,abaixo,temp,acima;
        pivo=x[ls]; //2985 | x[ls] = vetor[9] = 2985
        acima=ls; // acima = 2985
        abaixo=li; // 1621 | x[li] = vetor[0] = 1621
        while(abaixo<acima) //positivo
        {
            comparacoes++; //++
            while(x[abaixo]<pivo && abaixo<ls) { // enquanto(1621<2985 && 1621<2985)
                abaixo++; //abaixo == x[1] == 4291
                comparacoes++; //==1
            }
            while (x[acima]>=pivo && acima > abaixo) { //enquanto(2985>=2985 && 2985 > 4291)
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
        return acima; // retorno o pivôt para que o quick saiba onde a divisão aconteceu para
    }

    public static void quickSort(int x[],int li,int ls) { // vetor[], 0, 9
        int j;
        if (li<ls){
            j = particiona(x, li, ls); // j = particiona(vetor[], 0, 9);
            quickSort(x, li, j-1);
            quickSort(x, j+1,ls);
        }
    }

}
