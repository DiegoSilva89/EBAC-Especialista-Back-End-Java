package br.com.diego.forewhile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploPPT1 {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        List<Integer> valores = new ArrayList<>();

        //For com contador, onde sabemos a quantidade de itens a serem contados
        for(int i = 0; i <= 10; i++){
            System.out.println("Linha " + i);
        }

        //For que usa coleções e não sabemos a quantidade de itens que teremos
        for (Integer i : valores) {
            System.out.println("Linha " + i);
        }

        //For igual ao anterior, mas mais aprimorado, utilizando Lambda
        valores.forEach(i-> System.out.println("Linha " + i));

    }
}