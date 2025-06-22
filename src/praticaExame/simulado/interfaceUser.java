package praticaExame.simulado;

import java.util.Scanner;

public class interfaceUser {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        AVLregiao arvoreAVLregiao = new AVLregiao();


        System.out.println("""
                1. INSERIR NA ARVORE
                2. MOSTRAR ARVORE
                3. CONSULTAR ACIMA DE X 
                
                SELECIONE SUA OPÇÃO: """);
        int opcao = 0;
        opcao = entrada.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("=== VOCÊ SELECIONOU PARA INSERIR UM Regiao NA AVL =====");
                System.out.println("Qual Regiao deseja inserir: ");
                String valor = entrada.next();
                System.out.println(valor+" foi inserido com sucesso!");

        }
    }
}
