package g1;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
	public static void main(String[]args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of players: ");
	        int players = sc.nextInt();
	        sc.nextLine(); // consume newline

	        ArrayList<String> names = new ArrayList<>();
	        ArrayList<Integer> scores = new ArrayList<>();

	        for (int i = 0; i < players; i++) {
	            System.out.print("Enter name of player " + (i + 1) + ": ");
	            names.add(sc.nextLine());
	            scores.add(0);
	        }

	        System.out.print("Enter number of rounds: ");
	        int rounds = sc.nextInt();

	        for (int r = 1; r <= rounds; r++) {
	            System.out.println("\n--- Round " + r + " ---");

	            for (int i = 0; i < players; i++) {
	                System.out.println("\n" + names.get(i) + "'s turn");
	                System.out.println("1. Roll Dice");
	                System.out.println("2. Exit");
	                System.out.print("Choose: ");
	                int ch = sc.nextInt();

	                if (ch == 1) {
	                    int dice = (int)(Math.random() * 6) + 1;
	                    System.out.println("Dice: " + dice);

	                    scores.set(i, scores.get(i) + dice);
	                    System.out.println("Total Score: " + scores.get(i));
	                } 
	                else if (ch == 2) {
	                    System.out.println("Game exited.");
	                    return;
	                } 
	                else {
	                    System.out.println("Invalid choice!");
	                }
	            }
	        }

	        // Declare winner
	        int maxScore = scores.get(0);
	        int winnerIndex = 0;

	        for (int i = 1; i < players; i++) {
	            if (scores.get(i) > maxScore) {
	                maxScore = scores.get(i);
	                winnerIndex = i;
	            }
	        }

	        System.out.println("\n--- Final Scores ---");
	        for (int i = 0; i < players; i++) {
	            System.out.println(names.get(i) + ": " + scores.get(i));
	        }

	        System.out.println("\n Winner: " + names.get(winnerIndex));
	        System.out.println("Winning Score: " + maxScore);
	    }

}
