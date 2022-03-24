import java.util.Scanner;

public class Point{
    float x;
    float y; 
    public void createPoint(){
        Scanner sc = new Scanner(System.in);
        this.x = sc.nextFloat();
        this.y = sc.nextFloat();
    }
    public float getX(float x){
        return this.x;
    }
    public float getY(float y){
        return this.y;
    }
    public void printPoint(){
        System.out.println("Toa do: (" + getX(this.x) + "," + getY(this.y) +")" ); 
    }
    public float getDistance(Point B){
        float dis = (float)Math.sqrt((this.x - B.x)*(this.x-B.x) + (this.y - B.y)*(this.y - B.y));
        return dis;
    }
    
}
