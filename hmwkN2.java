package Homework2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hmwkN2 {
    /*HW  (only use XPATH)
navigate to fb.com
click on create new account
fill up all the textboxes
close the popup
close the browser
[9:19 PM]
Note : in order for ur code to work
u have to put Thread.sleep(2000) after clicking on Create new account*/

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
       WebElement element=driver.findElement(By.xpath("//a[text()='Create new account']"));
Thread.sleep(2000);
        element.click();
Thread.sleep(2000);
        WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstname.sendKeys("Veronica");
        WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
lastname.sendKeys("madam");
WebElement mobile=driver.findElement(By.xpath("//input[@name='reg_email__']"));
mobile.sendKeys("veronica_16@yahoo.com");
        WebElement reEnter=driver.findElement(By.xpath("//input[contains(@name, 'confirmation__')]"));
        reEnter.sendKeys("veronica_16@yahoo.com");
WebElement newPassword=driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
newPassword.sendKeys("abcdefg");
WebElement birthday=driver.findElement(By.xpath("//option[text()='Mar']"));
birthday.click();
WebElement day=driver.findElement(By.xpath("//option[text()='25']"));
day.click();
WebElement year=driver.findElement(By.xpath("//option[text()='1990']"));
year.click();
WebElement gender=driver.findElement(By.xpath("//label[text()='Female']"));
gender.click();
Thread.sleep(3000);
driver.close();
driver.quit();


    }



}
