package basic;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileOutputStream;
import java.io.IOException;
public class LinesAtOddIndex {


    public static void main(String[] args) throws IOException {
    	
    	FileReader fr=new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
        FileOutputStream fout = new FileOutputStream("lineOutput.txt");

        String line;
        int index = 1;

        System.out.println("Odd Indexed Lines:");

        while ((line = br.readLine()) != null) {

            if (index % 2 != 0) {
                fout.write((line + "\n").getBytes());
                System.out.println(line);
            }

            index++;
        }

        br.close();
        fout.close();

        System.out.println("Lines copied successfully!");
    }
}
