package string;

public class DayCalendar {
	int dd;
	int mm;
	int yy;
	int month[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

	DayCalendar(int dd,int mm,int yy){
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		if(yy%400==0||yy%4==0&&yy%100!=0) {
			month[2]=29;
		}
	}
		public String toString() {
			return dd+"/"+mm+"/"+yy;
		}

		public int noOfDays() {
			int y=yy-1;
			int days=y*365+y/400+y/4-y/100;
			for(int ia=1;i<mm;i++) {
				days=days+month[i];
			}
			days=days+dd;
			return days;
		}

		public boolean isValid() {
			if(dd<1||dd>31||mm<1||mm>12||yy<1)
				return false;
			if((mm==4||mm==6||mm==9||mm==11)&&dd>30)
				return false;
			if(mm==2&&dd>29)
				return false;
			if((yy%400==0||yy%4==0&&yy%100!=0)&&mm==2&&dd>28)
				return false;
			return true;
		}

		public String getDayName() {
			int days=noOfDays();
			return dname[days%7];
		}
	}
