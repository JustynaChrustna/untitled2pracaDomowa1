import newPackage.Car;
import newPackage.Train;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String obj1 = new String("a");
		String obj2 = new String("a");
		Car car = new Car("niebieski samochód", 4);
		Car car1 = new Car("car", 2);
		System.out.println("Empty objects="+car.equals(car1));
		Train small=new Train(50, "small train");
		Train medium=new Train(150, "medium train");
		Train big=new Train(300, "big train");
		System.out.println(car.hashCode());
		System.out.println(small.hashCode());
		System.out.println(medium.hashCode());
		System.out.println(big.hashCode());
		System.out.println(big.toString());
		System.out.println(car.toString());
		System.out.println(car.drive("string", 2));
		System.out.println("silnia"+silnia(0));
		//getter i setter 
		System.out.println("nazwa smaochodu: "+car.getName());
		car.setName("czerwony samochód");
		System.out.println("nazwa smaochodu: "+car.getName());
		printFibonacci(10);
		fibonacci(10);
		//metoda private
		//System.out.println(car.drive(1, "string"));
		//pole private
		//System.out.println("car name: "+car.name);
		int a = 10;
		char b = 'c';
		boolean d = true;
		long e = 10000;
		double g = 10f;

		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		Airplane air=new Airplane("samolot");
		System.out.println(air.protectedMethod());
		
		
		
		//klasa zajêcia
		Zajecia z1=new Zajecia();
		Zajecia z2=new Zajecia("Kowalski");
		Zajecia z3=new Zajecia("Nowak", 17);
		Zajecia z4=new Zajecia("Zalewski", 32, "Sala 3");
		System.out.println("prowadzacy: "+z1.getProwadzacy()+" iloœæ osób: "+z1.getIloscOsob()+ " nazwa sali: "+ z1.getNazwaSali());
		System.out.println("prowadzacy: "+z2.getProwadzacy()+" iloœæ osób: "+z2.getIloscOsob()+ " nazwa sali: "+ z2.getNazwaSali());
		System.out.println("prowadzacy: "+z3.getProwadzacy()+" iloœæ osób: "+z3.getIloscOsob()+ " nazwa sali: "+ z3.getNazwaSali());
		System.out.println("prowadzacy: "+z4.getProwadzacy()+" iloœæ osób: "+z4.getIloscOsob()+ " nazwa sali: "+ z4.getNazwaSali());

	}
	
	
	
	
	
	
	
	
	static int silnia(int n) {
		int k=1;
		if(n>0) {
		k=n*silnia(n-1);
		}
		return k;
	}
	static void printFibonacci(int n) {
		
		for(int i=1; i<n; i++) {
			System.out.println(fibonacci(i));
		}

}
	static int fibonacci(int m) {
		int fibo;
		if(m==0) {
			fibo=0;
		}
		if(m==1||m==2) {
			fibo=1;
		}
		else {
			fibo=fibonacci(m-1)+fibonacci(m-2);
		}


		return fibo;
		}
		
}
	
	


