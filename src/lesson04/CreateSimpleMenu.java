package lesson04;

import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class CreateSimpleMenu {
    public static void main(String[] args) {
        List<Integer> myArrayList = new ArrayList<>();
        boolean isContinue = true;
        while (isContinue) {

            System.out.println("\n--------------MENU--------------");
            System.out.println("1. Add number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");
            System.out.println("5. Find number and index");
            System.out.println("0. Stop");

            Scanner scanner = new Scanner(System.in);
            System.out.print("\nPlease input option number: ");
            int optionNumber = scanner.nextInt();

            switch (optionNumber) {
                case 0:
                    System.out.println("Stop");
                    break;
                case 1:
                    //System.out.println("Add operation");
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Please input number: ");
                    int addNumber = scanner1.nextInt();
                    myArrayList.add(addNumber);
                    //System.out.println(myArrayList.size());
                    break;
                case 2:
                    //System.out.println("Print");
                    if (myArrayList.size()>0) {
                        //for (Integer integer : myArrayList) {
                        //    System.out.println(integer);
                        //}
                        System.out.println(myArrayList);
                    }else  {
                        System.out.println("Array list is empty");
                    }
                    break;
                case 3:
                    //System.out.println("Get max");
                    if (myArrayList.size()>0){
                        int maxMyArrayList = myArrayList.get(0);
                        for (int index = 1; index < myArrayList.size(); index++) {
                            if (maxMyArrayList < myArrayList.get(index)){
                                maxMyArrayList  = myArrayList.get(index);
                            }
                        }
                        System.out.println(maxMyArrayList);
                    } else {
                        System.out.println("Array list is empty");
                    }
                    break;
                case 4:
                    //System.out.println("Get min");
                    if (myArrayList.size()>0){
                        int minMyArrayList = myArrayList.get(0);
                        for (int index = 1; index < myArrayList.size(); index++) {
                            if (minMyArrayList > myArrayList.get(index)){
                                minMyArrayList  = myArrayList.get(index);
                            }
                        }
                        System.out.println(minMyArrayList);
                    } else {
                        System.out.println("Array list is empty");
                    }
                    break;
                case 5:
                    //System.out.println("Fine number");
                    if (myArrayList.size()>0) {
                        Scanner scanner2 = new Scanner(System.in);
                        System.out.print("Please input number to find index: ");
                        int findNumber = scanner2.nextInt();
                        int index = 0 ;
                        for (index = 0; index < myArrayList.size(); index++) {
                            if (myArrayList.get(index) == findNumber) {
                                System.out.printf("index of %d in myArray is %d", findNumber, index);
                                break;
                            }
                        }
                        if (index == myArrayList.size()){
                            System.out.println("Number input have not in myArrayList");
                        }

                    }  else {
                        System.out.println("Array list is empty");
                    }
                    break;
                default:
                    System.out.println("Wrong option");
            }
            if (optionNumber ==0 ){
                isContinue = false;
            }
        }



    }
}
