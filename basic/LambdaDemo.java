package basic;

public class LambdaDemo{
	public static void main(String[] args) {
	//normal class
	MyCalc1 m1=new MyCalc1();
	System.out.println(m1.add(3, 4));
	//anonymous class
	Calc c=new Calc(){
		public int add(int a,int b) {
			return a+b;
		}};
	System.out.println(c.add(4, 5));
	//lambda Expression
	Calc c2=(int a,int b)->{return a+b;};
	System.out.println(c2.add(6, 7));
}}
