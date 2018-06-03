package pl.connectis.cschool.budynek;

import static org.junit.Assert.assertEquals;

public class Alarm {
	private StatusAlarmu statusAlarmu = StatusAlarmu.WYLACZONY;
	private Budynek budynek;
	private StatusSyreny statusSyreny=StatusSyreny.WYLACZONA;

	public Alarm(Budynek budynek) {

		this.budynek = budynek;
	}

	public void uzbroj() {
		statusAlarmu = StatusAlarmu.UZBROJONY;
	}

	public StatusAlarmu getStatus() {
		return statusAlarmu;
	}
	//syrena w³¹czy siê tylko jeœli alarm jest uzbrojony
	public void wlaczSyrene() {
		if(statusAlarmu==StatusAlarmu.UZBROJONY) {
			statusSyreny=StatusSyreny.WLACZONA;
		}
		else {
			statusSyreny=StatusSyreny.WYLACZONA;
		}
	}
	public void wylaczSyrene() {
		
		statusSyreny=StatusSyreny.WYLACZONA;
	}

	public void sprawdzBudynek() {
		if(statusAlarmu==StatusAlarmu.UZBROJONY) {
		wylaczSyrene();
		

			for (Kondygnacja kondygnacja : budynek.getKondygnacje()) {
				for (Pomieszczenie pomieszczenie : kondygnacja.getPomieszczenia()) {
					for (Okno okno : pomieszczenie.getOkna()) {
						if (okno.getStatusOtwarcia() == StatusOtwarcia.OTWARTE) {
							System.out.println("£yju, £yju");
							System.out.println("Otwarte okno: " + okno.getNazwa() + " w pomieszczeniu: "
									+ pomieszczenie.getNazwa() + " na kondygnacji: " + kondygnacja.getNazwa());
							wlaczSyrene();
						

						}
						
					}
					for (Drzwi drzwi : pomieszczenie.getDrzwi()) {
						if (drzwi.getStatusOtwarcia() == StatusOtwarcia.OTWARTE) {
						System.out.println("£yju, £yju");
						System.out.println("Otwarte okno: " + drzwi.getNazwa() + " w pomieszczeniu: "
								+ pomieszczenie.getNazwa() + " na kondygnacji: " + kondygnacja.getNazwa());
						wlaczSyrene();
					
						}
						
					}
				}
			}
		}
		System.out.println();
		System.out.println();
		}
	

	public StatusSyreny getStatusSyreny() {
		return statusSyreny;
	}

}
