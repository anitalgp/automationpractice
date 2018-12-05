package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriverWait customWait;

	protected WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"small-searchterms\"]")
	private WebElement searchStore;
	
	
	
//	public void productSearch(String product) {
//		customWait.until(ExpectedConditions.elementToBeClickable(searchStore));
//		searchStore.click();
//		searchStore.clear();
//		searchStore.sendKeys(product);
//	}
//
//	public boolean getLogo() {
//		customWait.until(ExpectedConditions.visibilityOf(logoImagen));
//		return logoImagen.isDisplayed();
//	}
//		
//		JavascriptExecutor ex = (JavascriptExecutor) driver;
//		ex.executeScript("arguments[0].click();", notificationMessage);
//		customWait.until(ExpectedConditions.elementToBeClickable(notificationMessage));
//		notificationMessage.click();
//	}

	public BasePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.customWait = new WebDriverWait(driver, 15);
	}

}
