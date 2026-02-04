package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']//tbody/tr/td[1]"));
		System.out.println("1st Column is: ");
		for(int i = 0;i < column.size(); i++)
			
		{
			String text = column.get(i).getText();
			System.out.println(text);
		}
	}


}
