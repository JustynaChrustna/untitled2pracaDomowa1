package newPackage;

public class Train {
	int passenger;
	String name;
	public Train(int p, String n) {
		this.passenger=p;
		this.name=n;
		Car car=new Car("xyx", 4);
		//car.drive(4, "ddd");
		car.drive("sss", 5);
	}


	

}
