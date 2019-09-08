import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first {

    @BeforeMethod
    public void browser(){
        Configuration.browser = "chrome";
    }

    @Test
    public void test(){


        open("https://gorzdrav.spb.ru/");
        $(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();
        $(By.xpath("//*[@id=\"mobileOrEmail\"]")).setValue("111");
        $(By.xpath("//*[@id=\"password\"]")).setValue("111");
        $(By.xpath("//*[@id=\"loginByPwdButton\"]/span")).click();
        $(By.xpath("//*[@id=\"authnFrm\"]/div[1]/div[3]/dl[1]/dd/div/div/span")).should(Condition.text("Введите мобильный телефон или почту"));
    }

}
