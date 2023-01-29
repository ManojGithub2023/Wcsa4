package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyData {
public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Data/confi.properties");// provide the path of properties
	Properties prop = new Properties();//to read the data
	prop.load(fis);//use to read the file
	String data = prop.getProperty("Password");
	System.out.println(data);
}
}
