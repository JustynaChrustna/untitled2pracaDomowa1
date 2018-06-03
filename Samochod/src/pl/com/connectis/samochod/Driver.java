package pl.com.connectis.samochod;

import java.sql.Date;
import java.util.Calendar;

public class Driver {
	public String name;
	int bornIn;
	String bornYear;
	
	public Driver(String name, String bornYear) {
		this.name=name;
		this.bornYear=bornYear;
	}
	public Driver(String name, int bornYear) {
		this.name=name;
		this.bornIn=bornYear;
	}
	
	public String getAgeInString() {
		int year=Integer.parseInt(bornYear);
		int currentYear=Calendar.getInstance().get(Calendar.YEAR);
		int age=currentYear-year;
		return String.valueOf(age);
	}
	
	public int getAgeInInt() {
		int currentYear=Calendar.getInstance().get(Calendar.YEAR);

		return currentYear-bornIn;
	}

}
