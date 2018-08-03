package abc_practices;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleFooterLiks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();  // You can use any other web browser.
        driver.get("https://www.google.com/");
        
        Thread.sleep(2000);
        driver.findElement(By.linkText("Privacy")).click();
        
        if(driver.getPageSource().contains("Privacy"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Privacy") );
        
        Thread.sleep(5000);
        
driver.findElement(By.linkText("Terms")).click();
        
        if(driver.getPageSource().contains("Terms"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Terms") );
        
        Thread.sleep(5000);
        
driver.findElement(By.linkText("Settings")).click();
        
        if(driver.getPageSource().contains("Settings"))
        	System.out.println("The test passed");
        else
        	System.out.println("The test failed");
        Assert.assertEquals(true, driver.getPageSource().contains("Settings") );
        
        Thread.sleep(5000);
        driver.close();
        
        

	}

}
