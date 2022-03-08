package lesson05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentInfoSimpleMenu {
    public static void main(String[] args) {
        boolean isContinue = true;
        Map<Integer,String> studentList = new HashMap<>();

        while(isContinue){
            System.out.println("\n---------MENU---------");
            System.out.println("1. Input student info");
            System.out.println("2. Find student by ID");
            System.out.println("3. Print All info ");
            System.out.println("0. Exit!");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Please input number option: ");
            int numberOption = scanner.nextInt();

            switch (numberOption){

                case 0:
                    System.out.println("Exit!");
                    isContinue = false;
                    break;

                case 1:
                    //System.out.println("Input student info");
                    //----------Input student name
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Input Student Name: ");
                    String stuName = scanner1.nextLine();
                    //----------input ID student
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Input Student ID: ");
                    int stuID = scanner2.nextInt();

                    studentList.put(stuID,stuName);

                    break;
                case 2:
                    //System.out.println("Find student by ID");
                    //Input student ID to find
                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Please input student ID to find: ");
                    int stuIDFind = scanner3.nextInt();
                    if (studentList.containsKey(stuIDFind)){
                        System.out.println("["+ stuIDFind + "," + studentList.get(stuIDFind) + "]");
                    } else {
                        System.out.println("Student with ID " + stuIDFind + " not found" );
                    }
                    break;
                case 3:
                    //System.out.println("Print All");
                    if (!studentList.isEmpty()){
                        Set<Integer> allKeys = studentList.keySet();
                        for (Integer key : allKeys) {
                            System.out.println("["+ key + "," + studentList.get(key) + "]");
                            //System.out.println(studentList.get(key));
                        }
                    } else {
                        System.out.println("Not have any student info ");
                    }
                    break;
                default:
                    System.out.println("Wrong option number");
            }

        }


    }
}
