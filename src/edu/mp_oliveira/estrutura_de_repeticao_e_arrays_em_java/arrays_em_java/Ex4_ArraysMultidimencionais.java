package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.arrays_em_java;

import java.util.Random;

public class Ex4_ArraysMultidimencionais {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] matrizMulti = new int[4][4];

        for (int i = 0; i < matrizMulti.length ;i++){
            for (int j = 0; j < matrizMulti[i].length; j++){
                matrizMulti[i][j] = random.nextInt(9);
            }
        }
        System.out.println("Matriz Multidimencional: ");

        for (int[] linhainteira : matrizMulti ) {
            for (int elemento_da_coluna : linhainteira) {
                System.out.print(elemento_da_coluna + ", ");
            }
            System.out.println();
        }

        /* Usando recurso do Java para transformar a linha em String para o conteúdo ser
        impresso ao invés do endereço de memória.

        for (int[] M : matrizMulti ) {
            System.out.println(Arrays.toString(M));
        }
        */

    }
}
