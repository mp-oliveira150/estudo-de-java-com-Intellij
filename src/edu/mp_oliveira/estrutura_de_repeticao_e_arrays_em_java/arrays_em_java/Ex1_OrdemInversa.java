package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.arrays_em_java;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = scan.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n ; i ++ ){
            System.out.println("Numro a ser armazenado no vetor: ");
            vetor[i] = scan.nextInt();
        }
        for (int i = vetor.length -1; i >= 0; i --) {

            System.out.printf("Vetor Invertido: %d \n", vetor[i]);
        }
    }
}
