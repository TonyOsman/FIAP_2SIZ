package br.com.fiap.codigoAltaPerformance.arvoreBinaria.ABB.AVL;

import java.util.Scanner;

public class aplicacaoMenu {
    public static void main(String[] args) {

        Scanner le = new Scanner(System.in);
        int opcao;
        arvoreAVLint avl = new arvoreAVLint();

        do {
            System.out.println("0 - Encerrar");
            System.out.println("1 - Insere 1 valor na ABB");
            System.out.println("2 - Apresenta pos ordem os nos da ABB apresentando tambem o FB do no");
            System.out.println("3 - Remove um no da AVL");
            opcao = le.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Encerrado");
                    avl.mostraEmOrdem(avl.root);
                    break;
                case 1:
                    System.out.print("Informe valor:");
                    int valor = le.nextInt();
                    avl.root = avl.inserirAVL(avl.root, valor);
                    avl.atualizaAlturas(avl.root);
                    break;
                case 2:
                    System.out.println("*****  Apresentacao da AVL **********");
                    avl.mostraFB(avl.root);
                    break;
                case 3:
                    System.out.print("Informe valor a ser removido:");
                    valor = le.nextInt();
                    avl.root = avl.removeValor(avl.root, valor);
                    avl.root = avl.atualizaAlturaBalanceamento(avl.root);
                    avl.atualizaAlturas(avl.root);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);

        le.close();
    }
}
