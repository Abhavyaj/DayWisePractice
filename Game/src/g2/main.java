package g2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        int grid = 10;
        int max = 100;

        int[] snakeX = new int[max];
        int[] snakeY = new int[max];

        int length = 1;

        // initial position
        snakeX[0] = 5;
        snakeY[0] = 5;

        int foodX = (int)(Math.random() * grid);
        int foodY = (int)(Math.random() * grid);

        boolean gameOver = false;

        System.out.println("Snake Game");
        System.out.println("Controls: U D L R");

        while (!gameOver) {

            // clear screen (basic)
            for (int c = 0; c < 20; c++)
                //System.out.println();

            // draw grid
            for (int i = 0; i < grid; i++) {
                for (int j = 0; j < grid; j++) {

                    boolean printed = false;

                    // snake body
                    for (int k = 0; k < length; k++) {
                        if (snakeX[k] == j && snakeY[k] == i) {
                            System.out.print("S ");
                            printed = true;
                            break;
                        }
                    }

                    if (!printed) {
                        if (i == foodY && j == foodX)
                            System.out.print("F ");
                        else
                            System.out.print(". ");
                    }
                }
                System.out.println();
            }

            System.out.println("Length: " + length);
            System.out.print("Move: ");
            char move = sc.next().charAt(0);

            // move body
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }

            // move head
            if (move == 'U') snakeY[0]--;
            else if (move == 'D') snakeY[0]++;
            else if (move == 'L') snakeX[0]--;
            else if (move == 'R') snakeX[0]++;
            else continue;

            // wall collision
            if (snakeX[0] < 0 || snakeX[0] >= grid ||
                snakeY[0] < 0 || snakeY[0] >= grid) {
                System.out.println("Game Over  Hit wall");
                break;
            }

            // food eaten
            if (snakeX[0] == foodX && snakeY[0] == foodY) {
                length++;
                foodX = (int)(Math.random() * grid);
                foodY = (int)(Math.random() * grid);
            }}}}
