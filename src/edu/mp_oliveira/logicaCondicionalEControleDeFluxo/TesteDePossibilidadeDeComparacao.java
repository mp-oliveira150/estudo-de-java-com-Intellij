package edu.mp_oliveira.logicaCondicionalEControleDeFluxo;

public class TesteDePossibilidadeDeComparacao {
    public static void main(String[] args) {

        int i1 = 3;
        int i2 = 5;
        float f1 = 3.5f, f2 = 3.0f;
        char c1 = 'x', c2 = 'y';
        String s1 = "Fulano", s2 = "Fulano";
        boolean b1 = true, b2 = false;



        System.out.println("i1 == i2? " + (i1 == i2? "A variável i1 é igual a variável i2": "A variável i1 é diferente da variável i2"));
        System.out.println("i1 != i2? " + (i1 != i2? "A variável i1 é diferente da variável i2":"A variável i1 é igual a variável i2"));
        System.out.println("i1 >= i2? " + (i1 >= i2? "A variável i1 é maior ou igual a variável i2" :"A variável i1 não é maior ou igual a variável i2"));
        System.out.println("i1 <= i2? " + (i1 <= i2? "A variável i1 é menor ou igual a variável i2" : "A variável i1 não é menor ou igual a variável i2"));
    }

}

