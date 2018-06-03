package pl.connectis.cschool.budynek;

public class Kondygnacja {
	Pomieszczenie[] pomieszczenia;
	String nazwa;
	public Kondygnacja(String nazwa, Pomieszczenie[] pomieszczenia) {
		super();
		this.pomieszczenia = pomieszczenia;
		this.nazwa = nazwa;
	}
	public Pomieszczenie[] getPomieszczenia() {
		return pomieszczenia;
	}
	public void setPomieszczenia(Pomieszczenie[] pomieszczenia) {
		this.pomieszczenia = pomieszczenia;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	

} 
