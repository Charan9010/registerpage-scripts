package pro1;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;
public class registerpage {
public static void main(String[] args) {
String path="D:\\chromedriver.exe";
  System.setProperty("webdriver.chrome.driver",path);
  WebDriver driv=new ChromeDriver();
 
  driv.get("file:///D:/Orphanage%20Project/registration.html");
  //first name
  driv.findElement(By.id("firstname")).sendKeys("charan");
  //last name
  driv.findElement(By.id("lastname")).sendKeys("jadapalli");
  //email
  driv.findElement(By.id("email")).sendKeys("charantej123@gmail.com");
  //age
  driv.findElement(By.id("age")).sendKeys("22");
  //phone number
  driv.findElement(By.id("phonenumber")).sendKeys("6301904344");
  ////password
  driv.findElement(By.id("password")).sendKeys("Charan@123");
  //confirm password
  driv.findElement(By.id("confirm-password")).sendKeys("Charan@123");
  //address
  driv.findElement(By.id("address")).sendKeys("gudur,Andhra Pradesh");
  //gender
  driv.findElement(By.id("male")).click();
  //register
  //driv.findElement(By.xpath("//*[@id=\"register\"]")).click();
}

}
