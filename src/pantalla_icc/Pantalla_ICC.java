/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla_icc;
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
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        
        driver.navigate().to("https://google.com/");
    }
    
    
    
}
