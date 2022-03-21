import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class bai6 {
    //1
    public static String compareDate(Calendar a, Calendar b){
        if (a.get(Calendar.DAY_OF_MONTH)!=b.get(Calendar.DAY_OF_MONTH)){
            return "Date A is different from Date B";
        }
        else{
            if (a.get(Calendar.MONTH)!=b.get(Calendar.MONTH)){
                return "Date A is different from Date B";
            }
            else{
                if (a.get(Calendar.YEAR)!=b.get(Calendar.YEAR)){
                    return "Date A is different from Date B";
                }
                else{
                    return "Date A is same as Date B";
                }
            }
        }
    }
    //2
    public static Calendar copyCalendar(Calendar a){
        Calendar tempCalendar;
        tempCalendar = Calendar.getInstance();
        tempCalendar.set(a.get(Calendar.YEAR), a.get(Calendar.MONTH), a.get(Calendar.DATE));
        return tempCalendar;
    }
    public static String beforeOneDay(Calendar a){
        Calendar temp = copyCalendar(a);
        temp.add(Calendar.DAY_OF_YEAR, -1);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String result = s.format(temp.getTimeInMillis());
        return result;
    }
    public static String afterOneDay(Calendar a){
        Calendar temp = copyCalendar(a);
        temp.add(Calendar.DAY_OF_YEAR, +1);
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        String result = s.format(temp.getTimeInMillis());
        return result;
    }
    //3
    public static void dayOfYear(Calendar a){
        System.out.println(a.get(a.DATE) + "/" + a.get(a.MONTH+1) + "/" + a.get(a.YEAR) + " is the " + a.get(a.DAY_OF_YEAR) + " day of the year");
    }
    //4
    public static int dayOfMonth(Calendar a){
        int month = a.get(Calendar.MONTH);
        int dayofmonth = 0;
        switch(month+1){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dayofmonth=31; break;
            case 4: case 6: case 9: case 11:
                dayofmonth=30; break;
            case 2: 
                if(a.get(Calendar.YEAR)%400==0||(a.get(Calendar.YEAR)%4==0)&&(a.get(Calendar.YEAR)%100!=0)){
                    dayofmonth=29;
                }
                else{
                    dayofmonth=28;
                }
                break;
            default:
                break;
        }
        return dayofmonth;
    }
    //5
    public static String checkYear(Calendar a){
        if (((a.get(Calendar.YEAR) % 4 == 0) && (a.get(Calendar.YEAR) % 100 != 0)) || (a.get(Calendar.YEAR) % 400 == 0)){
            return "Leep year";
        }
        else{
            return "Isn't leep year";
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calendar dateA = Calendar.getInstance();
        Calendar dateB = Calendar.getInstance();

        int dayA, monthA, yearA;
        System.out.print("Enter year a: ");
        yearA = sc.nextInt();
        dateA.set(Calendar.YEAR, yearA);
        
        System.out.print("Enter month a: ");
        monthA = sc.nextInt();
        dateA.set(Calendar.MONTH, monthA-1);
        
        System.out.print("Enter day a: ");
        dayA = sc.nextInt();
        dateA.set(Calendar.DAY_OF_MONTH, dayA);
        
        int dayB, monthB, yearB;
        System.out.print("Enter year b: ");
        yearB = sc.nextInt();
        dateB.set(Calendar.YEAR, yearB);
        
        System.out.print("Enter month b: ");
        monthB = sc.nextInt();
        dateB.set(Calendar.MONTH, monthB-1);

        System.out.print("Enter day b: ");
        dayB = sc.nextInt();
        dateB.set(Calendar.DAY_OF_MONTH, dayB);
        
        String cprDate = compareDate(dateA, dateB);
        System.out.println(cprDate);
        
    }
}
