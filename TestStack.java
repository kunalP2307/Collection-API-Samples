import java.util.List;
import java.util.Stack;

public class TestStack {
	public static void main(String args[]) {
		
		List<String> stack = new Stack<>();
		
		stack.add("Kunal");
		stack.add("Tejas");
		stack.add("Shubham");
		
		System.out.println(stack);
			
		System.out.println(stack.hashCode());
	}

}
