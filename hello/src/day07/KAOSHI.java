package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class KAOSHI {
	WebDriver driver;
	String se;
	@BeforeClass
	public void yila() {
		System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
		 driver=new  ChromeDriver();
		 se="http://localhost:8080/Exam_ssh/";
	}
	//进入在线考试
	@Test
	public void dr2() {
	driver.get(se);	
	//进入在线考试
	driver.findElement(By.linkText("开始在线考试")).click();
	//输入学号
	driver.findElement(By.name("stuNumber")).sendKeys("789065");
	//输入姓名
	driver.findElement(By.name("stuName")).sendKeys("苹果");
	driver.findElement(By.name("B1")).click();
	}
	//考试一次
	@Test
	public void kaoshi() {
	WebElement aa=driver.findElement(By.name("examType"));
		Select a=new Select(aa);
		a.selectByIndex(2);
		driver.findElement(By.id("start_b")).click();
		driver.findElement(By.name("questionOption")).click();
		driver.findElement(By.linkText("提交")).click();
		
	}
	

}
