package feeModule;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fee {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://stg-lms.mpokket.org/dashboard");
		driver.findElement(By.className("mat-button-wrapper")).click();
		driver.findElement(By.xpath("//a[.='Fees Module']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Create New Attribute']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-4']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.='Disbursement Fee']")).click();
		//driver.findElement(By.xpath("//span[.='Convienience Fee']")).click();
		//driver.findElement(By.xpath("//span[.='Repayment Fee']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c68-7']")).click();
		//driver.findElement(By.xpath("//span[.='Bullet']")).click();
		driver.findElement(By.xpath("//span[.='Installment']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-9']")).click();
		driver.findElement(By.xpath("//span[.='Disbursement']")).click();
		//driver.findElement(By.xpath("//span[.='Payment']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c68-18']")).click();
		driver.findElement(By.xpath("//span[.='Disbursement Mode']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c68-11']")).click();
		driver.findElement(By.xpath("//span[.='mPokket']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow ng-tns-c68-13']")).click();
		driver.findElement(By.xpath("//span[.='022111']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-16']")).click();
		driver.findElement(By.xpath("//span[.='No End']")).click();
		Thread.sleep(4000);
		/*WebElement rem = driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c46-5']"));
		WebDriverWait wait=new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.visibilityOf(rem)).click();
		wait.until(ExpectedConditions.visibilityOf(rem)).sendKeys("test");*/
		
		//driver.findElement(By.xpath("//span[@class='mat-form-field-label-wrapper ng-tns-c46-5']")).sendKeys(Keys.CONTROL+"t");
		//JavascriptExecutor js= (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].value='test'",rem );
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[.='Add More']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-21']")).click();
		driver.findElement(By.xpath("//span[.='Segment']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-25']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//span[.='Principal']")).click();
		//driver.findElement(By.xpath("//span[.='Interest']")).click();
		//driver.findElement(By.xpath("//span[.='Principal+Interest']")).click();
		
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-27']")).click();
		driver.findElement(By.xpath("//span[.='is Equal to']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-31']")).click();
		driver.findElement(By.xpath("//span[.='1000']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-23']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[.='Disbursement Mode'])[3]")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-37']")).click();
		driver.findElement(By.xpath("//span[.='Bank']")).click();
		driver.findElement(By.xpath("//div[@class='mat-select-arrow-wrapper ng-tns-c68-33']")).click();
		driver.findElement(By.xpath("//span[.='HDFC Bank - NEFT']")).click();
		
		//driver.findElement(By.xpath("//span[.='Submit']")).click();
		}

}
