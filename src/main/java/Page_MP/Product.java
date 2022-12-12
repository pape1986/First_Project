package Page_MP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Product {
    WebDriver driver;

    public Product(WebDriver driver) {
        this.driver = driver;
    }

    public void verifProduct() {
        WebElement Verifier = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String Z = Verifier.getText();
        String P = "PRODUCTS";
        Assert.assertEquals(P,Z,"NOK");

       /* if (Z.equals(P)) {
            System.out.println("Ok Products");
        } else {
            System.out.println("NOK Products");
        }*/
    }

    public void ajoutBackpack() {
        WebElement Backpack = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        Backpack.click();
    }

    public void ajoutBikeLight() {
        WebElement Backpack1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        Backpack1.click();
    }

    public void panier() {
        WebElement clicPanier = driver.findElement(By.id("shopping_cart_container"));
        clicPanier.click();


    }
}

