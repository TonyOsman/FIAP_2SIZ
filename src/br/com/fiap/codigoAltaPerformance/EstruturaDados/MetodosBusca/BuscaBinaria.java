package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosBusca;

import utilities.Registro;

import java.util.Scanner;

public class BuscaBinaria {

	public static void main(String[] args) {

		Scanner le = new Scanner(System.in);

		final int N = 4;
		int i;

		/* cria a estrutura de dados (vetor) com N elementos */
		Registro baseDados[] = new Registro[N];
		String info;
		int chave;
		System.out.println("Criando vetor com " + N + " elementos: ");
		for (i = 0; i < N; i++) {

			System.out.println("Nome aluno e RM");
			info = le.next();
			chave = le.nextInt();
			Registro novo = new Registro(info, chave);
			baseDados[i] = novo;
		}

		System.out.println("\n\n*********** Vetor ordenado para busca binaria**********");
		sort(baseDados);
		for (i = 0; i < baseDados.length; i++) {
			System.out.println(baseDados[i]);
		}

		System.out.println("Digite RM procurado (negativo sair): ");
		int chaveproc = le.nextInt();
		while (chaveproc > 0) {
			int pos = buscaBinaria(baseDados, chaveproc);
			if (pos == -1)
				System.out.println("RM nao encontrado");
			else {
				System.out.println(baseDados[pos].getInfo());
			}
			System.out.println("Digite RM procurado (negativo sair): ");
			chaveproc = le.nextInt();
		}
		le.close();

	}

	public static int buscaBinaria(Registro baseDados[], int chaveproc) {
		/* Pesquisa na estrutura de dados o valor solicitado */
		System.out.println("Procurando o chave solicitada...");
		int i_baixo = 0;
		int i_medio = 0;
		int i_alto = baseDados.length - 1;
		boolean achou = false;
		int posicao = -1;
		while (!achou && i_baixo <= i_alto) {
			i_medio = (i_baixo + i_alto) / 2;
			if (chaveproc == baseDados[i_medio].getChave()) {
				posicao = i_medio;
				achou = true;
			} else {
				if (chaveproc < baseDados[i_medio].getChave())
					i_alto = i_medio - 1;
				else
					i_baixo = i_medio + 1;
			}
		}
		return posicao;
	}

	public static void sort(Registro vetor[]) {
		int n = vetor.length;
		boolean troca = true; /* sup�e realizar troca */
		for (int i = 0; (i < n - 1) && (troca); i++) {
			Registro aux;
			troca = false; /* sup�e n�o realizar troca */
			for (int j = 0; j < n - i - 1; j++) {
				if (vetor[j].getChave() > vetor[j + 1].getChave()) {
					aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					troca = true; // registra que houve troca na itera��o
				}
			}
		}
	}

}
