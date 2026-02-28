package basic;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyFile {
//Copying file data from one file to another
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fin=new FileInputStream("data.txt");
		
		FileOutputStream fout=new FileOutputStream("datacop.txt");
		int ch=0;
		while((ch)!=-1) {
			ch=fin.read();
			if(ch==-1)break;
			fout.write(ch);	
		}
		fin.close();
		fout.close();
		System.out.println("File Copied");
	}

}
