import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class TestProperties {
	public static void main(String args[]) {
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("employee.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p =new Properties();
		try {
			p.load(fileReader);
			System.out.println(p.getProperty("user"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
