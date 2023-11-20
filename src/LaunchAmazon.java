import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LaunchAmazon {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		Select select=new Select(driver.findElement(By.id("searchDropdownBox")));
		select.selectByIndex(10);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile phone");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
