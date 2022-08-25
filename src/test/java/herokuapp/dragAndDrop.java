package herokuapp;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class dragAndDrop {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/"
    }

    @Test
    void dragRectangleAToRectangleB(){


    }









}
