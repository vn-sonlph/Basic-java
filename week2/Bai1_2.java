public class Bai1_2 {
    public static void main(String[] args) {
        Fraction a = new Fraction();
        System.out.println("Nhap phan so a");
        a.createFraction();
        a.printFraction();
        Fraction b = new Fraction();
        System.out.println("Nhap phan so b");
        b.createFraction();
        b.printFraction();
        Fraction add = a.addFraction(b);
        Fraction sub = b.subFraction(b);
        Fraction mul = a.mulFraction(b);
        Fraction div = b.divFraction(b);
        System.out.println("A + B: " + add);
        System.out.println("A - B: " + sub);
        System.out.println("A * B: " + mul);
        System.out.println("A / B: " + div);
    }
}
