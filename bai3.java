import java.util.Scanner;

public class bai3 {
    public static float perimeter(float length, float width){
        float result;
        result = (length + width)/2;
        return result;
    }
    public static float acreage(float length, float width){
        float result;
        result = (length * width);
        return result;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float length;
        float width;
        System.out.println("Input length: ");
        length = sc.nextFloat();
        System.out.println("Input width: ");
        width = sc.nextFloat();
        float perimeter = perimeter(length, width);
        float acreage = acreage(length, width);
        System.out.println("Perimeter: "+perimeter);
        System.out.println("Acreage: "+acreage);
    }
}
