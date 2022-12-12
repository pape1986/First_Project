package Page_MP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Cart {
    WebDriver driver;
    public Cart (WebDriver driver){
        this.driver=driver;
    }
    public void verifcart(){
        WebElement Checkcart = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String Q = Checkcart.getText();
        String Z = "YOUR CART";
        Assert.assertEquals(Z,Q,"NOK CART");

       /* if (Z.equals(Z)) {
            System.out.println("OK YOUR CART");
        } else {
            System.out.println("NOK YOUR CART");
        }*/
    }
    public void VerBackPack(){
        WebElement BackPackPresent = driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"));
        String J = BackPackPresent.getText();
        String A = "Sauce Labs Backpack";
        Assert.assertEquals(A,J,"Non Conforme Backpack");
    }
    public void VerLabs(){
        WebElement LabsPresent = driver.findElement(By.xpath("//*[@id=\"item_0_title_link\"]/div"));
        String D = LabsPresent.getText();
        String M = "Sauce Labs Bike Light";
        Assert.assertEquals(M,D,"Non Conforme Labs Bike Light");
    }

}
