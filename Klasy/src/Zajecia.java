
public class Zajecia {

	private String prowadzacy;
	private int iloscOsob;
	private String nazwaSali;
	public Zajecia() {
		
	}
	public Zajecia(String p) {
		this.prowadzacy = p;
	}

	public Zajecia(String p, int i) {
		this.prowadzacy = p;
		this.iloscOsob = i;
	}

	public Zajecia(String p, int i, String n) {
		this.prowadzacy = p;
		this.iloscOsob = i;
		this.nazwaSali = n;
	}

	public  String getProwadzacy() {
		return prowadzacy;
	}

	public void setProwadzacy(String p) {
		prowadzacy = p;
	}

	public int getIloscOsob() {
		return iloscOsob;
	}

	public void setIloscOsob(int i) {
		iloscOsob = i;
	}

	public String getNazwaSali() {
		return nazwaSali;
	}

	public void setNazwaSali(String nazwa) {
		nazwaSali = nazwa;
	}

}
