package string;

public class MainDate {
public static void main(String[] args) {
	DayCalendar dt1=new DayCalendar(15,8,1947);
	DayCalendar dt2=new DayCalendar(30,7,2024);
	
	System.out.println("First date: "+dt1);
	System.out.println("last date: "+dt2);
	
	int days=dt2.noOfDays()-dt1.noOfDays();
	System.out.println("Number of days between "+dt1+" and "+dt2+" is: "+days);
	
	System.out.println(dt1+" Days name: "+dt1.getDayName());
	System.out.println(dt2+" Days name: "+dt2.getDayName());
}
}
