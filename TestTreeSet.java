import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String args[]){
		
		Set<Employee> set = new TreeSet<>();
		
		set.add(new Employee(110, "kunal", 4545));
		set.add(new Employee(101, "Vivek", 454545));
		set.add(new Employee(99, "Sonu", 43546));
		System.out.println(set);
	}
}
