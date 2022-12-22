import java.io.File;

public class TestFile {
	public static void main(String args[]) {
		
		String path = "/home/kunal/Documents/hello.sol";
		File file = new File(path);
		
		if(file.isFile()) {
			System.out.println("The length of File : "+file.length());
		}
		else {
			File subFiles[] = file.listFiles();
			int fileCount = 0;
			int directoryCount = 0;
			for(File f : subFiles) {
				if(f.isFile()) {
					fileCount += 1;
				}
				else {
					directoryCount += 1;
				}
			}
			System.out.println("Total Files : "+fileCount);
			System.out.println("Total Directories : "+directoryCount);
		}
	}
}
