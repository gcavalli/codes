import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Email{

	 public static void main(String[] args) throws InterruptedException {
	        // Create webDriver reference
	        WebDriver driver;
	        
	        // Launch Chrome
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gcavalli\\Downloads\\chromedriver_win32/chromedriver.exe");      
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        
	     // Open the web page
	        driver.get("https://email.bol.uol.com.br/login#");
	        
	        // Enter email
	        WebElement email = driver.findElement(By.name("user"));
	        email.sendKeys("wmare2018");
	        email.sendKeys(Keys.ENTER);
	       
	        WebElement passw = driver.findElement(By.name("pass"));
	        passw.sendKeys("wmare382018");
	        passw.sendKeys(Keys.ENTER);	 
	        
	                
	        //buscar algo em 15 seconds e trata exceção
	      try {
	            new WebDriverWait(driver,15).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"mobile-search-list\"]"))).sendKeys("Your Account Information", Keys.ENTER);
	          } catch (Exception e) {
	              // TODO Auto-generated catch block
	          e.printStackTrace();
	          }	
	      
	        Thread.sleep(5000);
	      	WebElement busca = driver.findElement(By.xpath("/html/body/div[3]/div/section[2]/div/div[2]/div/div[2]/section[1]/div/div[4]/ul/li/a/div/div[3]"));
            busca.click();
            
	      	//procurando senha na mensagem  
	      	
	      	Thread.sleep(2000);
	        WebElement passw1= busca.findElement(By.cssSelector("html body.blockImages div.WordSection1 table.MsoNormalTable tbody tr td div table.MsoNormalTable tbody tr td table.MsoNormalTable tbody tr td table.MsoNormalTable tbody tr td table.MsoNormalTable tbody tr td p.value b span"));
	        
	        //boolean existeElement = driver
	        
	        Thread.sleep(2000);
	        //passw1.getText().contains("Password");
	        System.out.println(passw1.getText());
	        
	        
	       //Close the driver
	       driver.quit();	   
	    }
	    
}	
	