package basic;

public class ThreadDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 =Thread.currentThread();
		System.out.println("main"+t1);
		ChildThread t = new ChildThread();
		t.start(); //will execute run in new thread and return at the same time
		ChildThread2 obj = new ChildThread2();
		Thread t2 = new Thread(obj);
		t2.start();
		for(int i=1;i<=100;i++) {
			System.out.println("main :" + i);
		}
		
}}
class ChildThread extends Thread{
	//public ChildThread(ThreadGroup grp) {
		//super(grp,"dummy");
		
	//}
	public void run() {
		Thread t1 =Thread.currentThread();
		System.out.println("child"+t1);
		for(int i=1;i<=100;i++) {
			System.out.println("child :" + i);
		}
	}
}

//runnable interface
class ChildThread2 implements Runnable{
	@Override
	public void run() {
		Thread t1 =Thread.currentThread();
		System.out.println("child2"+t1);
		for(int i=1;i<=100;i++) {
			System.out.println("child2 :" + i);
		}
	}
}
