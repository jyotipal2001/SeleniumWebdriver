package deay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestPro {
@Test
void test() {

	//WebDriver driver=new ChromeDriver();
	WebDriver driver=new ChromeDriver();
	
	
	driver.get("https://www.google.com/");
	String title=driver.getTitle();
	System.out.println(title);
	driver.close();
}
}
