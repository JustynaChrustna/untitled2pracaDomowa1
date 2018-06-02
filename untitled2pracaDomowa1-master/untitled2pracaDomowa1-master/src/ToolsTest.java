import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ToolsTest {
	
	//1
	@Test
	public void checkSpeed() {
		int s=20;
		int t=10;
		
		double voczekiwane=2;
		double vwyliczone=pracaDomowa1.speed(t, s);
		assertEquals(voczekiwane, pracaDomowa1.speed(t, s), 0.01);
	}
	//2
	@Test
	public void checkHistogram() {
		//dane przygotowane na potrzeby testu
        int[][] tabIn = {{1, 2}, {1, 1, 1, 1},{3, 3, 3}};
        int[][]histogram=Tools.histogram(tabIn, 3);
        //Rezultat przygotowany dla potrzeb testu
        int[][] expectedResult={{1, 2, 3}, {5, 1, 3}};
        
        for (int i=0; i<histogram.length; i++) {
        	for(int j=0; j<histogram[i].length; j++) {
        		assertEquals(expectedResult[i][j], histogram[i][j]);
        	}
        }
		
	}
	@Test
	public void checkfuelCalc() {
		double f=5.2;
		double s=150.0;
		double result=Tools.fuelCalc(s, f);
		double expectResult=7.8;
		assertEquals(expectResult, result, 0.01);
		
	}
	
	@Test
	public void checkFahrenheitToCelcius() {
		int fahrenheit=150;
		double result=Tools.FahrenheitToCelcius(fahrenheit);
		double expectResult= 65.55;
		assertEquals(expectResult, result, 0.001);
	}

}
