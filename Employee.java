import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	private int eId;
	private String name;
	private double salary;
	
	public Employee(int eId, String name, double salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	
	
	
	public int geteId() {
		return eId;
	}


	public void seteId(int eId) {
		this.eId = eId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double  getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
	}



	@Override
	public int compareTo(Employee o) {
		if(this.eId > o.geteId())
			return 1;
		else if(this.eId < o.geteId())
			return -1;
		return 0;
	}



	
}
