package lesson13;

public abstract class LoginPage {
    ILogin loginPage;

    public void login(){
        loginPage.loginType();
    }
}
