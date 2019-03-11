package day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class shangcheng {
	WebDriver driver;
	String g;
	@BeforeClass
	//进入网页
	public void yj() {
		System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
		 driver=new  ChromeDriver();
		g="http://localhost:8080/shop1";
	}
	@Test
	public void yjfk() {
		driver.get(g);
		//登入用户
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		//进入意见反馈
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[4]/td/span/a")).click();
		//发表意见
		driver.findElement(By.name("c_message")).sendKeys("商品质量好");
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}

}
