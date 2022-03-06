package lesson03;

public class FindingMaxMinValue {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};
        //Find min value
        int minValue = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (minValue > intArr[i]){
                minValue = intArr[i];
            }else {
                break;
            }
        }
        //Find max value
        int maxValue = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            if (maxValue < intArr[i]){
                maxValue = intArr[i];
            }else {
                break;
            }
        }
        //Print
        System.out.println("Min Value: "+minValue);
        System.out.println("Max value: "+maxValue);
    }
}
