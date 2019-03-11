package day07;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class pio {
	WebDriver driver;
	String re;
	@BeforeClass
	public void yila() {
		System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
		 driver=new  ChromeDriver();
		 re="http://localhost:8080/Banksys_ssh/login.jsp";
	}
	@Test
public void yh() {
		//获取网址
		 driver.get(re); 
		 //输入账号
		 driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545651649057");
		 //输入密码
		 driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();//电击确定
		 //找到镶嵌的页面
	}
	//取款
		 @Parameter("data1")
		 public void qukuan(int data1) {
		driver.switchTo().frame("leftFrame");
		 driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();//定位
		 //跳出页面
		 driver.switchTo().defaultContent();
		 //定位页面
		 driver.switchTo().frame("mainFrame");
		
		 //输入取款金额
		 driver.findElement(By.name("money")).sendKeys("data1");
		 driver.findElement(By.id("smoneyValidate_0")).click();
		 //跳出页面
		 }
		 //打印信息
		 @Test
		 public void daying() {
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("leftFrame");
		 driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("mainFrame");
		 //打印信息
		 String g=driver.findElement(By.xpath("/html/body/center")).getText();
		 System.out.println(g);
		 
			 
		 
}
}
