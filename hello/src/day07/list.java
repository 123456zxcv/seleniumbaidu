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
	 //��������
	 driver.findElement(By.name("password")).sendKeys("123456");
	 driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();//���ȷ��
	 //�ҵ���Ƕ��ҳ��
	 driver.switchTo().frame("leftFrame");
	 driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 driver.findElement(By.id("fmoneyValidate_money")).sendKeys("100");
	 driver.findElement(By.id("fmoneyValidate_0")).click();
	 //��ӡȡ����Ϣ
	String a=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(a);
	 //ҳ�����ת
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("leftFrame");//��λҳ��
	driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 //��ӡ������Ϣ
	 String h=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(h);
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("leftFrame");
	 driver.findElement(By.xpath("/html/body/p[3]/a/img")).click();
	 driver.switchTo().defaultContent();
	 driver.switchTo().frame("mainFrame");
	 //����������Ľ��
	 driver.findElement(By.id("fmoneyValidate_money")).sendKeys("1500");
	 driver.findElement(By.id("fmoneyValidate_0")).click();
	 //��ӡ������ʾ��Ϣ
	String b=driver.findElement(By.xpath("/html/body/center")).getText();
	 System.out.println(b);
	 
	}
}
