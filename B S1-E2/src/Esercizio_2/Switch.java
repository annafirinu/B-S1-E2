package Esercizio_2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Scegli un numero");
        int scelta =scanner.nextInt();

        switch(scelta){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Errore:Numero troppo grande!");
        }
    }
}
