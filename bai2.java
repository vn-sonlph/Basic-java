import java.util.Scanner;

public class bai2 {
        public static float Sum (float x, int n){
            float numerator=1;
            float denominator=0;
            float S=0;
            for (int i=1; i<=n; i++){
                numerator=numerator*x;
                denominator=denominator+i;
                S = S + (float)numerator/denominator;
            }
        return S;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float x;
        System.out.println("Input x: ");
        x = sc.nextFloat();
        System.out.println("Input n: ");
        int n;
        n = sc.nextInt();
        float S;
        S = Sum(x, n);
        System.out.println("Sum: "+S);
    } 
}
