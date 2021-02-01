package ForMyLearning;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propertiesdemo {

	String readFile() throws IOException {
		
		File f= new File("C:\\Users\\Vijay\\eclipse-workspace\\Demo\\properties");
		FileInputStream file= new FileInputStream(f);
		Properties p = new Properties();
		p.load(file);
		String browserName=p.getProperty("Browser");
		 String url= p.getProperty("Url");
		System.out.println(browserName);
		 System.out.println(url);
		file.close();
		
		return browserName;
		
	}
	
	public static void main(String args[]) throws IOException {
		propertiesdemo q = new propertiesdemo();
		q.readFile();
		
	}
}
