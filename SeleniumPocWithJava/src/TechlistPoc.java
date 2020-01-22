
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TechlistPoc {
	
static WebDriver driver;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrivers\\chromedriver.exe");

		driver = new ChromeDriver();
		
	driver.get("https://www.techlistic.com/2016/06/top-6-demo-websites-for-practice.html");
	driver.manage().window().maximize();
	driver.findElement(By.linkText("AUTOMATION PRACTICE FORM")).click();
	driver.findElement(By.xpath("//input[@name = 'firstname']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("xyz");
	driver.findElement(By.xpath("//input[@id='sex-1']")).click();
	driver.findElement(By.xpath("//input[@id='exp-5']")).click();
	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("01/22/2020");
	driver.findElement(By.xpath("//input[@id='profession-1']")).click();
	driver.findElement(By.xpath("//input[@id='tool-2']")).click();
	WebElement Continent = driver.findElement(By.id("continents"));
	Select oSelect = new Select(Continent);
	oSelect.selectByIndex(5);
	WebElement SeleniumCommands = driver.findElement(By.id("selenium_commands"));
	Select sCommand = new Select(SeleniumCommands);
	sCommand.selectByVisibleText("WebElement Commands");
	driver.get("https://www.techlistic.com/2016/06/top-6-demo-websites-for-practice.html");


	}

}
