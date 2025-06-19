package aplicacao;

import java.util.Scanner;

import arvores.ABBint;

public class MainTeste {

	public static void main(String[] args) {
		Scanner le = new Scanner(System.in);
		ABBint abb = new ABBint();
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir 1 valor na ABB");
			System.out.println("2 - Apresentar nos da ABB");
			System.out.println("3 - Apresenta quantidade de nos na ABB");
			System.out.println("4 - Verifica a existencia de valor na ABB");
			System.out.println("5 - Apresenta o numero de comparacoes para pesquisar um valor na ABB");
			System.out.println("6 - Remove um no escolhido pelo valor");
			System.out.println("7 - Apresenta maior valor da ABB");
			opcao = le.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Encerrado o programa");
				break;
			case 1:
				System.out.print("Informe valor do dado: ");
				int valor = le.nextInt();
				// inserir na ABB
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				// mostra ABB
				abb.mostraEmOrdem(abb.root);
				System.out.println();
				break;
			case 3:
				//conta nos presentes na ABB
				System.out.println("Quantidade de nos = "+abb.contaNos(abb.root,0));
				break;
			case 4:
				System.out.print("Informe valor a ser procurado: ");
				valor = le.nextInt();
				// usa metodo consulta
				if (abb.consulta(abb.root, valor))
					System.out.println("Valor esta na ABB");
				else
					System.out.println("Valor nao encontrado na ABB");
				break;
			case 5:
				System.out.print("Informe valor a ser procurado: ");
				valor = le.nextInt();
				int comparacoes = abb.contaConsulta(abb.root, valor, 0);
				System.out.println("Numero de comparacoes realizadas na busca: "+ comparacoes);
				break;
			case 6:
				System.out.print("Informe valor a ser removido: ");
				valor = le.nextInt();
				abb.root = abb.removeValor(abb.root, valor);
				break;
			case 7:
				if (abb.root != null) {
					System.out.println("Maior valor na ABB: "+abb.maximo(abb.root));
				}
				else
					System.out.println("ABB esta vazia");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while (opcao != 0);
		le.close();

	}

}
