package Library;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import Elementlocators.Hclwebelemets;
	
	

public class Browser extends Baseclass  {
	
   protected By _menu = By.xpath(Hclwebelemets.Menuhcl);
   protected By _contactus = By.xpath(Hclwebelemets.Contactus);
   protected By _aboutus = By.xpath(Hclwebelemets.Aboutus);

  
   protected By _fullname = By.xpath(Hclwebelemets.Fullname);
   protected By _errfullname = By.xpath(Hclwebelemets.ErrFullname);

   protected By _email = By.xpath(Hclwebelemets.Email);
   protected By _erremail = By.xpath(Hclwebelemets.errEmail);

   protected By _Mobile = By.xpath(Hclwebelemets.Mobile);
   protected By _errMobile = By.xpath(Hclwebelemets.errMobile);

   protected By _Country = By.xpath(Hclwebelemets.Country);
   protected By _errCountry = By.xpath(Hclwebelemets.errCountry);

   protected By _relation = By.xpath(Hclwebelemets.Relation);
   protected By _errrelation = By.xpath(Hclwebelemets.errRelation);

   protected By _desc = By.xpath(Hclwebelemets.Description);
   protected By _errdesc = By.xpath(Hclwebelemets.errDescription);

   protected By _Upload = By.xpath(Hclwebelemets.Upload);
   protected By _submitbtn = By.xpath(Hclwebelemets.Submit);
    
      
	
    public void  Getmenulist() throws InterruptedException, IOException   
    {
   
		 System.out.println("Printing List of Main Menus in HCLTECH webpage");
		 

		 ArrayList<Integer> numbers = new ArrayList<>();
		    numbers.add(5);
		    numbers.add(6);
		    numbers.add(8);
		    numbers.add(9);
		    numbers.add(10);
		    
		    int size = numbers.size();


		    System.out.println("ArrayList: " + size);

		    System.out.println("Iterating over ArrayList:");
		      
         for ( int i = 0  ; i < size ; i++) {
        	 

			WebElement  mainMenu = driver.findElement(By.xpath("//*[@id='block-mainnavigationbt']/li[" + numbers.get(i) + "]"));

              Actions a = new Actions(driver);
                
              a.moveToElement(mainMenu).build().perform();  
             
              mainMenu.click();
              Thread.sleep(3000);

               System.out.println("Main MENU  :"+mainMenu.getText());

               System.out.println("Sub Menu List of :"+ mainMenu.getText());

          }
            
    }     
            
   
   
   @SuppressWarnings("deprecation")
public void contactus() throws InterruptedException, AWTException 
   
   {
	   
		WebElement  Contactus = driver.findElement(_contactus);
		
		Contactus.click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement  Fullname = driver.findElement(_fullname);

		Fullname.sendKeys("Divya");
		
		WebElement  Email = driver.findElement(_email);
		Email.sendKeys("testhcl@hcl.com");
		
		WebElement  mobile = driver.findElement(_Mobile);
		mobile.sendKeys("923445643");
		
		Select drpCountry = new Select(driver.findElement(_Country));
		drpCountry.selectByIndex(5);
		
		Select relation = new Select(driver.findElement(_relation));

		relation.selectByVisibleText("Partners and Alliances");
		WebElement  Desc = driver.findElement(_desc);
		Desc.sendKeys("SDET AUTOMATIONCASESTUDY");
				 
		    JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
		    js.executeScript("window.scrollBy(0,200)"); 
		    Thread.sleep(2000); // suspending execution for specified time period

		  WebElement browse =driver.findElement(_Upload);

		   //click ’ to upload the desired file
		   browse.click(); //Uploading the file using sendKeys
		   
		   Robot rb = new Robot();
		   
		    // copying File path to Clipboard
		    StringSelection str = new StringSelection("C:\\projectScreenshots\\SDET.txt");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    // release Contol+V for pasting
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		   System.out.println("File is Uploaded Successfully");
		 

   }
   
   
   @SuppressWarnings("deprecation")
   public void Validations() throws InterruptedException, AWTException 
      
