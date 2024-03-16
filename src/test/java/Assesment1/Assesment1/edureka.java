package Assesment1.Assesment1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class edureka {
	@Test
	public void Test() throws InterruptedException {
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","C:\\Driverstest\\chromedriver-win64\\chromedriver.exe");
	driver = new ChromeDriver();
    driver.get("https://www.edureka.co/");
    driver.manage().window().maximize();
    WebElement button = driver.findElement(By.xpath("/html/body/header/nav/ul/li[4]/span"));
    button.click();
    driver.findElement(By.id("si_popup_email")).sendKeys("monishasekar438@gmail.com");
    driver.findElement(By.id("si_popup_passwd")).sendKeys("Moni@2003");
    driver.findElement(By.xpath("/html/body/div[6]/div/div/div[2]/div[3]/form/button")).click();
    Thread.sleep(5000);
    driver.navigate().to("https://learning.edureka.co/my-profile");
    //Thread.sleep(7000);
    
    WebElement personalEdit = driver.findElement(By.id("personal_details"));
    personalEdit.click();
    Thread.sleep(7000);
    //driver.findElement(By.id("wzrk-cancel")).click();
    WebElement personalDetials = driver.findElement(By.id("fullName"));
    personalDetials.clear();
    personalDetials.sendKeys("Monisha");
    WebElement experience = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[2]/ngx-select-dropdown"));
	experience.click();
    WebElement experienceInner = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[2]/ngx-select-dropdown/div/div/ul[2]/li[2]"));
    experienceInner.click();
    WebElement industry = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[3]/ngx-select-dropdown"));
    industry.click();
    WebElement industryInner = driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/div[2]/div[1]/div[3]/ngx-select-dropdown/div/div/ul[2]/li[5]"));
    industryInner.click();
    WebElement designation = driver.findElement(By.id("designation"));
    designation.clear();
    designation.sendKeys("Software Testing");
    driver.findElement(By.xpath("/html/body/app-root/app-onboarding-user-details/section/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/button")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/button")).click();
    driver.findElement(By.xpath("/html/body/app-root/app-profile-main/app-header/header/nav/div/div[3]/ul/li[6]/div/ul/li[9]/a")).click();
    Thread.sleep(5000);
    driver.navigate().to("https://www.edureka.co/blog/");
    driver.quit();
	}

}
