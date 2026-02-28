package basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;

public class WordsAtOddIndex {

    public static void main(String[] args) throws IOException {

    	FileReader fr=new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        FileOutputStream fout = new FileOutputStream("wordOutput.txt");

        String line;

        System.out.println("Odd Indexed Words:");

        while ((line = br.readLine()) != null) {

            String[] words = line.split(" ");
            int index = 1;

            for (String word : words) {

                if (index % 2 != 0) {
                    fout.write((word + " ").getBytes());
                    System.out.print(word + " ");
                }

                index++;
            }
        }

        br.close();
        fout.close();

        System.out.println("\nWords copied successfully!");
    }
}