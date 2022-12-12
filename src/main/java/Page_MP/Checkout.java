package Page_MP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Checkout {
    WebDriver driver;

    public Checkout(WebDriver driver) {
        this.driver = driver;
    }

    public void Check_Out() {
        WebElement check = driver.findElement(By.id("checkout"));
        check.click();
    }

    public void nom() {
        WebElement LastName = driver.findElement(By.xpath("//*[@id=\"last-name\"]"));
        LastName.clear();
        LastName.sendKeys("SARR");
    }

    public void prenom() {
        WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"first-name\"]"));
        FirstName.clear();
        FirstName.sendKeys("Pape Samba");
    }

    public void codepostal() {
        WebElement BP = driver.findElement(By.xpath("//*[@id=\"postal-code\"]"));
        BP.clear();
        BP.sendKeys("92250");

    }

    public void Checkout_Info() {
        WebElement Info = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String H = Info.getText();
        String B = "CHECKOUT: YOUR INFORMATION";
        Assert.assertEquals(B, H, "Info Checkout not good");
    }

    public void Continue() {
        WebElement continuer = driver.findElement(By.id("continue"));
        continuer.click();
    }

    public void Overvieuw() {
        WebElement Checkoutoverview = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
        String A = Checkoutoverview.getText();
        String F = "CHECKOUT: OVERVIEW";
        Assert.assertEquals(F, A, "Info Overview not good");
    }

    public void Total() {
        WebElement totalcommande = driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]"));
        //String V = totalcommande.getText();
        //String T = "$43.18";
        //(T, V, "Erreur Total");

    }
}
