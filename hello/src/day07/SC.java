package day07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SC {
	WebDriver driver;
	String h;
	@BeforeClass
	public void sousuo() {
		System.setProperty("webdriver.chrome.driver","./fell/chromedriver.exe");
		 driver=new  ChromeDriver();
		h="http://localhost:8080/shop1";
	}
	@Test
	public void JR() {
		driver.get(h);//����ҳ��
		//����Ʒ��������
		WebElement a= driver.findElement(By.name("select_type"));
		Select aa=new Select(a);
		aa.selectByIndex(2);
		driver.findElement(By.name("Submit")).click();
		//����Ʒ������
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/input")).click();
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		driver.findElement(By.name("Submit")).click();
		Alert a2=driver.switchTo().alert();
		a2.accept();
		//����Ʒ������Ʒ���;�ȷ����
	WebElement b= driver.findElement(By.name("select_type"));
		Select bb=new Select(b);
		bb.selectByIndex(1);
		driver.findElement(By.name("select_p_name")).sendKeys("����");
		driver.findElement(By.name("Submit")).click();
		//������ҳ��
		driver.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/input")).click();
	}
	@Test
	public void gouwu() {
		//�����û�
		driver.findElement(By.name("c_name")).sendKeys("aaaaaa");
		driver.findElement(By.name("c_pass")).sendKeys("aaa");
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		//�����������ҳ��
		driver.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/table/tbody/tr[4]/td/span/a")).click();
		driver.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[2]")).click();
		
		driver.findElement(By.name("see")).click();
		
	}
	
}
