import  Page_MP.hooks;
import Page_MP.Page_Accueil;
import Page_MP.hooks;
import org.testng.annotations.Test;

public class Test01 extends hooks {

    @Test

    public void essai1(){
        String log = "standard_user";
        String val = "abc123";
        Page_Accueil page_accueil = new Page_Accueil(driver);


        page_accueil.login(log);
        page_accueil.mdp(val);
        page_accueil.butlogin();
        page_accueil.verifmsg("Epic sadface: Username and password do not match any user in this service");

}
}
