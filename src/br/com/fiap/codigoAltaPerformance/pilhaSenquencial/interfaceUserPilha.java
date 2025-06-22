package br.com.fiap.codigoAltaPerformance.pilhaSenquencial;

import java.util.Scanner;

public class interfaceUserPilha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        pilhaSequencial pilha = new pilhaSequencial();
        final int N = 10;
        int[] dados = new int[N];

        pilha.init();
        pilha.push(10);
        pilha.push(30);
        pilha.push(40);
        pilha.push(100);

        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());

    }

}
