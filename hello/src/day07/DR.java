package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DR {

	WebDriver driver;
	String re;
	@BeforeClass
	public void yila() {
		System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
		 driver=new  ChromeDriver();
		 re="http://localhost:8080/Exam_ssh/adminLogin.do";
	}
	@Test
	//进入后台，登入账号
	public void dr() {
		 driver.get(re); 
		 driver.findElement(By.name("name")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin");
		 driver.findElement(By.name("B1")).click();
	}
	@Test
	public void tianjia() {
		driver.findElement(By.xpath("//*[@id=\"questionChild\"]/a[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"testName\"]")).sendKeys("c语言");
		 driver.findElement(By.id("testTime")).sendKeys("2018-12-30");
		 driver.findElement(By.name("submit")).click();
		 driver.findElement(By.id("title")).sendKeys("5*5=");
		 
		Select c=new Select(driver.findElement(By.id("score")));
		c.selectByIndex(5);
		
		Select d=new Select(driver.findElement(By.id("level")));
		d.selectByIndex(2);
		
		Select e=new Select(driver.findElement(By.id("note")));
		d.selectByIndex(2);
		
		driver.findElement(By.id("choices")).sendKeys("1:25:8");
		
		driver.findElement(By.name("standardAnswer")).sendKeys("25");
		
		driver.findElement(By.name("submit")).click();
		
		
		}
	@Test		
	public void edayin() {
		WebElement shiti=driver.findElement(By.className("Xsmall"));
		System.out.println(shiti.getText());
	}
	
	@Test		
	public void faddxuesheng() {
		driver.findElement(By.linkText("添加考生数据")).click();
		
		driver.findElement(By.id("id")).sendKeys("1234555556789012");
		
		driver.findElement(By.id("realname")).sendKeys("苹果");
		
		driver.findElement(By.id("stuNumber")).sendKeys("789065");
	
		driver.findElement(By.id("className")).sendKeys("测试四班");
	
		driver.findElement(By.id("address")).sendKeys("江西");
	
		driver.findElement(By.id("phone")).sendKeys("567");
	
		driver.findElement(By.id("email")).sendKeys("hjio");

		driver.findElement(By.id("humanId")).sendKeys("asdfg");
		
		driver.findElement(By.name("submit")).click();
	}
	
	@Test		
	
	public void gdayinxuesheng() {
		WebElement gg=driver.findElement(By.className("Xsmall"));
		System.out.println(gg.getText());
	}
}


