package basic;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String images[]= {"image1","image2","image3"};
		List<Thread> l=new ArrayList<>();
		for(int i =0;i<images.length;i++) {
			
			Downloader loader = new Downloader(images[i]);
			;
			Thread thread = new Thread(loader);
			thread.start();
			l.add(thread);
		}
		for(Thread t:l) {
			t.join();
		}
		System.out.println("All images downloaded");
	}

}

