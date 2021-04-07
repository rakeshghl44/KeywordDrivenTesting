package com.paybright.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.paybright.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(name = "q")
	WebElement searchbar;

	@FindBy(name = "btnK")
	WebElement searchbtn;

	@FindBy(id = "mui-component-select-sort-by")
	WebElement dropdownClick;

	@FindBy(xpath = "//li[contains(text(),'Popular')]")
	WebElement popularValue;

	@FindBy(name = "search")
	WebElement searchValue;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void validateSearchValue() throws InterruptedException {

		searchbar.clear();
		searchbar.sendKeys("PayBright");
		Thread.sleep(5000);

	}

	public void validateSearchButton() throws InterruptedException {
		searchbtn.click();
		Thread.sleep(2000);

		String getTitle = driver.getTitle();

		System.out.println(getTitle);

		Assert.assertEquals("PayBright - Google Search", getTitle);
		Thread.sleep(3000);

		Assert.assertEquals(driver.getPageSource().contains("https://paybright.com"), true);

	}

	public void clickSortByDropDown() {

		dropdownClick.click();
	}

	public void selectValue() {

		popularValue.click();
	}

	public void searchText() {

		searchValue.sendKeys("samsung");
	}

	public void textValuePresentInSearch() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);

		if (driver.getPageSource().contains("samsung")) {
			System.out.println("samsung is present");
		} else {
			System.out.println("samsung is absent");
		}

	}
}
