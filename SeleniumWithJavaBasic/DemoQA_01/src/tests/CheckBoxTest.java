package tests;

import org.openqa.selenium.By;

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
		//get text in screen
		String textResult = testBase.dr.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		//compare results
		if(textResult.equals(text)) {
			System.out.println("testcase passed");
		}
		else {
			System.out.println("testcase failed");
		}
	}

}
