package lesson07;

import java.util.*;

public class SimpleBookMenu {

    public static void main(String[] args) {
        boolean isContinue = true;
        Map<String, List<BookInfo>> bookInfo = new HashMap<>();
        List<BookInfo> bookInfoList = new ArrayList<>();

        while(isContinue){
            System.out.println("\n---------MENU---------");
            System.out.println("1. Input book info");
            System.out.println("2. Find book by ISBN");
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
                    System.out.println("Input book info");

                    Scanner scanner1 = new Scanner(System.in);
                    System.out.print("Input ISBN:");
                    String bookISBN = scanner1.nextLine();


                    Scanner scanner2 = new Scanner(System.in);
                    System.out.print("Input Title:");
                    String bookTitle = scanner2.nextLine();

                    Scanner scanner3 = new Scanner(System.in);
                    System.out.print("Input Author Name:");
                    String bookAuthorName = scanner3.nextLine();

                    Scanner scanner4 = new Scanner(System.in);
                    System.out.print("Year:");
                    String bookYear = scanner4.nextLine();

                    BookInfo bookInfo1 = new BookInfo(bookTitle,bookAuthorName,bookYear);
                    bookInfoList.add(bookInfo1);
                    bookInfo.put(bookISBN,Arrays.asList(bookInfo1));

                    break;

                case 2:
                    System.out.println("Find book by ISBN");
                    Scanner scanner5 = new Scanner(System.in);
                    System.out.print("Input book ISBN:");
                    String findBookISBN = scanner5.nextLine();

                    if (bookInfo.containsKey(findBookISBN)){

                        System.out.println(bookInfo.get(findBookISBN));
                    }else {
                        System.out.println("Book not found!");
                    }

                    break;

                default:
                    System.out.println("Wrong option number");
            }

        }
    }
}
