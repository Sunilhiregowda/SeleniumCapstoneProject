package seleniumcapstone;

import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class capstone {
			private static WebDriver  driver=null;
			   @BeforeClass
			   public static void setup() {
				   WebDriverManager.edgedriver().setup();
					  driver=new EdgeDriver();
					driver.manage().window().maximize();
			   }
			   @AfterClass
			   public static void windup() {
				   driver.close();
			   }
	// test cases for page 1		  
			   @Test
			   public void testA() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().window().maximize();
			  	String expectedtitle = "My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals("automation page is not available", expectedtitle, actualtitle);
			  }


			  @Test
			  public void testB() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();
			  	
			  	String expectedtitle = "Dresses - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals("dresses store is not available", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  	}
			  @Test
			  public void testC() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[3]/a")).click();
			  	
			  	String expectedtitle = "T-shirts - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals("T-shirts page is not availble", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }

			  @Test
			  public void testD() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")).click();
			  	
			  	String expectedtitle = "Women - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals("women store is not avilable", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }
			  @Test
			  public void testE() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	driver.findElement(By.id("search_query_top")).sendKeys("partyware",Keys.ENTER);
			  	String expectedtitle = "Search - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals(" party ware is not avilable", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }
			  @Test
			  public void testF() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.id("newsletter-input")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
			  	String expectedtitle = "My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals(" mystore is not avilable", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }
			  @Test
			  public void testG() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[3]/a")).click();

			  	String expectedtitle = "Best sales - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals(" Best sellers page  is not avilable", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }
			  @Test
			  public void testH() {
			  	
			  	driver.get("http://automationpractice.com/index.php");
			  	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
			  	
			  	driver.findElement(By.xpath("/html/body/div/div[3]/footer/div/section[3]/ul/li[4]/a")).click();

			  	String expectedtitle = "Stores - My Store";
			  	String actualtitle= driver.getTitle();
			  	Assert.assertEquals(" stores page  is not avilable", expectedtitle, actualtitle);
			  	driver.navigate().back();
			  }


// test  cases for page 2
			  
			  
			  
			  @Test
			  public void testI() {
			     	
			     	driver.get("http://automationpractice.com/index.php");
			     	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
			     	
			    	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
			     	driver.findElement(By.id("email_create")).sendKeys("",Keys.ENTER);
			     	//driver.findElement(By.id("passwd")).sendKeys("",Keys.ENTER);
			     	//driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
			     	String expectedtitle = "Invalid email address.";
			     	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li")).getText();
			     	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
			     	
			     }	  
			
@Test
public void testJ() {
   	
   	driver.get("http://automationpractice.com/index.php");
   	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
   	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
   	driver.findElement(By.id("passwd")).sendKeys("",Keys.ENTER);
   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
   	String expectedtitle = "Password is required.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
   	
   }
@Test
public void testK() {
   	
   	driver.get("http://automationpractice.com/index.php");
  	driver.manage().timeouts().implicitlyWait(2,TimeUnit.MINUTES);
   	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com",Keys.ENTER);
   	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
   	String expectedtitle = "Invalid password.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);
   	
   }

@Test
public void testL() {
   	
   	driver.get("http://automationpractice.com/index.php");
   	driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
   	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
   	driver.findElement(By.id("email")).sendKeys("");
   	driver.findElement(By.id("passwd")).sendKeys("XYZ",Keys.ENTER);
   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button/span")).click();	   	
   	String expectedtitle = "An email address required.";
   	String actualtitle= driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[1]/ol/li")).getText();
   	Assert.assertEquals(" login my store is not avilable", expectedtitle, actualtitle);

   }
@Test
public void testM() {
   	
   	driver.get("http://automationpractice.com/index.php");
   driver.manage().timeouts().implicitlyWait(3,TimeUnit.MINUTES);
   	
  	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
   	driver.findElement(By.id("email")).sendKeys("302khasimvali@gmail.com");
   	driver.findElement(By.id("passwd")).sendKeys("Khasimvali@9381",Keys.ENTER);
   	driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li/a/span")).click();
   	driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();
   	String expectedtitle = "My Store";
   	String actualtitle= driver.getTitle();
   	Assert.assertEquals("  my store is not avilable", expectedtitle, actualtitle);
   }

}