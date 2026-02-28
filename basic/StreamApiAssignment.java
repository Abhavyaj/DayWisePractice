package basic;

import java.util.Comparator;
import java.util.List;

import java.util.Optional;
import java.util.function.Predicate;

public class StreamApiAssignment {

	public static void main(String[] args) {
		List<Employee1> list=EmployeeRepository.getEmployees();
		List<Department> list2=EmployeeRepository.getDepartments();
		//sum of salary
		double totalSalary = EmployeeRepository.getEmployees()
		        .stream()
		        .mapToDouble(Employee1::getSalary)   // <-- use Employee1
		        .sum();

        System.out.println("Total Salary = " + totalSalary);
        //Senior most employee
        Optional <Employee1> s2=list.stream()
                .min((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()));
        System.out.println(s2) ; 
        //without department employee
        List<Employee1> list3 = list.stream()
                .filter(emp -> emp.getDepartment() == null)
                .toList();
        System.out.println(list3);
        //employee name, hire date and day of week on which employee has started.
        //sort employees by employee id
        List<Employee1> list4=list.stream().sorted((e1,e2)->e1.getEmployeeId()-e2.getEmployeeId()).toList();
        for (Employee1 emp: list4) {
        	System.out.println(emp.getFirstName()+" "+emp.getEmployeeId());
        }
        //sort employees by department id
        List<Employee1> list5 = list.stream()
                .filter(emp -> emp.getDepartment() != null)
                .sorted(Comparator.comparing(
                        emp -> emp.getDepartment().getDepartmentId()))
                .toList();
        list5.forEach(emp ->System.out.println(emp.getFirstName() + " " + emp.getDepartment().getDepartmentId()));
        //sort by first name
        List<Employee1> list6=list.stream().sorted(Comparator.comparing(
                emp -> emp.getFirstName())).toList();
        for (Employee1 emp: list6) {
        	System.out.println(emp.getFirstName()+" "+emp.getEmployeeId());}
        //Employee who didn't report
        List<String> name= list.stream()
                .filter(emp -> emp.getManagerId() == null)
                .map(Employee1::getFirstName)
                .toList();
        
        /*1.	Find out the sum of salary of all employees. 
2.	List out department names and count of employees in each department. 
3.	Find out the senior most employee of an organization. 
4.	List employee name and duration of their service in months and days. 
5.	Find out employees without department.
6.	Find out department without employees.
7.	Find departments with highest count of employees.
8.	List employee name, hire date and day of week on which employee has started.
9.	Revise exercise 10.13 to list employee name, hire date and day of week for employee started on Friday. (Hint:  Accept the day name for e.g. FRIDAY and list all employees joined on Friday)
10.	List employee’s names and name of manager to whom he/she reports. Create a report in format “employee name reports to manager name”.
11.	List employee name, salary and salary increased by 15%. 
12.	Find employees who didn’t report to anyone (Hint: Employees without manager)  
13.	Create a method to accept first name and last name of manager to print name of all his/her subordinates.  
14.	Sort employees by their 
•	Employee id
•	Department id
•	First name */
        
	}

}
