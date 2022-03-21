import java.lang.reflect.Array;
import java.util.Arrays;

public class bai7 {
    //1
    public static int[] createArray(int m){
        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*m); 
        }
        return arr;
    }
    //2
    public static void printElementArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    //3
    public static int[] copyArray(int[] arrA){
        int[] arrC = Arrays.copyOf(arrA, arrA.length);
        return arrC;
    }
    //4
    public static int[] alternateElement(int[] arrC, int[] arrB){
        System.arraycopy(arrB, arrB.length-3, arrC, 0, 3);
        return arrC;
    }
    //5
    public static void sortArray(int[] arrC){
        Arrays.sort(arrC);
        printElementArray(arrC);
    }
    public static void main(String[] args){ 
        int[] arrA = new int[] {1, 2, 3, 4};
        int[] arrB = createArray(10);
        printElementArray(arrB);
        int[] arrC = copyArray(arrA);
        printElementArray(arrC);
        arrC = alternateElement(arrC, arrB);
        printElementArray(arrC);
        sortArray(arrC);
    }
}
