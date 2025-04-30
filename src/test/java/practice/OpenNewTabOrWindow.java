package practice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTabOrWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//open url
		driver.get("https://www.google.com/");
		System.out.println("First page: "+ driver.getTitle());
		
		
		//open another tab and url
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Second Tab: "+ driver.getTitle());
		
		Collection<String> wind = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(wind);
		driver.close();
		driver.switchTo().window(handles.get(0));
		System.out.println("Main page: "+driver.getTitle());
		driver.quit();
	}
}
