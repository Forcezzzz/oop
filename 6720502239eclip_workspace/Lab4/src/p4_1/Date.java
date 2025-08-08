package p4_1;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		
	}
	public Date(int day,int month,int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDay(int day){
		if (day >= 1 && day <= 31)
			this.day=day;
	}
	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
	}
	public void setYear(int year) {
		this.year = this.year + 543;
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth() {
		return this.month;
	}
	public int getYear() {
		return this.year;
	}
	public void Display() {
		System.out.println("Day : " + getDay());
		System.out.println("Month : " + getMonth());
		System.out.println("Year : " + getYear());
	}
}