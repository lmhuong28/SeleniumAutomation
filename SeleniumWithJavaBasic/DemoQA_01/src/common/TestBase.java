package common;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class TestBase {
	public ChromeDriver dr;
	public void openWebBroswser(){
        dr = new ChromeDriver();
		dr.get("https://demoqa.com/");
		
	}
	public void inputYear(String year) 
	{
		//tìm phần tử chứa dropdownbox
		WebElement dropBoxElement = dr.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select years = new Select(dropBoxElement);
		years.selectByValue(year);
		
	}
	public void inputMonth(String month) 
	{
		//tìm phần tử chứa dropdownbox
		WebElement dropBoxElement = dr.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select months = new Select(dropBoxElement);
		months.selectByValue(month);
		
	}
	public void inputMonthDay(String monthday) 
	{
		//tìm danh sác các ngày đang hiển thị
		List<WebElement> visibleDays = dr.findElements(By.xpath("//div[contain(@class,'react-datepicker__day'and @role='option"));
		for (WebElement e:visibleDays) {
			//lấy đầy đủ thuộc tính class của phần tử
			String valueOfClass = e.getAttribute("class");
			if ((valueOfClass.contains((monthday)) && (!valueOfClass.contains(("outside-month"))))){
					
		}
	}
	}
}
