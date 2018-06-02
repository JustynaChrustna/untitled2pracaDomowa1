package newPackage;

public class Car{
	private static  int passenger;
	private static String name;

	public Car(int passenger, String name) {
		this.passenger = passenger;
		this.name = name;
	}
	public Car(String name, int passenger) {
		this.passenger = passenger+1;
		this.name = name;
	}

	 public static String drive(String n, int p) {
		return"Stop ";
	}
	 private static String drive(int p, String n) {
		 
		return"Broom, broom "+ name;
	}
	 public static int getPassenger() {
		 return passenger;
	 }
	 public static String getName() {
		 return name;
	 }
	 public static void setPassenger(int i) {
		passenger=1;
	 }
	 public static void setName(String s) {
		 name=s;
	 }

}
