import java.util.stream.IntStream;
import java.util.*;

public class bai9 {
    public static int[] makeListCitizen(int n) {
        int[] idList = IntStream.rangeClosed(0, n-1).toArray();
        return idList;
    }

    public static int[] shuffleListCitizen(int[] citizen){
        Random r = new Random();
        int[] tempArr = citizen.clone();
        for (int i = citizen.length-1; i > 0; i--) {
            int j = r.nextInt(i+1);
            int temp = tempArr[i];
            tempArr[i] = tempArr[j];
            tempArr[j] = temp;
        }
        return tempArr;
    }
    public static boolean checkValue(int[] arr, int value){
        int[] tempArr = arr.clone();
        Arrays.sort(tempArr);
        int res = Arrays.binarySearch(arr, value);
        boolean check = res >= 0 ? true : false;
        return check;
    }
    public static int[] deleteDup(int[] arr){
        return arr;
    }
    public static void getSelfIsolated(int[] citizen){
        Arrays.sort(citizen);
        int[] shuffledCitizen = shuffleListCitizen(citizen);
        System.out.println(Arrays.toString(shuffledCitizen).replace(",","").replace("[", "Contactee | ").replace("]", ""));
        int[] selfIsolatedCitizen = new int[citizen.length];
        int idx=0;
        int value=shuffledCitizen[idx];
        selfIsolatedCitizen[idx] = idx;
        while (checkValue(selfIsolatedCitizen, value) == false){
            selfIsolatedCitizen[idx+1]=value;
            value=shuffledCitizen[value];
            idx+=1;
        }
        int[] result = new int[idx+1];
        System.arraycopy(selfIsolatedCitizen, 0, result, 0, idx+1);
        System.out.println(Arrays.toString(result).replace(",","").replace("[", "The following citizens are to be self-isolated: ").replace("]", ""));
    }
    public static void main(String[] args) {
        int[] citizen = makeListCitizen(16);
        System.out.println(Arrays.toString(citizen).replace(",","").replace("[", "ID | ").replace("]", ""));
        getSelfIsolated(citizen);
    }
}
