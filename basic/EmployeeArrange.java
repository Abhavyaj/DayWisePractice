package basic;

import java.util.ArrayList;
import java.util.List;


public class EmployeeArrange {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        list.add(new Employee(10, "Vaduni"));
        list.add(new Employee(20, "Bhavya"));
        list.add(new Employee(30, "Ayushi"));
        list.add(new Employee(40, "Harshita"));
        //lambdaExpression
        list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee e : list) {
            System.out.println(e.getId() + " " + e.getName());
        }
    }
}

			
		
	


