import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
   
        
       
        System.getProperty("webdriver.chrome.driver", "/Users/mdhassan/Downloads/chrome-mac-arm64") ;
        WebDriver driver = new ChromeDriver();

       
        //  // For opening a page :-
        //  driver.get("https://www.google.com/");
        
        //Open the HTML page
        driver.get("http://127.0.0.1:5500/src/Selenium.html");

      
        // Find the input element by its ID
       

        

        // Enter a number into the input field
     
        // WebElement buttonElement = driver.findElement(By.xpath("//button[text()='Display Value']"));
        WebElement buttonElement = driver.findElement(By.id("2"));
    

        buttonElement.click();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement buttonElement1 = driver.findElement(By.id("*"));
      

        buttonElement1.click();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement buttonElement2 = driver.findElement(By.id("3"));
      

        buttonElement2.click();
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement buttonElement4 = driver.findElement(By.id("="));
      

        buttonElement4.click();
       

        int a ;
        a = 5 ;
        while(a>0){
            a-- ;
            WebElement buttonElement5 = driver.findElement(By.id("btn"));
      

            buttonElement5.click();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        // try {
        //     Thread.sleep(2000000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
        // Close the browser
        driver.quit();
    }
}
