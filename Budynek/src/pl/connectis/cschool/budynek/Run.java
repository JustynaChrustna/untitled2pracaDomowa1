package pl.connectis.cschool.budynek;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Okno oSypialnia1= new Okno("Okno w sypialni 1");
		Okno oSypialnia2= new Okno("Okno w sypialni 2");
		Okno oSypialnia3= new Okno("Okno w sypialni 3");
		Okno oLazienkaPietro= new Okno("Okno w ³azience piêtro");
		Okno oHollPietro= new Okno("Okno w hollu na piêtrze");
		Okno oBalkonowe= new Okno("Okno balkonowe");
		
		Okno oKuchnia= new Okno("Okno kuchnia");
		Okno oSalon= new Okno("Okno salon");
		Okno oJadalnia1= new Okno("Okno jadalnia 1");
		Okno oJadalnia2= new Okno("Okno jadalnia 2");
		Okno oJadalnia3= new Okno("Okno jadalnia 3");
		Okno oGabinet= new Okno("Okno gabinet");
		Okno oGaraz= new Okno("Okno gara¿");
		Okno oLazienkaParter= new Okno("Okno ³azienka parter");
		
		Drzwi dSypialnia1= new Drzwi("drzwi sypialnia 1");		
		Drzwi dSypialnia2= new Drzwi("drzwi sypialnia 2");
		Drzwi dSypialnia3= new Drzwi("drzwi sypialnia 3");
		Drzwi dLazienkaPietro= new Drzwi("drzwi ³azienka na piêtrze");
		Drzwi dLazienkaParter= new Drzwi("drzwi ³azienka parter");
		
		Drzwi dKuchnia= new Drzwi("drzwi kuchnia");
		Drzwi dJadalnia1= new Drzwi("drzwi jadalnia 1");
		Drzwi dJadalnia2= new Drzwi("drzwi jadalnia 2");
		Drzwi dSalon= new Drzwi("drzwi salon");
		Drzwi dgabinet= new Drzwi("drzwi gabinet");
		Drzwi dGarazowe= new Drzwi("drzwi gara¿");	
		

		Pomieszczenie sypialnia1= new Pomieszczenie("sypialnia1", new Drzwi[] {dSypialnia1}, new Okno[] {oSypialnia1, oBalkonowe});
		Pomieszczenie sypialnia2= new Pomieszczenie("sypialnia2", new Drzwi[] {dSypialnia2}, new Okno[] {oSypialnia2});
		Pomieszczenie sypialnia3= new Pomieszczenie("sypialnia3", new Drzwi[] {dSypialnia3}, new Okno[] {oSypialnia3});
		Pomieszczenie lazienkaPietro= new Pomieszczenie("£azienka na piêtrze", new Drzwi[] {dLazienkaPietro}, new Okno[] {oLazienkaPietro});
		Pomieszczenie hollPietro= new Pomieszczenie("Holl na piêtrze", new Drzwi[] {}, new Okno[] {oHollPietro});
		Pomieszczenie kuchnia= new Pomieszczenie("kuchnia", new Drzwi[] {dKuchnia}, new Okno[] {oKuchnia});
		Pomieszczenie lazienkaParter= new Pomieszczenie("£azienka na parterze", new Drzwi[] {dLazienkaParter}, new Okno[] {oLazienkaParter});
		Pomieszczenie gabinet= new Pomieszczenie("gabinet", new Drzwi[] {dgabinet}, new Okno[] {oGabinet});
		Pomieszczenie jadalnia= new Pomieszczenie("jadalnia", new Drzwi[] {dJadalnia1, dJadalnia2}, new Okno[] {oJadalnia1, oJadalnia2, oJadalnia3});
		Pomieszczenie salon= new Pomieszczenie("salon", new Drzwi[] {dSalon}, new Okno[] {oSalon});
		Pomieszczenie garaz= new Pomieszczenie("gara¿", new Drzwi[] {dGarazowe}, new Okno[] {oGaraz});
		
		Kondygnacja parter= new Kondygnacja("parter", new Pomieszczenie[] {kuchnia, lazienkaParter, gabinet, jadalnia, salon, garaz});
		Kondygnacja pietro= new Kondygnacja("pietro", new Pomieszczenie[] {sypialnia1, sypialnia2, sypialnia3, lazienkaPietro, hollPietro});
		
		Budynek dom = new Budynek("dom", new Kondygnacja[] { parter, pietro});
	}

}
