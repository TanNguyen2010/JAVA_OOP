package lesson03;

public class MerTwoArrayMinToMax {
    public static void main(String[] args) {
        int[] array1 = {1,12,16,28,34,100,120,160,190};
        int[] array2 = {1,3,13,16,20,27,99};
        int merArrayLen = array1.length + array2.length;
        int[] merArray = new int[merArrayLen];
        int i = 0;
        int j = 0;
        int mi = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                merArray[mi++] = array2[j++];
            }
            if (j == array2.length){
                break;
            }
            if (array1[i] <= array2[j]) {
                merArray[mi++] = array1[i++];
            }
            if (i == array1.length){
                break;
            }
        }
        if(i == array1.length){
            for (; j < array2.length; j++) {
                merArray[mi++] = array2[j];
            }
        }
        if(j == array2.length){
            for (; i < array1.length; i++) {
                merArray[mi++] = array1[i];
            }
        }
        for (int value : merArray){
            System.out.println(value);
        }
    }

}
