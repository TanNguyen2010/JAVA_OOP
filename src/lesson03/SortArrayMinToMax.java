package lesson03;

public class SortArrayMinToMax {
    public static void main(String[] args) {
        int[] intArray={12,34,1,16,28};
        int tmp;
        int ups = intArray.length -1;
        while (ups>0){
            for (int index = 0; index < ups; index++) {
                if (intArray[index]>intArray[index+1]){
                    tmp = intArray[index];
                    intArray[index] = intArray[index+1];
                    intArray[index+1] = tmp;
                }

            }
            ups--;

        }
        for (int value :intArray){
            System.out.println(value);
        }

    }
}
