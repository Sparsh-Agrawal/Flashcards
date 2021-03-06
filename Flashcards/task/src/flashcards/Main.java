package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input the number of cards:");
        int n = scan.nextInt();
        scan.nextLine();
        String[] card = new String[n];
        String[] definition = new String[n];

        for (int i=1;i<=n;i++) {
            System.out.println("The card #" + i + ":");
            card[i-1] = scan.nextLine();
            System.out.println("The definition of the card #" + i + ":");
            definition[i-1] = scan.nextLine();
        }

        for(int j=0;j<n;j++) {
            System.out.println("Print the definition of " + "\"" + card[j] + "\"" + ":");
            if(definition[j].equals(scan.nextLine())) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. The correct one is " + "\"" + definition[j] + "\"" + ".");
            }
        }
    }
}
