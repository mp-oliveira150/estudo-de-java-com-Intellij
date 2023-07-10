package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.estruturas_de_repeticao;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entrada, resultado, fimLoop  = 1;
        System.out.println("Digite um número entre 0 e 10: ");
        entrada = scan.nextInt();

        while (fimLoop != 0){
        if (entrada > 0 & entrada <= 10){
            System.out.println("\nTabuada do " + entrada + "\n");
            for (int i = 1; i <= 10; i++){
            resultado = entrada * i;
            System.out.println(entrada + " x " + i + " = " + resultado);
            fimLoop = 0;
        }
        }else {System.out.println("Digite um número entre 0 e 10."); entrada = scan.nextInt();
        }
        }
}
}
