package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");
		driver.findElement(By.cssSelector("button[onclick='showAlert()']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("button[onclick='myMessage()']")).click();
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
		driver.findElement(By.cssSelector("button[onclick='myDesk()']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.cssSelector("button[onclick='myPromp()']")).click();
		driver.switchTo().alert().sendKeys("Vishnukant");
		Thread.sleep(6000);
		driver.switchTo().alert().accept();
	}
}
