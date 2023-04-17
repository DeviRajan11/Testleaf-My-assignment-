package week4day1;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtrainAssignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://erail.in/");

		Thread.sleep(3000);
		WebElement src = driver.findElement(By.id("txtStationFrom"));
		src.clear();
		src.sendKeys("ms");
		driver.findElement(By.xpath("//div[text()='Chennai Egmore']")).click();
		
		WebElement dest = driver.findElement(By.id("txtStationTo"));
		dest.clear();
		dest.sendKeys("cbe");
		driver.findElement(By.xpath("//div[text()='Coimbatore Jn']")).click();
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
				
		System.out.println("**Printing first column*****");
		List<WebElement> column = driver.findElements(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr"));
		int col = column.size();
		System.out.println("Total Trains = " +col);
		
		for(int i = 2;i<=col;i++)
		{
			String name2 = driver.findElement(By.xpath("//*[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']/tbody/tr["+i+"]/td[2]")).getText();
			System.out.println(name2);
		}
		driver.close();

	}
}
		
		
		
		
		