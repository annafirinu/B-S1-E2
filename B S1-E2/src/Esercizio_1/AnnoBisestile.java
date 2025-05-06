package Esercizio_1;

import java.util.Scanner;

public class AnnoBisestile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Scrivi un anno");
        int anno1 = scanner.nextInt();

        System.out.println(annoBisestile(anno1));
    }
    public static boolean annoBisestile(int anno) {

        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
