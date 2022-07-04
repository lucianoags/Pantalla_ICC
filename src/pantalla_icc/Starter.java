/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pantalla_icc;

import java.awt.event.KeyEvent;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author Luciano
 */
public class Starter {

    public Starter() throws InterruptedException {
        start_screen();
    }
    
    public void start_screen() throws InterruptedException{
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\lib\\chromedriver.exe");
        
        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        option.setExperimentalOption("useAutomationExtension", false);
        

        WebDriver driver = new ChromeDriver(option);
        
        String link = "https://www.canva.com/design/DAE9EqqtLEU/0Gf8QzvbnsxdWVItSJgRAg/watch?utm_content=DAE9EqqtLEU&utm_campaign=designshare&utm_medium=link&utm_source=publishsharelink";

        driver.navigate().to(link);
       // WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div[3]/div[1]"));
     //   ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", element);
     
        WebElement fullScreen = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[5]/div/div/div[2]/div[2]/button[2]"));
        fullScreen.sendKeys("f");
        WebElement video = driver.findElement(By.xpath("/html/body"));
        WebElement overlay1 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[3]"));
        WebElement overlay2 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[4]"));
        WebElement overlay3 = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[5]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", overlay1);
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", overlay2);
        ((JavascriptExecutor)driver).executeScript("arguments[0].style.visibility='hidden'", overlay3);
        Thread.sleep(1000);
        video.sendKeys(Keys.SPACE);
        Dimension startSize = driver.manage().window().getSize();
        int startHight = startSize.getHeight();
        int startWidth =  startSize.getWidth();
        while (true){
            //boolean eleSelected= driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[5]/div/div/div[2]/div[1]/button")).isEnabled();
                Dimension actualSize = driver.manage().window().getSize();
                int actualHight = actualSize.getHeight();
                int actualWidth = actualSize.getWidth();
        	String inicio = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[5]/div/div/div[2]/div[1]/div[1]/label/time[1]")).getAttribute("textContent");
        	String fin = driver.findElement(By.xpath("/html/body/div[1]/div/main/div/div[5]/div/div/div[2]/div[1]/div[1]/label/time[2]")).getAttribute("textContent");
        	if (inicio.equals(fin) && fin.length()>0) {
                    Thread.sleep(1000);				
                    video.sendKeys(Keys.SPACE);
                    Thread.sleep(3000);
                }
                if(startHight > actualHight || startWidth > actualWidth)
                {
                    driver.close();
                    break;
                }                    
                
        }
        driver.quit();
    }
}
