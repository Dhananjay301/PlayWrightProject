package actors;

import POM.LoginPage;

public class loginActor {

    LoginPage loginPage=new LoginPage();

    public void navigateToLogin(){
        loginPage.navigateToUrl();
    }
    public void enterUserName(String username){
        loginPage.enterUserName(username);
    }
}
