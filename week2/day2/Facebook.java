package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Karthikeyan");
		driver.findElement(By.name("lastname")).sendKeys("A C");
		WebElement dateDD=driver.findElement(By.id("day"));
		Select Date=new Select(dateDD);
		Date.selectByValue("14");
		WebElement monthDD=driver.findElement(By.id("month"));
		Select Month=new Select(monthDD);
		Month.selectByValue("11");
		WebElement yearDD=driver.findElement(By.id("year"));
		Select Year=new Select(yearDD);
		Year.selectByValue("2000");
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//Select Gender=new Select(GenderDD);
		//Gender.selectByValue("1");
		//GenderDD.click();
		driver.findElement(By.name("websubmit")).click();
}
}
