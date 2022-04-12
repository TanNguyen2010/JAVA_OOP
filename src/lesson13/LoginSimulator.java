package lesson13;

import java.util.Arrays;
import java.util.List;

public class LoginSimulator {
    public void performLogin(List<LoginPage> loginPageList){
        for (LoginPage loginPage : loginPageList) {
            loginPage.login();
        }
    }

    public static void main(String[] args) {
        new LoginSimulator().performLogin(Arrays.asList(new InternalLoginPage(),new ExternalLoginPage()));
    }
}
