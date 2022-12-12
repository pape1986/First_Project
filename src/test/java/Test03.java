import Page_MP.*;
import org.testng.annotations.Test;

public class Test03 extends hooks {

    @Test
    public void essai3(){
        String log = "standard_user";
        String val = "secret_sauce";

        Page_Accueil page_accueil = new Page_Accueil(driver);
        Product product = new Product(driver);
        Cart cart = new Cart(driver);
        Checkout checkout =new Checkout(driver);


        page_accueil.login(log);
        page_accueil.mdp(val);
        page_accueil.butlogin();

        product.verifProduct();
        product.ajoutBackpack();
        product.ajoutBikeLight();
        product.panier();

        cart.verifcart();
        cart.VerBackPack();
        cart.VerLabs();

        checkout.Check_Out();
        checkout.prenom();
        checkout.nom();
        checkout.codepostal();
        checkout.Checkout_Info();
        checkout.Continue();
        checkout.Overvieuw();











    }
}
