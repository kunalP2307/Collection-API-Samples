import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TextArrayList {
	int arr[] = new int[9];

	public static void main(String args[]) {
		List<String> list = new ArrayList();
		TextArrayList t = new TextArrayList();
		System.out.println(t.arr[8]);
		
		list.add("kunal");
		list.add("Tejas");
		
		System.out.println(list);
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
			
		}
	
		ListIterator<String> listIterator = list.listIterator();	
		System.out.println("ListIterator");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("ListIterator Previous");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
	}
	
}
