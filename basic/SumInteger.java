package basic;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class SumInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter integer:");

            try {
                int num = sc.nextInt();
                sum += num;
            }
            catch (InputMismatchException e) {
                System.out.println("Please enter a integer.");
                sc.nextLine(); 
                i--;
                continue;
            }
            catch (NoSuchElementException e) {
                System.out.println("Input is not available.");
                break;
            }
            catch (IllegalStateException e) {
                System.out.println("Scanner is closed.");
                break;
            }

            catch (Exception e) {
                System.out.println("Unexpected error occurred.");
                break;
            }
        }

        System.out.println("Final Sum: " + sum);
        sc.close();
    }
}