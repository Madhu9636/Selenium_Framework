package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("C:\\Spring\\Automation\\selenium\\src\\test\\resources\\configfiles\\config.properties");
		System.out.println("sfudgbcfhsdc");
		Properties p=new Properties();
		p.load(reader);
	}

}
