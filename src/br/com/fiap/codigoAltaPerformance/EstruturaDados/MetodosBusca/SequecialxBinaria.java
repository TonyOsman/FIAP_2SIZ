package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosBusca;

import java.util.Arrays;
import java.util.Random;

public class SequecialxBinaria {		

	public static final int N = 8;

	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in);

		Random gerador = new Random();

		int i;

		/* cria a estrutura de dados (vetor) com N elementos */
		int baseDados[] = new int[N];
		System.out.println("Criando vetor com " + N + " elementos: ");
		for (i = 0; i < N; i++) {
			baseDados[i] = ((gerador.nextInt(20000)) * 5) - 1000;
			System.out.print(baseDados[i] +" ");
		}
		System.out.println();
		i = 0;
		int comparacoes, maior = 0;
		for (i = 0; i < N; i++) {
			comparacoes = buscaSequencial(baseDados, baseDados[i]);
			if (comparacoes > maior)
				maior = comparacoes;
		}
		System.out.println("Numero de comparacoes para buscar qualquer chave na busca sequencial: " + maior);

		System.out.println("\n\n*********** Vetor ordenado para busca binaria**********");
		Arrays.sort(baseDados);
		for (i = 0; i < N; i++) {
			System.out.print(baseDados[i] +" ");
		}
		System.out.println();
		i = 0;
		maior = 0;
		for (i = 0; i < N; i++) {
			comparacoes = buscaBinaria(baseDados, baseDados[i]);
			if (comparacoes > maior)
				maior = comparacoes;
		}
		System.out.println("Numero de comparacoes para buscar qualquer chave na busca binaria: " + maior);

	}

	public static int buscaSequencial(int baseDados[], int chaveproc) {
		int pos = -1;
		int i;
		int comp = 0;
		for (i = 0; i < N && pos == -1; i++) {
			comp++;
			if ((baseDados[i] == chaveproc))
				pos = i;
		}
		return comp;
	}

	public static int buscaBinaria(int baseDados[], int chaveproc) {
		/* Pesquisa na estrutura de dados o valor solicitado */
		int i_baixo = 0;
		int i_medio = 0;
		int i_alto = N - 1;
		boolean achou = false;
	//	int posicao = -1;
		int comp = 0;
		while (!achou && i_baixo <= i_alto) {
			i_medio = (i_baixo + i_alto) / 2;
			comp++;
			if (chaveproc == baseDados[i_medio]) {
				//posicao = i_medio;
				achou = true;
			} else {
				if (chaveproc < baseDados[i_medio])
					i_alto = i_medio - 1;
				else
					i_baixo = i_medio + 1;
			}
		}
		return comp;
	}

}
