package basic;

import java.io.Serializable;

public class Marks implements Serializable {
	int RollNo;
	int Marks;
	public Marks(int rollNo, int marks) {
		super();
		RollNo = rollNo;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "Student {RollNo:"+RollNo+"Marks:"+Marks+"}";
	}
	public int getRollNo() {
		return RollNo;
	}
	
	public int getMarks() {
		return Marks;
	}
	}
	


