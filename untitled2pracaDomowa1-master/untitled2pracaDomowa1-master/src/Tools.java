
public class Tools {
	
	
	
public int[][] histogram(int[][] tabIn, int max){
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


    for (int i = 0; i < indexOfLastFrequency; i++) {
        System.out.println("Wartość:" + tabV[i] + " występuje " + tabF[i]+"razy");

    }
    for (int i = 0; i < indexOfLastFrequency; i++) {
        System.out.print(tabV[i]+" ");
        for (int j = 0; j <tabF[i] ; j++) {
            System.out.print("*");

        }
        System.out.println();

    }
    int[][] resultTab= {tabV, tabF};
    return resultTab;


}







}
