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
		//��ȡ��ַ
		 driver.get(re); 
		 //�����˺�
		 driver.findElement(By.id("loginValidate_userNO")).sendKeys("1545651649057");
		 //��������
		 driver.findElement(By.name("password")).sendKeys("123456");
		 driver.findElement(By.xpath("//*[@id=\"loginValidate_0\"]")).click();//���ȷ��
		 //�ҵ���Ƕ��ҳ��
	}
	//ȡ��
		 @Parameter("data1")
		 public void qukuan(int data1) {
		driver.switchTo().frame("leftFrame");
		 driver.findElement(By.xpath("/html/body/p[2]/a/img")).click();//��λ
		 //����ҳ��
		 driver.switchTo().defaultContent();
		 //��λҳ��
		 driver.switchTo().frame("mainFrame");
		
		 //����ȡ����
		 driver.findElement(By.name("money")).sendKeys("data1");
		 driver.findElement(By.id("smoneyValidate_0")).click();
		 //����ҳ��
		 }
		 //��ӡ��Ϣ
		 @Test
		 public void daying() {
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("leftFrame");
		 driver.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		 driver.switchTo().defaultContent();
		 driver.switchTo().frame("mainFrame");
		 //��ӡ��Ϣ
		 String g=driver.findElement(By.xpath("/html/body/center")).getText();
		 System.out.println(g);
		 
			 
		 
}
}
