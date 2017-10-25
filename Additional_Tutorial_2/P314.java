package Additional_Tutorial_2;

import java.util.Scanner;

public class P314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the card notation: ");
        String card = sc.next();

        char rank = card.charAt(0);
        char suit = card.charAt(1);

        String rankName = "";
        String suitName = "";

        if (rank == 'A') {
            rankName = "Ace";
        } else if (rank == 'J') {
            rankName = "Jack";
        } else if (rank == 'Q') {
            rankName = "Queen";
        } else if (rank == 'K') {
            rankName = "King";
        } else {
            rankName = String.valueOf(rank);
        }

        if (suit == 'S') {
            suitName = "Spades";
        } else if (suit == 'D') {
            suitName = "Diamonds";
        } else if (suit == 'H') {
            suitName = "Hearts";
        } else if (suit == 'C') {
            suitName = "Clubs";
        }

        System.out.printf("The card is: "+ rankName + " of " + suitName);
    }
}

