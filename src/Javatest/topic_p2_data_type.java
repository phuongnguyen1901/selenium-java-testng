package Javatest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class topic_p2_data_type {

	public static void main(String[] args) {
		// kiểu dữ liệu nguyên thuỷ 
		
		// số nguyên: byte, long, int, short (không có phần thập phân )
		
		
		// số thực: float, double( có phần thập phân)
		
		// logic: boolean
		
		// kí tự: char
		
		//Kiểu dữ diệu tham chiếu 
		//Class
		FirefoxDriver driver = new FirefoxDriver();
		
		//interface
		
		WebElement firtName;
		//string
		String a = "automation Test";
		//Object
		Object b;
		//Array
		String [] c = {"acb","abc"};
		//Collection: List, Set , Queue
		List<WebElement> checkboxs = driver.findElements(By.cssSelector(""));
		//Map
        Map<String, Integer> student = new HashMap<String, Integer>();
	

	}}
