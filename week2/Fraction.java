import java.util.Scanner;

public class Fraction {
    float tu;
    float mau;
    public void createFraction(){
        Scanner sc = new Scanner(System.in);
        this.tu = sc.nextFloat();
        this.mau = sc.nextFloat();
    }
    public void printFraction(){
        System.out.println("Phan so: " + this.tu +"/" + this.mau);
    }
    public Fraction addFraction(Fraction B){
        Fraction C = new Fraction();
        C.tu = this.tu * B.mau + this.mau * B.tu;
        C.mau = this.mau * B.mau;
        return C;
    }
    public Fraction subFraction(Fraction B){
        Fraction C = new Fraction();
        C.tu = this.tu * B.mau - this.mau * B.tu;
        C.mau = this.mau * B.mau;
        return C;
    }
    public Fraction mulFraction(Fraction B){
        Fraction C = new Fraction();
        C.tu = this.tu * B.tu;
        C.mau = this.mau * B.mau;
        return C;
    }
    public Fraction divFraction(Fraction B){
        Fraction C = new Fraction();
        C.tu = this.tu * B.mau;
        C.mau = this.mau * B.tu;
        return C;
    }
}
