package day07;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class list {
@Test
	public void del() {
	System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
	WebDriver driver=new  ChromeDriver();
	String se="http://localhost:8080/Banksys_ssh/login.jsp";
	 driver.get(se); 
	 driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545651649057");
	 //输入密码
	 driver.findElement(By.name("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();//电击确定
	 //找到镶嵌的页面
	 driver.switchTo().frame("leftFrame");
	 driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 driver.findElement(By.id("fmoneyValidate_money")).sendKeys("100");
	 driver.findElement(By.id("fmoneyValidate_0")).click();
	 //打印取款信息
	String a=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(a);
	 //页面的跳转
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("leftFrame");//定位页面
	driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 //打印交易信息
	 String h=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(h);
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("leftFrame");
	 driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 //输入大于余额的金额
	 driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1500");
	 driver.findElement(By.id("fmoneyValidate_0")).click();
	 //打印错误提示信息
	String b=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(b);
	 
	}
}
