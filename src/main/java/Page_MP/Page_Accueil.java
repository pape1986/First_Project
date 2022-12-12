package Page_MP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Page_Accueil {

    WebDriver driver;
    public Page_Accueil(WebDriver driver){
        this.driver=driver;
    }

    public void login(String log) {


        WebElement champ = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
        champ.clear();
        champ.sendKeys(log);
    }

    public void mdp(String val){
        WebElement champ = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        champ.clear();
        champ.sendKeys(val);

    }
    public void butlogin(){
         WebElement login = driver.findElement(By.id("login-button"));
        login.click();
    }
    public void verifmsg(String text){
        WebElement Verifier = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3"));
        String Z = Verifier.getText();
        String P = text;
        Assert.assertEquals(P,Z,"NOK EPIC");

       /* if (Z.equals(text)) {
            System.out.println("OK epic");
        } else {
            System.out.println("NOK epic");

        }*/
    }


    }


