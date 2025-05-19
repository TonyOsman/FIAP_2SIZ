package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosBusca;

import utilities.Registro;

import java.util.Scanner;

public class BuscaExaustiva {

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
			System.out.println("Nome aluno e nota (apenas inteiro)");
			info = le.next();
			chave = le.nextInt();
			Registro novo = new Registro(info, chave);
			baseDados[i] = novo;
		}

		System.out.println("Digite nota procurada: ");
		int chaveproc = le.nextInt();
		while (chaveproc >= 0) {
			Registro encontrados[] = new Registro[baseDados.length];
			int ne = buscaSequencialExaustiva(baseDados, chaveproc, encontrados);
			if (ne == 0)
				System.out.println("Nota nao encontrada");
			else {
				System.out.println("Nota encontrada no(s) registro(s) ");
				for (i = 0; i < ne; i++)
					System.out.println(encontrados[i].getInfo());
			}
			System.out.println("Digite nota procurada (negativo para encerrar): ");
			chaveproc = le.nextInt();
		}
		le.close();
	}

	public static int buscaSequencialExaustiva(Registro bd[], int chave, Registro encontrados[]) {
		int ne = 0;
		int num = bd.length;
		for (int i = 0; i < num; i++) {
			if (bd[i].getChave() == chave) {
				encontrados[ne] = bd[i];
				/* armazena registro da posi��o em que a chave foi encontrada */
				ne++;
			}
		}
		return (ne); /* registros com a chave procurada */
	}
}
