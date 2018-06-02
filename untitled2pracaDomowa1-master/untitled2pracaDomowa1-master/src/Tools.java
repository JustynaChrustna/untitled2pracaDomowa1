
public class Tools {
	//7. metoda rysuj�ca histogram
	public static void printHistogram(int[][] result) {
		for (int i = 0; i < result[0].length; i++) {
	        System.out.print(result[0][i]+" ");
	        for (int j = 0; j <result[1][i] ; j++) {
	            System.out.print("*");

	        }
	        System.out.println();

	    }
	}
	//7. metoda zwraca narysowany histogram jako zmienn� typu String
	public static String histogramToString(int[][] tabVF) {
		StringBuilder result= new StringBuilder();
		for (int i = 0; i < tabVF[0].length; i++) {
	        result.append(tabVF[0][i]+"\t");
	        for (int j = 0; j <tabVF[1][i] ; j++) {
	            result.append("*");

	        }
	        result.append("\n");

	    }
		return result.toString();
		
	}
	
	//7. metoda zwraca histogram
public static int[][] histogram(int[][] tabIn, int max){
	int[] tabV = new int[max];
    int[] tabF = new int[max];
    int indexOfLastFrequency = 0;

    for (int i = 0; i < tabIn.length; i++) {
        for (int k = 0; k <tabIn[i].length ; k++) {
            int value = tabIn[i][k];


            boolean valueExist = false;

            for (int j = 0; j < tabV.length; j++) {

                if (tabV[j] == value) {
                    tabF[j] = tabF[j] + 1;
                    valueExist = true;
                }
            }
            if (!valueExist) {

                tabV[indexOfLastFrequency] = value;
                tabF[indexOfLastFrequency] = 1;
                indexOfLastFrequency++;


            }
        }}

//wypisanie i wyrysowanie histogramu
   /* for (int i = 0; i < indexOfLastFrequency; i++) {
        System.out.println("Wartość:" + tabV[i] + " występuje " + tabF[i]+"razy");

    }
    for (int i = 0; i < indexOfLastFrequency; i++) {
        System.out.print(tabV[i]+" ");
        for (int j = 0; j <tabF[i] ; j++) {
            System.out.print("*");

        }
        System.out.println();

    }*/
    int[][] resultTab= {tabV, tabF};
    return resultTab;


}

//2. metoda liczaca spalanie paliwa. Argumenty: dystans s i spalanie f
public static double fuelCalc(double s, double f) {
    return s * f / 100;
}


//3. metoda przeliczająca Fahrenheit <-> Celcius
 public static double FahrenheitToCelcius(int fahr) {
    return (5 / 9) * (fahr - 32);
}



}
