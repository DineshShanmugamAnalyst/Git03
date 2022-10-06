package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
WebDriver driver;
	@Given("User is on the adactin page")
	public void a() {
	
		WebDriverManager.chromedriver().setup();	
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	
	}
	
	
	@When("User should login {string} and {string}")
	public void b(String name, String pass) {
		  WebElement txtusername = driver.findElement(By.id("username"));
		  txtusername.sendKeys(name);

		  WebElement txtpassword = driver.findElement(By.id("password"));
		  txtpassword.sendKeys(pass);
	
		  WebElement btnLogin = driver.findElement(By.id("login"));
		  btnLogin.click();
	
	
	}
	
	
	@Then("User should verify after login success msg")
	public void c() {

Assert.assertTrue("Verify Login",true);
	}

	@When("User should search hotels {string},{string},{string},{string},{string},{string},{string},{string}")
	public void searchHotels(String location, String hotels, String roomType, String noOfRooms, String checkIn, String checkOut, String adultRoom, String childRoom) {

		 WebElement txtLocation = driver.findElement(By.id("location"));
//		 txtLocation.sendKeys(location);
		 Select select = new Select(txtLocation);
		 select.selectByVisibleText(location);
		  
		 WebElement txtHotels = driver.findElement(By.id("hotels"));
//		 txtHotels.sendKeys(hotels);
		 Select select1 = new Select(txtHotels);
		 select1.selectByVisibleText(hotels);
		  
		  
		 WebElement txtRoomType = driver.findElement(By.id("room_type"));
//		 txtRoomType.sendKeys(roomType);
		 Select select2 = new Select(txtRoomType);
		 select2.selectByVisibleText(roomType);
		 
		 
		 WebElement  txtnoOfRooms = driver.findElement(By.id("room_nos"));
//		 txtnoOfRooms.sendKeys(noOfRooms);
		 Select select3 = new Select(txtnoOfRooms);
		 select3.selectByVisibleText(noOfRooms);
		 
		 
		 
         WebElement txtCheckIn = driver.findElement(By.id("datepick_in"));
         txtCheckIn.sendKeys(checkIn);
		
         WebElement txtCheckOut = driver.findElement(By.id("datepick_out"));
         txtCheckOut.sendKeys(checkOut);
		
         WebElement txtadultRoom = driver.findElement(By.id("adult_room"));
//       txtadultRoom.sendKeys(adultRoom);
         Select select4 = new Select(txtadultRoom);
		 select4.selectByVisibleText(adultRoom);
		 
         
         
         
        WebElement txtChildRoom = driver.findElement(By.id("child_room"));
//      txtChildRoom.sendKeys(childRoom);
        Select select5 = new Select(txtChildRoom);
        select5.selectByVisibleText(childRoom);
        WebElement btnSearch = driver.findElement(By.id("Submit"));
        btnSearch.click();
		}
		

	   @Then("User should verify after search succesful msg")
	   public void searchHotelVerify() {
       Assert.assertTrue("Verify Login",true);
    	}

	  @When("user should select hotel")
	  public void selectHotel() {
     
      WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
	  btnRadio.click();
	  
	  WebElement btnContinue = driver.findElement(By.id("continue"));
	  btnContinue.click();
	  }


	  @Then("User should verify after select succesful msg")
	  public void selectHotelVerify() {
	  Assert.assertTrue("Verify Select a hotel", true);
		  
	  }
	  @When("User should book a hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	  public void bookHotel(String firstName, String lastName, String address, String ccNum, String ccType, String expMonth, String expYear, String cvvNum) {
	  
		  WebElement txtFirstName = driver.findElement(By.id("first_name"));
		  txtFirstName.sendKeys(firstName);
	 
	      WebElement  txtLastName = driver.findElement(By.id("last_name"));
	      txtLastName.sendKeys(lastName);
	    
	      WebElement txtAddress = driver.findElement(By.id("address"));
	      txtAddress.sendKeys(address);
	         
	      WebElement txtccNum = driver.findElement(By.id("cc_num"));
	      txtccNum.sendKeys(ccNum);  
	         
	      WebElement txtccType = driver.findElement(By.id("cc_type"));
//	      txtccType.sendKeys(ccType);
	      Select select = new Select(txtccType);
	      select.selectByValue(ccType);
	      
	      WebElement txtExpMonth = driver.findElement(By.id("cc_exp_month"));
	      txtExpMonth.sendKeys(expMonth);   
//	      Select select1 = new Select(txtExpMonth);
//	      select.selectByIndex(expMonth);
	      
	      
	      WebElement txtExpYear = driver.findElement(By.id("cc_exp_year"));
	      txtExpYear.sendKeys(expYear);
//	      Select select2 = new Select(txtExpYear);
//	      select2.selectByValue(expYear);
	      
	      
	      WebElement txtCvv = driver.findElement(By.id("cc_cvv"));
	      txtCvv.sendKeys(cvvNum);
	   
	      WebElement btnBookNow= driver.findElement(By.id("book_now"));
	      btnBookNow.click();
	           
	      WebElement orderIdNum= driver.findElement(By.id("order_no"));
	      String attributeValue = orderIdNum.getAttribute("Value");
	      System.out.println(attributeValue);
	           
	  }
	  
	  @Then("User should verify after booking succesful msg")
	  public void bookHotelVerify() {

	 Assert.assertTrue("Verify Book a hotel", true);

	  driver.quit();
	  }
		
}