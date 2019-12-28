package sample.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSample {

public void testSample() {
		
		System.setProperty(Constants.BROWSER_DRIVER_PROP_KEY, Constants.BROWSER_DRIVER_PROP_VALUE);
		WebDriver driver = new ChromeDriver();
	//	driver.get("https://maven.apache.org/plugins/maven-compiler-plugin"); //Always try to avoid double codes, u can make as many class as u want
		driver.get(Constants.URL);
		String paragraph = driver.findElement(By.xpath(Locators.paragraphXpath)).getText(); //to avoid double quote for xpath "//h2/../p"
		System.out.println(paragraph);
}
}
