package github;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.text;
import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class comparePlans {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
    }


    @Test
    void pageShouldLoads (){
        //open github.com
        open("https://github.com");
        //bring mouse over "pricing"
        $(byText("Pricing")).hover();
        //click on "Compare plans"
        $(byText("Compare plans")).click();
        //check if opened page is right
        $("h1.h1").shouldHave(text("Compare features"));
   }















}
