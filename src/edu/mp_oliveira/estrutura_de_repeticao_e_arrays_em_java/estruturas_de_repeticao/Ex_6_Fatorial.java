package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex_6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número a ser fatorado: ");
        int numeroADecompor = scan.nextInt();

        int fatorado = 1;
        for (int i = numeroADecompor; i >= 1; i--) {
            fatorado = fatorado * i;
        }
        System.out.println(fatorado);
    }
}
