
    import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	public class Erro_Login {
	
		public static void main (String[] args) throws InterruptedException {
		        // Create webDriver reference
		        WebDriver driver;
		        
		        // Launch Chrome
		        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcavalli\\Downloads\\chromedriver_win32/chromedriver.exe");      
		        driver = new ChromeDriver();
		        
		     // Open the web page
		        driver.get("https://vmtestdrive.com");
		        
		        // Enter email
		        driver.findElement(By.xpath("/html/body/app-root/div[1]/div/div/div[1]/div/div[4]/a[1]")).click();
		       
		        //Leave the email blank
		        WebElement email = driver.findElement(By.id("email"));
		        email.sendKeys("");
		        email.submit();
		        boolean error = driver.getPageSource().contains("This field is required");
		        System.out.println(error);
		        
		        //email.sendKeys("wmare2018");
		        //email.sendKeys(Keys.ENTER);
		       
		        //WebElement passw = driver.findElement(By.name("pass"));
		        //passw.sendKeys("wmare382018");
		        //passw.sendKeys(Keys.ENTER);	 
		        
		                
		        //buscar algo em 15 seconds e trata exceção
		     // try {
		        //    new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mobile-search-list\"]"))).sendKeys("Your Account Information", Keys.ENTER);
		         // } catch (Exception e) {
		              // TODO Auto-generated catch block
		       //   e.printStackTrace();
		        //  }	
		      //
		       // Thread.sleep(5000);
		      	//driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/div/div[2]/div/div[2]/section[1]/div/div[4]/ul/li/a/div/div[3]")).click();

		      	//procurando senha na mensagem  
		      	
		      	      	
		      	//var elemento = browser.FindElement(By.Id("task201")).GetAttribute("innerText");
		      	//Thread.sleep(5000);
		       // WebElement passw1= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td/div/table/tbody/tr/td/table[2]/tbody/tr/td[2]/table/tbody/tr/td/table[3]/tbody/tr/td[1]/p[5]/b/span"));
		        //System.out.println(passw1.getText());
		        
		        
		       //Close the driver
		      // driver.quit();	   
		    
	}	
		
}
