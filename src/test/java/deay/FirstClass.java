package deay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hhh");
		
		
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