      {
   	   
   		WebElement  Contactus = driver.findElement(_contactus);
   		
   		Contactus.click();
   		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
   		Actions a = new Actions(driver);
   	   a.sendKeys(Keys.PAGE_DOWN).build().perform();
   	   a.sendKeys(Keys.PAGE_DOWN).build().perform();
       
   	    Thread.sleep(3000);

		WebElement  submit = driver.findElement(_submitbtn);
		
		  submit.click();
          
          String  Experr_Name = "Full Name field is required.";
          
          String Actual_errname = driver.findElement(_errfullname).getText();
          
          if (Experr_Name.equalsIgnoreCase(Actual_errname))
        	  
          {
        	  
        	  Assert.assertEquals(Actual_errname, Experr_Name,"name: Error Exist" );
        	  
        	  System.out.println("err");
        	  
          }
          
          else 
          {
         	 System.out.println("full name -Error Mismatch");
          }         
          
          
          String Exp_Email = "Business Email Address field is required.";
          
          String Actual_email = driver.findElement(_erremail).getText();

          
       if (Exp_Email.equalsIgnoreCase(Actual_email))
        	  
          {
        	  
        	  Assert.assertEquals(Actual_email, Exp_Email,"email: Error Exist" );
        	  
        	  System.out.println("err");

          }
          
       else 
       {
      	 System.out.println("email-Error Mismatch");
       }
     
          
        String Exp_Mobile = "Phone/ Mobile field is required.";
   
       String Actual_Mobile = driver.findElement(_errMobile).getText();

   
     if (Exp_Mobile.equalsIgnoreCase(Actual_Mobile))
 	  
      {
 	  
 	  Assert.assertEquals(Actual_email, Exp_Email,"phError Exist" );
	  System.out.println("err");
 	  
      }
     
     else 
     {
    	 System.out.println("phn-Error mismatch");
     }
       
     
       String Exp_country = "Country field is required.";
     
       String Actual_country = driver.findElement(_errCountry).getText();

     
       if (Exp_country.equalsIgnoreCase(Actual_country))
   	  
        {
   	   
   	    Assert.assertEquals(Actual_country, Exp_country,"cn -Error Exist" );
  	    System.out.println("err");

        }
       
       else 
       {
      	 System.out.println("oountry Error Mismatch");
       }
           
       String Exp_rel = "Relationship to HCLTech field is required.";    
       String Actual_rel= driver.findElement(_errrelation).getText();

       
         if (Exp_rel.equalsIgnoreCase(Actual_rel))
     	  
          {
     	  
     	  Assert.assertEquals(Actual_rel, Exp_rel,"rel -Error Exist" );
    	  System.out.println("err");

     	  
          }
         
         else 
         {
        	 System.out.println("rel - Error Mismatch");
         }
       

         String Exp_Desc = "How can we help you? field is required.";       
         String Actual_Desc= driver.findElement(_errdesc).getText();

         
           if (Exp_Desc.equalsIgnoreCase(Actual_Desc))
       	  
            {
       	  
       	    Assert.assertEquals(Actual_Desc, Exp_Desc,"desc -Error Exist" );
      	    System.out.println("err");

       	  
            }
 
           else 
           {
          	 System.out.println("desc -Error Mismatch");
           }               
   		   		
      }
   
 public void close()
   
   {
       driver.quit();

   }
   
 @SuppressWarnings("deprecation")
public void Aboutus() throws InterruptedException, AWTException 
 
 {
	   
		WebElement  Aboutus = driver.findElement(By.linkText("About Us"));
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		Actions a = new Actions(driver);
           
        a.moveToElement(Aboutus).build().perform();  
          
        System.out.println( Aboutus.getText());
        
        a.click();
        
        Thread.sleep(3000);
          
		WebElement  Leadership = driver.findElement(By.linkText("Leadership"));

        a.moveToElement(Leadership).build().perform();  
        
        a.doubleClick();
        
               
        //driver.findElement(By.cssSelector("//h4[text()='Roshni Nadar Malhotra']")).click();	
        
        Thread.sleep(3000);
   
	   
 }
 
 
}

  

          
         
        	 
         

         
    
  

             
         
           
    
            
    

    	
    	
    	
    

    
    
    
    
    
 