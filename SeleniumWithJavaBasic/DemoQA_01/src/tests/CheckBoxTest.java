package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.TestBase;

public class CheckBoxTest {
	public void checkBoxTestCase() {
		TestBase testBase = new TestBase();
		testBase.openWebBroswser();
		String text = "You have selected :\r\n"
				+ "home\r\n"
				+ "desktop\r\n"
				+ "notes\r\n"
				+ "commands\r\n"
				+ "documents\r\n"
				+ "workspace\r\n"
				+ "react\r\n"
				+ "angular\r\n"
				+ "veu\r\n"
				+ "office\r\n"
				+ "public\r\n"
				+ "private\r\n"
				+ "classified\r\n"
				+ "general\r\n"
				+ "downloads\r\n"
				+ "wordFile\r\n"
				+ "excelFile";
		testBase.dr.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"item-1\"]/span")).click();
		testBase.dr.findElement(By.xpath("//*//*[@id=\"tree-node\"]/ol/li/span/label/span[1]")).click();
		testBase.dr.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button")).click();
		
		//No1. Verify The [Home] checkbox is unchecked.
		WebElement checkboxHome = testBase.dr.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/label/span[1]"));
		if(checkboxHome.isEnabled()) {
			System.out.println("[Home] checkbox is checked");
		}
		else {
			System.out.println("[Home] checkbox is unchecked");
		}
		
		//No2. Verify that Text is shown: "You have selected : home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile"
		//Get text in screen
		String textResult = testBase.dr.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		//compare results
		if(textResult.equals(text)) {
			System.out.println("The text displayed is the same as in the screen");
		}
		else {
			System.out.println("The text displayed is different from the screen");
		}
		
		//No3. Verify that All checkboxes are displayed and checked:
		//Desktop
		//Documents
		//Downloads
		
		WebElement checkboxDesktop = testBase.dr.findElement(By.cssSelector("label[for='tree-node-desktop']"));
		WebElement checkboxDocument = testBase.dr.findElement(By.cssSelector("label[for='tree-node-documents']"));
		WebElement checkboxDownload = testBase.dr.findElement(By.cssSelector("label[for='tree-node-downloads']"));
		if(checkboxDesktop.isDisplayed() && checkboxDocument.isDisplayed() && checkboxDownload.isDisplayed()) {
			System.out.println("All Checkboxs are displayed");
		}
		if(checkboxDesktop.isEnabled()&& checkboxDocument.isEnabled()&&checkboxDownload.isEnabled()) {
			System.out.println("All Checkbox of Desktop are checked");
		}
		
		
	}

}
