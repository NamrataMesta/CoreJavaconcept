import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchGmail {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("mesta.namrata@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
		
		

	}

}
