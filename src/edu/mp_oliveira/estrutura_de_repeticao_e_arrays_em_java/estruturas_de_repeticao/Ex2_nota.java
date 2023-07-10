package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex2_nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma nota entre 1 e 10.");
        int nota = 0;
        nota = scanner.nextInt();

        while (nota <0 | nota >10) {
            System.out.println("Nota inválida. Digite uma nota entre 0 e 10");
            nota = scanner.nextInt();
        }
        System.out.println("Sua nota é: " + nota);

}
}
