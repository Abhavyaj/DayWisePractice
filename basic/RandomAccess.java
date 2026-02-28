package basic;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
	public static void main(String[] args) throws IOException {
		RandomAccessFile file=new RandomAccessFile("data.txt","r");
		long l = file.length();
        if (l < 2) {
            System.out.println("Errror");
        } else {
            file.seek((int)(l - 3));
            char ch1 = (char) file.read();
            char ch2 = (char) file.read();
            System.out.println("Last two characters: " + ch1 + ch2);
        }
        file.close();
	}

}
