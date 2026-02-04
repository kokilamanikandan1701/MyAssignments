package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Testleaf\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//span[text()='Phone']")).click();
        driver.findElement(By.name("phoneNumber")).sendKeys("994465236");
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000);
        WebElement firstLead = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]"));
        String leadID = firstLead.getText();
        System.out.println("Captured Lead ID: " + leadID);
        firstLead.click();
        driver.findElement(By.linkText("Delete")).click();
        driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.name("id")).sendKeys(leadID);
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
        Thread.sleep(2000); 
        String message = driver.findElement(By.className("x-paging-info")).getText();
        if (message.equals("No records to display")) 
        {
            System.out.println("deleted successfully!");
        } else 
        {
            System.out.println("No Information.");
        }

              
        driver.quit();




	}

}
