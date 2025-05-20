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
		}		/* adicição dos registros a base de dados */


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
	}		/*
	digitar rm
	Método procura na base de dados[], metodo começa no topo do vetor e anda descontando -1 comparando se o RM está igual a casa na qual ele está
	se chegar na base da base (-1) e não achar ele avisa que não foi encontrado.
	se achar, ele devolve a informação.
	-> pergunta repetida para executar o bloco em repetição até o user decidir sair.
	 */


	public static int buscaSequencial(Registro baseDados[], int chaveproc) {
		int pos = -1;
		for (int i = 0; i < baseDados.length && pos == -1; i++)
			if ((baseDados[i].getChave() == chaveproc))
				pos = i;

		return pos;
	}
} /* Algoritmo de Busca Sequencial Exaustiva */

}