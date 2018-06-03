package pl.com.connectis.samochod;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9;

		Car car=new Car(new Driver("Jan", "1970"), 
				new Engine(2.0,  new Wykonawca(12345678)));
		Car car2=new Car(new Driver("Jan", 1971), 
				new Engine(2.0,  new Wykonawca(12345678)));
		System.out.println("Wiek w String="+car.driver.getAgeInString());
		System.out.println("Wiek w int="+car2.driver.getAgeInInt());


	}

}
