/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla_icc;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import static org.openqa.selenium.By.xpath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Luciano
 */
public class Pantalla_ICC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        
        driver.navigate().to("https://www.canva.com/design/DAFAOF4JrLA/c_lvXhwMRt2DrP30c-PtnQ/watch?utm_content=DAFAOF4JrLA&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink");
       // WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div[1]"));       
     //   ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
        while (true){
            boolean eleSelected= driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div[1]/button[1]")).isDisplayed();
            
            if(eleSelected){
                WebElement video = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]"));
                video.sendKeys(Keys.SPACE);
                /*robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyRelease(KeyEvent.VK_SPACE);*/
                Thread.sleep(3000);
            }
        }
    }
    
    
    
}
