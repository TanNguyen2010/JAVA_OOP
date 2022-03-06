package lesson03;

public class CountOddEvenInArray {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < intArr.length; i++) {
            int du = intArr[i]%2;
            if (du==0){
                countEven = countEven +1;
            }else {
                countOdd = countOdd + 1;
            }
        }
        System.out.println("Even numbers : " +countEven);
        System.out.println("Odd numbers  : " +countOdd);
    }
}
