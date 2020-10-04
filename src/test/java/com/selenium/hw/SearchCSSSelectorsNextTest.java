package com.selenium.hw;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchCSSSelectorsNextTest {
    WebDriver wd;

    @BeforeMethod
    public void SetUp(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wd.navigate().to("https://www.next.co.uk/");
    }
    @Test
    public void TestMenuNext(){

        wd.findElement(By.cssSelector("[class=\"HeaderFlag flagBackground flag-UnitedKingdom \"]")).click();
        wd.findElement(By.cssSelector("[class=\"dk_toggle dk_label\"]")).click();
        wd.findElement(By.cssSelector("[class=\"HeaderFlag_small flagBackground flag-Israel\"]")).click();
        wd.findElement(By.cssSelector("[value=\"English\"]")).click();
        wd.findElement(By.cssSelector("#btnFlagSelectorShopNow")).click();
        wd.findElement(By.cssSelector("#sli_search_1")).sendKeys("dress baby" + Keys.ENTER);
        wd.findElement(By.cssSelector("[class=\"Desc\"]")).click();
        //String Text = wd.findElement(By.cssSelector("[css=\"1\"]")).getText();
        //System.out.println(Text);








    }

    @AfterMethod(enabled = false)
        public void TearDown(){
        wd.quit();
    }

}
