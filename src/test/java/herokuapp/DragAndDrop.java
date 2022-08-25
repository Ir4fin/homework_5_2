package herokuapp;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;


import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DragAndDrop {

    @BeforeAll
    static void configure() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://the-internet.herokuapp.com/";
    }

    @Test
    void dragRectangleAToRectangleB() {
        //open page drag and drop
        open("/drag_and_drop");
        //drag rectangle A to rectangle B and vice versa
        $("#column-a").dragAndDropTo("#column-b");
        //check for correct changes
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }


}
