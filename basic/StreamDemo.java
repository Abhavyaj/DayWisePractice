package basic;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> l1=List.of(23,78,43,65,98,22,54);
		Stream<Integer> st=l1.stream();//creation of stream
		boolean allMatch=st.allMatch(x->x>40);
		System.out.println("All greater than 40 "+ allMatch);
		boolean anyMatch=l1.stream().allMatch(x->x>=75);
		System.out.println("All greater than 75 "+ anyMatch);
		System.out.println(l1.stream().count());//count
		l1.stream().distinct().forEach(System.out::println);//distinct
		l1.stream().filter(x->x>=40).forEach(System.out::println);;
	}

}
