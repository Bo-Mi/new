import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.Login;

public class Second {

    @Test
    public void wrongFormatValues() {

        Selenide.open("https://gorzdrav.spb.ru/");
        Selenide.$(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();

        Login page = new Login();

        page.sendLogin("111");
        page.sendPass("111");
        page.clickOk();
        page.getLoginText("Введите мобильный телефон или почту");

    }

    @Test
    public void noValues() {

        Selenide.open("https://gorzdrav.spb.ru/");
        Selenide.$(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();

        Login page = new Login();

        page.sendLogin();
        page.sendPass();
        page.clickOk();
        page.getLoginText("Введите мобильный телефон или почту");
        page.getPassText("Введите пароль");
    }

    @Test
    public void noPass() {

        Selenide.open("https://gorzdrav.spb.ru/");
        Selenide.$(By.xpath("//*[@id=\"header\"]/ul/li[2]/a")).click();

        Login page = new Login();

        page.sendLogin("8091234567");
        page.sendPass();
        page.clickOk();
        page.getLoginText("");
        page.getPassText("Введите пароль");
    }

}