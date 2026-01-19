package Selleniun_start_projects.Selleniun_start_projects;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.System;

public class Check_password_Test {

    static WebDriver browser;
    @Before
    public void setup() {
        // ================================
        // ÖîÜãÖ âàáëÕ ïÚåîá Ùã:
        // 1.geckodriver.exe ¿á ÕáãÙ ÖÞïåÙ ïÕ äÕà âÞîá
        // âàáî ÖîÜãÖ ÞïÞãÕ êÖÚì ïÚÞÙá ÖÞÞÜ ÖÞïåÙ
        // Ùã×ÚØ:
        // "C:\\drivers\\geckodriver.exe"
        // ================================
        System.setProperty(
                "webdriver.gecko.driver",
                "C:\\Users\\bohana\\OneDrive - NVIDIA Corporation\\Desktop\\QA\\Driver\\geckodriver.exe"
        );
        browser = new FirefoxDriver();

        browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String url =
                "https://testpages.eviltester.com/apps/7-char-val/";
        browser.get(url);
    }
    @Test
    public void ValidPassword_Exactly7Chars() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("Aba2716");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Valid Value";
        assertEquals(expected, result);
    }

    @Test
    public void ValidPassword_Exactly6Chars() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("Aba271");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Invalid Value";
        assertEquals(expected, result);
    }

    @Test
    public void ValidPassword_Exactly7Chars_with_unique_char() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("Aba271#");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Invalid Value";
        assertEquals(expected, result);
    }

    @Test
    public void ValidPassword_Exactly8Chars() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("aaaaaaaa");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Invalid Value";
        assertEquals(expected, result);
    }

    @Test
    public void ValidPassword_Exactly8Digits() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("12345678");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Invalid Value";
        assertEquals(expected, result);
    }

    @Test
    public void ValidPassword_Exactly8Chars_AtoI() {

        browser.findElement(By.name("characters")).clear();

        browser.findElement(By.name("characters")).sendKeys("ABCDEFGH");
        browser.findElement(By.name("validate")).click();

        String result =
                browser.findElement(By.name("validation_message"))
                        .getAttribute("value");

        String expected = "Invalid Value";
        assertEquals(expected, result);
    }

}
