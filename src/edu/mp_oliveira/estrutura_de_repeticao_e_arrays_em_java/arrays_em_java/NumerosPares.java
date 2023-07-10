package edu.mp_oliveira.estrutura_de_repeticao_e_arrays_em_java.arrays_em_java;

public class NumerosPares {
        public static void main(String[] args){

// TODO: Crie um Array de números inteiros utilizando o Array da entrada no enunciado:
            int[] pares = {2,3,5,7,11,13,18,34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
            for (int i = 0;i < pares.length ;i ++ ){
                if (pares[i] % 2 == 0){
                    System.out.println(pares[i]);
                }
            }

        }

}