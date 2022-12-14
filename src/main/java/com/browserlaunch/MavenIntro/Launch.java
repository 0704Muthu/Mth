package com.browserlaunch.MavenIntro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "E:\\Project\\MavenIntro\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
}
}
