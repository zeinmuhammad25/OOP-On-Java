package com.rizqifauzan;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LinkedInTest {

    @Test
    public void verifyPage(){

        ChromeOptions chrome_options = new ChromeOptions();

        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        //chrome_options.addArguments("--incognito");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\Fauzan\\AppData\\Local\\Google\\Chrome\\User Data");
        //chrome_options.addArguments("--profile-directory=Profile 2");
        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(chrome_options);

        driver.get("https://www.linkedin.com/in/rifkiahmadsururi/");

        String fullname = driver.findElement(By.xpath("//h1")).getText();
        String headline = driver.findElement(By.xpath("//div[h1]/following-sibling::div")).getText();
        String currentCompany = driver.findElement(By.xpath("//div[@aria-label='Current company']")).getText();
        String education = driver.findElement(By.xpath("//div[@aria-label='Education']")).getText();
        String about = driver.findElement(By.xpath("//header[h2[text()='About']]/following-sibling::div")).getText();

        System.out.println(fullname);
        System.out.println(headline);
        System.out.println(currentCompany);
        System.out.println(education);
        System.out.println(about);
    }

}
