package br.com.diego;

public class Operadores {

    public static void main(String args[]) {
        operacoesAritmeticas();
        operacoesAtribuicoes();
        operacoesIncrementoDecremento();
        operacoesRealacionais();
    }

    private static void operacoesRealacionais() {
        System.out.println("****operacoesRealacionais****");
        int num1 = 10;
        int num2 = 10;
        boolean isMaior = num1 > num2;
        System.out.println("isMaior: " + isMaior);

        boolean isIgual = num1 == num2;
        System.out.println("isIgual: " + isIgual);

        boolean isDiff = num1 != num2;
        System.out.println("isDiff: " + isDiff);

        boolean isMaiorIgual = num1 >= num2;
        System.out.println("isMaiorIgual " + isMaiorIgual);
        //1...10
        boolean isDentro10 = num1 >= 0 && num1 <= 10;
        System.out.println("isDentro10 " + isDentro10);

        boolean isDentro_10 = num1 >= 0 || num1 <= 9;
        System.out.println("isDentro_10 " + isDentro_10);

        boolean isNot = num1 >= 0 || num1 <= 9;
        System.out.println("isNot " + !isNot);
    }

    private static void operacoesIncrementoDecremento() {
        System.out.println("****operacoesIncrementoDecremento****");
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1);
        num1++;
        System.out.println(num1);
        num1--;
        System.out.println(num1);

    }

    private static void operacoesAtribuicoes() {
        System.out.println("****operacoesAtribuicoes****");

        int numero1 = 10;
        int numero2 = 10;
        int numero3 = numero1 + numero2;
        System.out.println(numero3);
        numero3 += numero3;
        int numero4 = numero3 + 20;
        System.out.println(numero3);
        System.out.println(numero4);
    }

    public static void operacoesAritmeticas() {
        int num1 = 10;
        int num2 = 20;

        int num3 = num1 + num2;
        int num4 = num1 - num2;
        int num5 = num1 / num2;
        int num6 = num1 * num2;
        int num7 = (10 + 10)/2;

        System.out.println(num3);
        System.out.println(num4);
        System.out.println(num5);
        System.out.println(num6);
    }
}
