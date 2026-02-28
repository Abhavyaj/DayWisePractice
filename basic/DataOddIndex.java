package basic;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.IOException;

public class DataOddIndex {

    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("data.txt");
        FileOutputStream fout = new FileOutputStream("datacop.txt");

        int ch;
        int index = 1;

        while ((ch = fin.read()) != -1) {

            if (index % 2 != 0) { 
                fout.write(ch);
            }

            index++;
        }

        fin.close();
        fout.close();

        System.out.println("Odd indexed characters copied successfully!");
    }
}