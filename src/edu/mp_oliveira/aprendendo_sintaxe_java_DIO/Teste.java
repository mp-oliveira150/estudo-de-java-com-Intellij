package edu.mp_oliveira.aprendendo_sintaxe_java_DIO;

public class Teste {
    public static void main(String[] args) {
        String primeiro_nome = "Marcos Paulo";
        String segundoNome = "Rodrigues de Oliveira";
        String nomeCompleto = nomeCompleto(primeiro_nome,segundoNome);
        //Variável
        int anodefabricacao = 2023;
        //printa "Hello World
        System.out.println("Hello World!");
        System.out.println(nomeCompleto);
    }
    //metodo para juncão de nomes
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
