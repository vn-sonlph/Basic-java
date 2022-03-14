import java.util.Calendar;
import java.util.Scanner;

public class bai6 {
    public static Calendar copyCalendar(Calendar a){
        Calendar tempCalendar;
        tempCalendar = Calendar.getInstance();
        tempCalendar.set(a.get(Calendar.YEAR), a.get(Calendar.MONTH), a.get(Calendar.DATE));
        return tempCalendar;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String date1 = "";
        String date2 = "";
    }
}
