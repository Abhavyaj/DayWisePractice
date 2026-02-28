package basic;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class ObjectStreamMarks {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        Scanner sc = new Scanner(System.in);

        FileOutputStream fos = new FileOutputStream("marksData.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        System.out.print("Enter no. of Students:");
        int n = sc.nextInt();

        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter Roll No.:");
            int r = sc.nextInt();

            if (hs.containsKey(r)) {
                System.out.print("Already Entered!Enter other Roll no.");
                i--;
                continue;
            }

            System.out.print("Enter Marks:");
            int m = sc.nextInt();

            hs.put(r, m);

            oos.writeObject(new Marks(r, m));
        }

        oos.close();
        fos.close();

        System.out.println("Data Stored Successfully!");

        System.out.println("Enter roll no to find:");
        int findRoll = sc.nextInt();
        FileInputStream fin = new FileInputStream("marksData.txt");
        ObjectInputStream oin = new ObjectInputStream(fin);
        boolean found = false;
        while (true) {
            try {
                Marks obj = (Marks) oin.readObject();

                if (obj.getRollNo() == findRoll) {
                    System.out.println("Marks = " + obj.getMarks());
                    found = true;
                    break;
                }

            } catch (EOFException eof) {
                break;
            }
        }

        if (!found) {
            System.out.println("Roll number not found!");
        }

        oin.close();
        fin.close();
        sc.close();
    }
}
	
