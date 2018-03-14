import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

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
        driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin/");
        
        // Enter the text in the search box
        WebElement test = driver.findElement(By.id("identifierId"));
        test.sendKeys("gleisecavalli@gmail.com");
       
        Thread.sleep(5000);
        
        WebElement botao = driver.findElement(By.id("identifierNext"));
        botao.click();
       
        Thread.sleep(5000);
        
        WebElement passw = driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input"));
        passw.sendKeys("davi@20ester");
        
        Thread.sleep(5000);
        
        WebElement botao2 = driver.findElement(By.id("passwordNext"));
        botao2.click();
               
        Thread.sleep(5000);
        
        // Close the driver
        driver.quit();

    }
    
}
