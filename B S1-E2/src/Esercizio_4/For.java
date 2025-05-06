package Esercizio_4;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int num = scanner.nextInt();

        System.out.println("Conto alla rovescia");

        for (int i = num; i >=0 ; i--) {
            System.out.println(i);
        }
    }
}
