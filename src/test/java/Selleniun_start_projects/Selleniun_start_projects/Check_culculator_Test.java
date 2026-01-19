package Selleniun_start_projects.Selleniun_start_projects;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.lang.System;

public class Check_culculator_Test {

    static WebDriver  browser;

    @Before
    public void setup() {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\bohana\\OneDrive - NVIDIA Corporation\\Desktop\\QA\\Driver\\geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        String url="https://testpages.eviltester.com/styled/apps/calculator.html";
        browser.get(url);

    }

    @Test
    public void Tests1() {


        browser.findElement(By.id("button05")).click();
        browser.findElement(By.id("buttonmultiply")).click();
        browser.findElement(By.id("button05")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "25";
        assertEquals(Expected,result);


    }

    @Test
    public void Tests2() {


        browser.findElement(By.id("button04")).click();
        browser.findElement(By.id("buttonmultiply")).click();
        browser.findElement(By.id("button05")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "20";
        assertEquals(Expected,result);


    }

    @Test
    public void Tests3() {


        browser.findElement(By.id("button03")).click();
        browser.findElement(By.id("buttonplus")).click();
        browser.findElement(By.id("button03")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "6";
        assertEquals(Expected,result);


    }

    @Test
    public void Tests4() {


        browser.findElement(By.id("button03")).click();
        browser.findElement(By.id("buttonplus")).click();
        browser.findElement(By.id("button07")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "10";
        assertEquals(Expected,result);


    }

    @Test
    public void Tests5() {


        browser.findElement(By.id("button08")).click();
        browser.findElement(By.id("buttonminus")).click();
        browser.findElement(By.id("button04")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "4";
        assertEquals(Expected,result);

    }

    @Test
    public void Tests6() {


        browser.findElement(By.id("button05")).click();
        browser.findElement(By.id("buttonminus")).click();
        browser.findElement(By.id("button03")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        browser.findElement(By.id("buttonequals")).click();
        System.out.println("hello");

        String result= browser.findElement(By.id("calculated-display")).getAttribute("value").toString();
        System.out.println(result);
        String Expected= "2";
        assertEquals(Expected,result);

    }

}
