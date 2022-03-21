import java.util.Scanner;

public class bai4 {
    public static String divisor(int number){
        String str ="";
        for(int i=1; i<number; i++){
            if(number%i == 0){
                str+=i+",";
            } 
        }
        str+=number;
        return str;
    }
    public static int count(int number){
        String strNumber = Integer.toString(number);
        return strNumber.length();
    }
    public static boolean symmetricalNumber(int number){
        String strNumber = Integer.toString(number);
        String symNumber = "";
        for (int i = strNumber.length()-1 ; i>=0; i--){
            symNumber+=strNumber.charAt(i);
        }
        if (Integer.parseInt(strNumber)==Integer.parseInt(symNumber)){
            return true;
        }
        else {
            return false;
        }
    }
    public static boolean perfectSquare(int number){
        double sq = Math.sqrt(number);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Input n: ");
        n = sc.nextInt();
        String divisor = divisor(n);
        System.out.println("Divisor of n: "+divisor);
        int number = count(n);
        System.out.println("Count: "+number);
        Boolean symNumber = symmetricalNumber(n);
        System.out.println("Is Symmetrical Number: "+symNumber);
        Boolean perfectSquare = perfectSquare(n);
        System.out.println("Is Perfect Square Number: "+perfectSquare);
    }
}
