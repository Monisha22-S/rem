package Assesment1.Assesment1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Coursera {
	@Test(priority=1)
	public void chromedriver() {
	System.out.println("Choose a browser for automation: ");
    System.out.println("1. Chrome");
    System.out.println("2. Firefox");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    WebDriver driver;

    // Launch the selected browser
    switch (choice) {
        case 1:
            System.setProperty("webdriver.chrome.driver", "C:\\Driverstest\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
            break;
        case 2:
            System.setProperty("webdriver.gecko.driver", "C:\\Driverstest\\geckodriver-v0.34.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            break;
        default:
            System.out.println("Invalid choice. Exiting...");
            return;
    }

    // Maximize the browser window
    driver.manage().window().maximize();

    // Navigate to Coursera website
    driver.get("https://www.coursera.org");

    // Inspect the search box with text “Search for a Course” for various attributes
    WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='What do you want to learn?']"));

    // Get attributes of the search box
    System.out.println("Search box attributes:");
    System.out.println("ID: " + searchBox.getAttribute("id"));
    System.out.println("Name: " + searchBox.getAttribute("name"));
    System.out.println("Xpath: " + searchBox.getAttribute("xpath"));
    System.out.println("Class Name: " + searchBox.getAttribute("class"));
    System.out.println("CSS Selector: " + searchBox.getAttribute("css"));

    // Inspect the “Log In” link to get the link text and partial link text
    WebElement loginLink = driver.findElement(By.linkText("Log In"));

    // Get attributes of the login link
    System.out.println("\nLogin link attributes:");
    System.out.println("Link Text: " + loginLink.getText());
    System.out.println("Partial Link Text: " + loginLink.getAttribute("href"));

    // Close the browser
    driver.quit();
}

}
