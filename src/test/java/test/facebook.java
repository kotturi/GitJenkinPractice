package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	static WebDriver driver;
	public static void main(String[] args) {

		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		String expTitle=driver.getTitle();
		if(expTitle.equals("Facebook - log in or sign up"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		driver.quit();
	}

}
