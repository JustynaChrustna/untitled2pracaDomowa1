package pl.connectis.cschool.budynek;

public class Drzwi {
	private String nazwa;
	private StatusOtwarcia statusOtwarcia=StatusOtwarcia.OTWARTE;
	
	
	public Drzwi(String nazwa) {
		super();
		this.nazwa = nazwa;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public StatusOtwarcia getStatusOtwarcia() {
		return statusOtwarcia;
	}
	public void setStatusOtwarcia(StatusOtwarcia statusOtwarcia) {
		this.statusOtwarcia = statusOtwarcia;
	}
	public void zamknij() {
		statusOtwarcia=StatusOtwarcia.ZAMKNIETE;
	}
	public void otworz() {
		statusOtwarcia=StatusOtwarcia.OTWARTE;
	}
	public void uchyl() {
		statusOtwarcia=StatusOtwarcia.UCHYLONE;
	}
}
