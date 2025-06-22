package praticaExame;

public class teste {
    public static void insertionSort(int vetor[]) {
        int N = vetor.length;
        for(int i = 1; i < N ; i++) {
            int eleito = vetor[i]; //
            int j = i-1;
            // comparacoes++;
            while (j >= 0 && vetor[j] > eleito) {
                // trocas++;
                // comparacoes++;
                vetor[j+1] = vetor[j];
                j = j-1;
            }
            vetor[j+1] = eleito;
        }
    }
}
/*
|65|22|78|41|59|95|30|88|
|00|01|02|03|04|05|06|07|
1° iteração:

2° iteração:

3° iteração:


 */