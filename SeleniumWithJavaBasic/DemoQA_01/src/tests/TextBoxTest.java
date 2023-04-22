package tests;

import org.checkerframework.checker.units.qual.h;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

import common.TestBase;

public class TextBoxTest {
	// Testcase_01 of TextBox
	public void testcase01() {
		TestBase testBase = new TestBase();
		testBase.openWebBroswser();
		String inputName = "maihuongle";
		String inputEmail = "maihuongle28@gmail.com";
		String inputCurrentAddress = "ha noi";
		String inputPernamentAddress = "nam dinh";
		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("maihuongle");
		testBase.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("maihuongle28@gmail.com");
		testBase.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("ha noi");
		testBase.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("nam dinh");
		
		WebElement pernamentAddressElement = testBase.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		WebElement submitElement = testBase.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
		
			((JavascriptExecutor)testBase.dr).executeScript("window.scrollTo(0,document.body.scrollHeight)",submitElement);
		submitElement.click();
		String actualName = testBase.dr.findElement(By.xpath("//*[@id=\"name\"]")).getText();
		String actualEmail = testBase.dr.findElement(By.xpath("//*[@id=\"email\"]")).getText();
		String actualCurrentAddress = testBase.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).getText();
		String actualPernamentAddress = testBase.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).getText();
		System.out.println(actualName);
		System.out.println(actualEmail);
		System.out.println(actualCurrentAddress);
		System.out.println(actualPernamentAddress);
		
		if(actualName.contains(inputName)){
			System.out.println("passed");
		}
		if(actualEmail.contains(inputEmail)){
			System.out.println("passed");
		}	
		if(actualCurrentAddress.contains(inputCurrentAddress)){
			System.out.println("passed");
		}
		if(actualPernamentAddress.contains(inputPernamentAddress)){
			System.out.println("passed");
		}
	}
	
	
	//Testcase_02 of TextBox
	public void testcase02() {
		TestBase testBase = new TestBase();
		testBase.openWebBroswser();
		String inputName = "maihuongle";
		String inputEmail = "maihuongle28gmail.com";
		String inputCurrentAddress = "ha noi";
		String inputPernamentAddress = "nam dinh";
		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("maihuongle");
		testBase.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).sendKeys("maihuongle28gmail.com");
		testBase.dr.findElement(By.xpath("//*[@id=\"currentAddress\"]")).sendKeys("ha noi");
		testBase.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]")).sendKeys("nam dinh");
		
		WebElement pernamentAddressElement = testBase.dr.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
		WebElement submitElement = testBase.dr.findElement(By.xpath("//*[@id=\"submit\"]"));
		
			((JavascriptExecutor)testBase.dr).executeScript("window.scrollTo(0,document.body.scrollHeight)",submitElement);
		submitElement.click();
		
		//get boder color of element 'userEmail'
		String borderColor = testBase.dr.findElement(By.xpath("//*[@id=\"userEmail\"]")).getCssValue("border-top-color");
		System.out.println(borderColor);
		
		//convert format color to hex 
		String hexColor = Color.fromString(borderColor).asHex();
		System.out.println(hexColor);
		if(hexColor.equals("#ff0000"))
			System.out.println("Testcase02 passed");
		else {
			System.out.println("Tescase02 failed");
		}
		
		
	
	}

	}
