package flashcards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String term = scan.nextLine();
        String definition = scan.nextLine();
        String answer = scan.nextLine();

        if(definition.equals(answer)) {
            System.out.println("Your answer is right!");
        } else {
            System.out.println("Your answer is wrong...");
        }
    }
}
