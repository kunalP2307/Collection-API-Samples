import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<>();
		map.put(101, "Kunal");
		map.put(102, "Shubham");
		
		//LinkedHash Map -> preservers insertion order
		System.out.println(map);
		
	}

}
