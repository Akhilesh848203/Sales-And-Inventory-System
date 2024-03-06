package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class FeatchingDataFromProprtiesFile_001 
{
	static String browser;
	static String url;
	static String username;
	static String password;

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/WritingDataIntoPropertiesFile.properties");

		Properties p = new Properties();
		p.load(fis);
		
		p.setProperty("browser", "chrome");
		p.setProperty("url", "https:www.facebook.com");
		p.setProperty("username", "akhilesh");
		p.setProperty("password", "123456789");
		FileOutputStream fos = new FileOutputStream("./src/test/resources/WritingDataIntoPropertiesFile.properties");
		p.store(fos, "hello");

}
}
