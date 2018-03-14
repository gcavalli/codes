
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {

    /**
     * @param args
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException {
        // Create webDriver reference
        WebDriver driver;
        
        // Launch FirefoxDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\gcavalli\\Downloads\\geckodriver-v0.19.1-win64/geckodriver.exe");
        driver = new FirefoxDriver();
        
        // Open the web page
        driver.get("vmtestdrive.com");
        
        // Enter the text in the search box
        WebElement test = driver.findElement(By.id("identifierId"));
        test.sendKeys("gleisecavalli8@gmail.com");
       
        Thread.sleep(5000);
        
        WebElement botao = driver.findElement(By.id("identifierNext"));
        botao.click();
       
               
        WebElement botao2 = driver.findElement(By.id("passwordNext"));
        botao2.click();
               
        Thread.sleep(5000);
        
        // Close the driver
        driver.quit();

    }
    
}
