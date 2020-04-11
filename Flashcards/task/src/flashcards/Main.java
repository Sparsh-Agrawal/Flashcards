package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int n = scan.nextInt();
        scan.nextLine();
        String card = "";
        String definition = "";

        for (int i=1;i<=n;i++) {
            System.out.println("The card #" + i);
            card = scan.nextLine();
            definition = scan.nextLine();
        }
    }
}
