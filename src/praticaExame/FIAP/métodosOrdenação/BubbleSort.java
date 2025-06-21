package praticaExame.FIAP.métodosOrdenação;

import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {


        Random random = new Random();
        final int N = 10;

        int vetor[] = new int[N];

        int i;
        System.out.println("Criando Vetor com 10 elemetos: ");
        for (i = 0; i < N; i++) {
            vetor[i] = random.nextInt(5000);
            System.out.println(i+ ". " + vetor[i]);
        }

        bubbleSort(vetor);
        System.out.println("Vetor Ordenado com Bubble Sort: ");
        for (i = 0; i < N ; i++) {
            System.out.println(i+ ". " +vetor[i]);
        }

    }
    private static void bubbleSort(int vetor[]) {
        int comparacoes = 0, trocas = 0;
        int n = vetor.length;
        boolean troca = true;

        for (int i = 0; (i < n - 1) && (troca); i++) {
            int aux;
            troca = false;
            for (int j = 0; j < n - i - 1; j++) {
                comparacoes++;
                if (vetor[j] > vetor[j + 1]) {
                    trocas++;
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                    troca = true;
                }
            }
        }
        System.out.println("n° de trocas: " + trocas);
        System.out.println("n° de comparações: " + comparacoes);
    }
}
