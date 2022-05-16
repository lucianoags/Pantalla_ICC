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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Luciano
 */
public class Pantalla_ICC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        Robot robot = new Robot();
        
        driver.navigate().to("https://www.canva.com/design/DAFAOF4JrLA/c_lvXhwMRt2DrP30c-PtnQ/watch?utm_content=DAFAOF4JrLA&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink");
        robot.keyPress(KeyEvent.VK_SPACE);
        robot.keyRelease(KeyEvent.VK_SPACE);
    }
    
    
    
}
