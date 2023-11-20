import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchFirefox {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	   System.setProperty("webdriver.gecko.driver","C:\\Users\\praka\\Downloads\\geckodriver-v0.32.0-win64\\geckodriver.exe");
       WebDriver driver=new FirefoxDriver();
       driver.get("http://www.amazon.com");
       Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByIndex(10);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile phone");
       driver.findElement(By.xpath("//input[@type='submit']")).click();
	
       
       
	}

}
