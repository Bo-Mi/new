package page;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

public class Login {

    private By login = By.xpath("//*[@id=\"mobileOrEmail\"]");
    private By pass = By.xpath("//*[@id=\"password\"]");
    private By ok = By.xpath("//*[@id=\"loginByPwdButton\"]/span");
    private By loginText = By.xpath("//*[@id=\"authnFrm\"]/div[1]/div[3]/dl[1]/dd/div/div/span");
    private By passText = By.xpath("//*[@id=\"authnFrm\"]/div[1]/div[3]/dl[3]/dd/div[2]/div/span");

    public void sendLogin(){
        Selenide.$(login).setValue("");
    }

    public void sendLogin(String x){
        Selenide.$(login).setValue(x);
    }

    public void sendPass(
    ){
        Selenide.$(pass).setValue("");
    }

    public void sendPass(String x){
        Selenide.$(pass).setValue(x);
    }

    public void clickOk(){
        Selenide.$(ok).click();
    }

    public void getLoginText(String x){
        Selenide.$(loginText).should(Condition.text(x));
    }
    public void getPassText(String x){
        Selenide.$(passText).should(Condition.text(x));
    }

}
