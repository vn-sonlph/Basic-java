import java.util.Scanner;

public class bai5 {
    public static void checkSubstring(String s1, String s2){
        if (s1.contains(s2)){
            int idx=s1.indexOf(s2);
            System.out.println("True, index of string 2 in string 1: "+idx);
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] ars){
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        System.out.print("Input string 1: ");
        s1 = sc.nextLine();
        System.out.print("Input string 2: ");
        s2 = sc.nextLine();
        System.out.println("Length of string 1: "+s1.length());
        System.out.println("Length of string 2: "+s2.length());
        System.out.println("3 first characters in string 1: "+s1.substring(0, 3));
        System.out.println("3 last characters in string 2: "+s2.substring(s2.length()-3, s2.length()));
        System.out.println("6th characters in string 1: "+s1.charAt(5));
        System.out.println("Is string 1 equal to string 2: "+(s1.equals(s2)));
        checkSubstring(s1, s2);
    }
}
