package br.com.diego;

public class Exemplo2 {

    public static void main(Sring args[]){

        //casting explicíto, onde informamos qual tipo será convertido
        int num1 = 10;
        short num2 = (short) num1;  //casting, para converter short em int

        long numL = 1111111111111111111l;
        System.out.println(numL);
        int numI = (int) numL; //neste caso não funciona corretamente, estamos convertendo um número grande em um pequeno
        System.out.println(numI);


        //casting implicito, não precisamos indicar a conversão pois convertemos de um tipo menor para um maior
        int idade = 10;
        long idadeL = idade;

        byte b = 1;
        short s = b;

        byte b1 = (byte) s;
        int i = b1;

        int i1 = 1;
        byte s1 = (byte) i1;
        long l = i1;

        long l1 = 1010101;
        short l2 = (short) l1;
        double d = l1;

        double d1 = 1.0;
        long l3 = (long) d1;

    }

}
