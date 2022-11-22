package com.obsqura.TestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBox extends BaseCheckBox{
	@Test(description="Check Box of tutorialspoint page")
	public void checkBox() {
		WebElement manualCheckBox = driver.findElement(By.xpath("//input[@value='Manual Tester']"));
		WebElement automationCheckBox = driver.findElement(By.xpath("//input[@value='Automation Tester']"));
		WebElement rcRadioCheckBox = driver.findElement(By.xpath("//input[@value='RC']"));
		WebElement seleniumIDECheckBox = driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
		WebElement seleniumCheckBox = driver.findElement(By.xpath("//input[@value='Selenium Webdriver']"));
		boolean checkBox=manualCheckBox.isSelected()&&automationCheckBox.isSelected()&&rcRadioCheckBox.isSelected()&&seleniumIDECheckBox.isSelected()&&seleniumCheckBox.isSelected();
		if(checkBox==false) {
			seleniumCheckBox.click();
			Assert.assertTrue(seleniumCheckBox.isSelected(), "Selenium WebDriver CheckBox Is Selected");;
		}
		Assert.assertTrue(checkBox==false, "CheckBox Are Already Selected");
	}

}
