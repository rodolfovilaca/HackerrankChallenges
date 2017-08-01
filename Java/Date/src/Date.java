
public class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(String date){
		String[] fields = date.split("/");
		month = Integer.parseInt(fields[0]);
		day = Integer.parseInt(fields[1]);
		year = Integer.parseInt(fields[2]);
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getYear() {
		return year;
	}
	
}
