package lesson13;

public class ExternalLoginPage extends LoginPage{
    public ExternalLoginPage(){
        loginPage = new SSOLogin();
    }
}
