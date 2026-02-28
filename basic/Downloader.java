package basic;

public class Downloader extends Thread{
	String images;
	Downloader (String images){
		this.images = images;
	}
	@Override
	public void run() {
		try {
		Thread.sleep(1000);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(" downloading: " + images);
	}
}
