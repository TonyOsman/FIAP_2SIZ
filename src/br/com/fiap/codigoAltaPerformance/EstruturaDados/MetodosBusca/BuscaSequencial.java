package br.com.fiap.codigoAltaPerformance.EstruturaDados.MetodosBusca;

import utilities.Registro;

import java.util.Scanner;

public class BuscaSequencial {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		final int N = 4;
		int i;
		String info;
		int chave;
		/* cria a estrutura de dados (vetor) com N elementos */

		Registro baseDados[] = new Registro[N];

		System.out.println("Criando vetor com " + N + " elementos: ");
		for (i = 0; i < N; i++) {
			System.out.println("Nome aluno e RM");
			info = le.next();
			chave = le.nextInt();
			Registro novo = new Registro(info, chave);
			baseDados[i] = novo;
		}

		System.out.println("Digite RM procurado (negativo sair): ");
		int chaveproc = le.nextInt();
		while (chaveproc > 0) {
			int pos = buscaSequencial(baseDados, chaveproc);
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

	public static int buscaSequencial(Registro baseDados[], int chaveproc) {
		int pos = -1;
		for (int i = 0; i < baseDados.length && pos == -1; i++)
			if ((baseDados[i].getChave() == chaveproc))
				pos = i;

		return pos;
	}
}
