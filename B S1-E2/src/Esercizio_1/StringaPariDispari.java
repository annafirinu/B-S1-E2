package Esercizio_1;

import java.util.Scanner;

public class StringaPariDispari {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Scrivi qualcosa");
        String s1 = scanner.nextLine();

        System.out.println(stringaPariDispari(s1));

    }

    public static boolean stringaPariDispari(String s){
     if(s.length()%2==0){
         return true;
     } else {
         return false;
     }
    }
}
