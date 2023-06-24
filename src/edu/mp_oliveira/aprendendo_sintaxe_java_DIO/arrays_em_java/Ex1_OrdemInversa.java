package edu.mp_oliveira.aprendendo_sintaxe_java_DIO.arrays_em_java;

import java.util.Scanner;

public class Ex1_OrdemInversa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = scan.nextInt();
        int count = n;

        int[] vetor = new int[n];

        for (int i = 0; i < n ; i += 1 ){
            System.out.println("Numro a ser armazenado no vetor: ");
            vetor[i] = scan.nextInt();
        }
        for (int i = vetor.length; i > 0; i --) {

            count = count - 1;

            System.out.printf("Vetor Invertido: %d |", vetor[count]);
        }
    }
}
