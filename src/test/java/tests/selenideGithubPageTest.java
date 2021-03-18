package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class selenideGithubPageTest {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void softAssertions() {
        open("https://github.com/selenide/selenide");
        actions().sendKeys("g", "w").perform();
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class:"));
    }
}

