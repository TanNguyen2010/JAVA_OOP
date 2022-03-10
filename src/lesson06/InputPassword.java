package lesson06;

import java.util.Scanner;

public class InputPassword {
    public static void main(String[] args) {
        String password = "password123";
        int inputTimes = 0;
        while (inputTimes<3){

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input Password: ");
            String inputPassword = scanner.nextLine();

            if (inputPassword == null || inputPassword.length()<1){
                throw new IllegalArgumentException("Password can't be null or empty!");
            }
            if (inputPassword.equals(password)){
                System.out.println("Password is correct");
                break;
            } else {
                System.out.println("Password is not correct");
            }

            inputTimes++;
        }
        if (inputTimes==3){
            System.out.println("Try again after 3 minutes!");
        }
    }
}
