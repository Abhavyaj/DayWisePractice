package basic;

public class DigitSum {
	public static void main(String[] args) {
		int n=16;
		int d=0,s=0;
		int n1=n;
		int c=0;
		do {
			
			d=0;
			c++;
			s=0;
			while(n1>0) {
				int d1=n1%10;
				s+=d1*d1;
				n1=n1/10;
				
			}
			n1=s;
			if(n==s) {
				System.out.println(c);
				break;}
		}while((s!=n1) && (n1<d*10));
		}
	}


