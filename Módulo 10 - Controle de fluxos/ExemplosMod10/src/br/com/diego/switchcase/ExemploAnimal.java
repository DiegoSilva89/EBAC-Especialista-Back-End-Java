package br.com.diego.switchcase;

import java.util.Scanner;

public class ExemploAnimal {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o nome de um animal: ");
        String texto = s.next();
        String animal = examploOfSwitch(texto);
        System.out.println(animal);

    }

    public static String examploOfSwitch(String animal) {
        String result;
        switch (animal) {
            case "DOG" :
            case "CAT" :
                result = "domestic animal";
                break;
            case "TIGER" :
                result = "wild animal";
            default:
                result = "unknown animal";
                break;
        }
        return result;
    }

}
