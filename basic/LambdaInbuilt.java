package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInbuilt {
	public static void main(String[] args) {
		Consumer<String> c1=(str)->{
			System.out.println("This is a consumer");
			System.out.println("This is a consuming"+str);
		};
		c1.accept(" SPRING FRAMEWORK");
		List<Integer> l1=List.of(45,33,45,65,78,22);
		l1.forEach((x)->System.out.println("consuming "+x));//lambda expression consumer function
		l1.forEach(System.out::println);//similar to consumer functionality so we do method referencing
		Function<String,Integer> f1=(str)->str.length();
		Integer len=f1.apply("Ayush Kumar");
		Function<String,String> f2=(str)->str.substring(0,2).toUpperCase()+str.substring(2);
		String s1=f2.apply("Ayushi");
		System.out.println(s1);
		//supplier
		Supplier<Integer> su=new Supplier<>() {
			@Override
			public Integer get() {
				return new Random().nextInt(400);
			}
		};//lambdaExpression
		Random r=new Random();
		su=()->new Random().nextInt(400);
		System.out.println(su.get());
		//method referencing
		su=r::nextInt;
		System.out.println(su.get());
		//pedicate
		Predicate <String> pred=new Predicate<>(){;
		@Override
		public boolean test(String u) {
			return u.length()>=10;
		}};
		List<Integer> l2=new ArrayList(List.of(100,23,400,453,67));
		l2.removeIf((a)->a>100);
		System.out.println(l2);
		
	}

}
