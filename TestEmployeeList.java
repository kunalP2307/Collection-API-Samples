import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.w3c.dom.Text;

public class TestEmployeeList {
	List<Employee> empList = new ArrayList<>();
	
	public List<Employee> getAllNameEndWithL(){
		List<Employee> list = new ArrayList<>();
		Iterator<Employee> iterator = this.empList.iterator();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(e.getName().charAt(e.getName().length()-1) == 'l')
				list.add(e);
		}
		return list;
	}
	
	public double getSalaryOfAll (){
		Iterator<Employee> iterator = this.empList.iterator();
		double sum = 0;
		while(iterator.hasNext()) {
			sum += iterator.next().getSalary();
		}
		return sum;
	}
	
	public double minSalaryPaid() {
		Iterator<Employee> iterator = this.empList.iterator();
		double salary = empList.get(0).getSalary();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(salary < e.getSalary())
				salary = e.getSalary();
		}
		return salary;
	}
	
	public double maxSalaryPaid() {
		Iterator<Employee> iterator = this.empList.iterator();
		double salary = empList.get(0).getSalary();
		while(iterator.hasNext()) {
			Employee e = iterator.next();
			if(salary > e.getSalary())
				salary = e.getSalary();
		}
		return salary;
	}
	
	public int countOfSalaryGT_70() {
		Iterator<Employee> iterator = this.empList.iterator();
		int count = 0;
		while(iterator.hasNext()) {
			if(iterator.next().getSalary() > 70000)
				count++;
		}
		return count;
	}
		
	
	
	public static void main(String args[]) {
		
		TestEmployeeList testEmployeeList = new TestEmployeeList();
		testEmployeeList.empList.add(new Employee(101, "Kunal", 80000));
		testEmployeeList.empList.add(new Employee(102, "Vivek", 90000));
		testEmployeeList.empList.add(new Employee(105, "Gauri", 70000));
		testEmployeeList.empList.add(new Employee(103, "Sonu", 30000));
		testEmployeeList.empList.add(new Employee(106, "Vaishnai", 50000));
		testEmployeeList.empList.add(new Employee(104, "Sahil", 50000));
		Collections.sort(testEmployeeList.empList,new EmpComparator());
		System.out.println(testEmployeeList.empList);
		
		List<Employee> endingWithL = testEmployeeList.getAllNameEndWithL();
		System.out.println(endingWithL);
		System.out.println("Total Salary Paid : "+testEmployeeList.getSalaryOfAll());
		System.out.println("Minimum Salary Paid : "+testEmployeeList.minSalaryPaid());
		System.out.println("Maximum Salary Paid : "+testEmployeeList.maxSalaryPaid());
		System.out.println("Total Employee with salary greater than 70k : "+testEmployeeList.countOfSalaryGT_70());
	}
}
