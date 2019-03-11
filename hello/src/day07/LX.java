package day07;


import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LX {
	WebDriver driver;
	String kk;
@BeforeClass
public void hh() {
	System.setProperty("Webdriver.Chrome.driver" ,"./fell/chromedriver.exe");
	driver=new ChromeDriver();
	kk="http://localhost:8080/Exam_ssh/adminLogin.do";
	}
	@Test
	public void jj() {
		driver.get(kk);
	
}
}
