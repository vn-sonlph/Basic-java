public class Bai1_1 {
    
    public static void main(String[] args) {
        Point a = new Point();
        System.out.println("Nhap toa do diem A");
        a.createPoint();
        a.printPoint();
        Point b = new Point();
        System.out.println("Nhap toa do diem B");
        b.createPoint();
        b.printPoint();
        float dis = a.getDistance(b);
        System.out.println("Khoang cach: " + dis);
    }
    
}
