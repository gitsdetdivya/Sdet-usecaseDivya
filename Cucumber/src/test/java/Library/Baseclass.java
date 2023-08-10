package Library;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	
	public static WebDriver driver;
	


@SuppressWarnings("deprecation")
	public   void StartBrowser() throws IOException
    
    {
    	
FileInputStream fi  = new FileInputStream("src\\test\\java\\Config.Properties");
    	
    	Properties prop = new Properties();
    	
    	prop.load(fi);
    	
    	String Browser_Name1 = prop.getProperty("browser");
       	String LoginUrl1 =  prop.getProperty("url");

                 // If the browser is Firefox
               if(Browser_Name1.equalsIgnoreCase("Firefox"))
                {
            	   WebDriverManager.firefoxdriver().setup();
                  // Set the path for geckodriver.exe
                         driver = new FirefoxDriver();
                }

              // If the browser is Chrome
            else if(Browser_Name1.equalsIgnoreCase("Chrome"))
             {
            	WebDriverManager.chromedriver().setup();
                         // Set the path for chromedriver.exe
                  driver = new ChromeDriver();
             }
            // If the browser is IE
          else if(Browser_Name1.equalsIgnoreCase("IE"))
          {
        	  WebDriverManager.edgedriver().setup();
                              // Set the path for IEdriver.exe
                   driver = new EdgeDriver ();
          }
               driver.manage().window().maximize();
           	
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                  driver.get(LoginUrl1); 
                  
                  System.out.println("Page navigated to: " +driver.getTitle());

    
    }
    


}
