package pl.connectis.cschool.budynek;

public class Budynek {
private Kondygnacja[] kondygnacje;
private String nazwa;
public Budynek(String nazwa, Kondygnacja[] kondygnacje) {
	super();
	this.kondygnacje = kondygnacje;
	this.nazwa = nazwa;
}
public Kondygnacja[] getKondygnacje() {
	return kondygnacje;
}
public void setKondygnacje(Kondygnacja[] kondygnacje) {
	this.kondygnacje = kondygnacje;
}
public String getNazwa() {
	return nazwa;
}
public void setNazwa(String nazwa) {
	this.nazwa = nazwa;
}
public void zamknijWszystkieDrzwiOkna() {
	for(Kondygnacja kondygnacja:kondygnacje) {
		for(Pomieszczenie pomieszczenie:kondygnacja.getPomieszczenia()) {
			for(Okno okno: pomieszczenie.getOkna()) okno.zamknij();
			for(Drzwi drzwi: pomieszczenie.getDrzwi()) drzwi.zamknij();
		}
	}
}


}
