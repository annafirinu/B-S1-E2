package Esercizio_3;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Scrivi qualcosa (per terminare scrivi :q)");
        String s;

        while (true) {
            s = scanner.nextLine();


            if (s.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }

            StringBuilder suddividi = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                suddividi.append(s.charAt(i));
                if (i < s.length() - 1) {
                    suddividi.append(",");
                }
            }

            System.out.println("Suddivisione in caratteri: " + suddividi.toString());

        }
    }
}
