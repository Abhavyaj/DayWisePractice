package com.bj;
import java.util.Scanner;
public class StringAlgo {
	public static String shift2Chars(String str) {
		String s=str.substring(2)+str.substring(0,2);
		return s;
	}
	 public String getFromDB() {
		  try {
			  Thread.sleep(2000);
		  }
		  catch(InterruptedException e) {
			  System.out.println("Sleep for 2000");
		  }
		  return "Completed";
	  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println(a+"->"+shift2Chars(a));
	}

}
