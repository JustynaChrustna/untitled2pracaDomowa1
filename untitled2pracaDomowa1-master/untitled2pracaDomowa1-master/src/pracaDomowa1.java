
public class pracaDomowa1 {
    public static void main(String[] args) {
        int[] t = {-8, 2, 6, 76, 1, -17, 0, 6, 2, 7, 92, 17, -32, -1};
        int[][] tabIn ={{1, 2}, {1, 1, 1, 1},{3, 3, 3}};
        int[][] tabIn2 ={{1, 3}, {1, 6, 1, 7},{5, 3, 6}};
        int[][] histogram2=Tools.histogram(tabIn2, 5);
        String str5=Tools.histogramToString(histogram2);
        System.out.println("histogramToString");
        System.out.println(str5);
        int[][]histogram=Tools.histogram(tabIn, 3);
        System.out.println();
        Tools.printHistogram(histogram);
        System.out.println();
        
        //histogram(tabIn);



        String str1 = "abc";
        String str2 = "   Abc";
        String str3 = "s     d   f";

        //10. sprawdenie czy zmienne typu string są takie same
        System.out.println(str1.equals(str2));
        //11. pobranie znaku z podanej pozycji
        System.out.println(str1.charAt(1));
        //12. odwrócenie obiektu klasy string
        String str = new StringBuffer(str1).reverse().toString();
        System.out.println(str);
        //13. sprawdzenie czy String zaczyna się jak podany jako argument String
        System.out.println(str1.startsWith("ab"));
        //14. sprawdzenie czy zmienna typu string zawiera ciąg znaków
        System.out.println("string contains string:" + str1.contains(str2));
        System.out.println("countWords=" + countWords(str3));
        System.out.println("removepace=" + removeSpace(str3));
        System.out.println(addSpaceAfter("Connectis", 'c'));
        System.out.println(addSeparators("Connectis", "X", 1));
        //sprawdzenie długości ciągu znaków
        System.out.println("stringLength=" + stringLength(str2));
        System.out.println(str2.length());

        System.out.println("stringLengthChar=" + stringLengthChar("aa aa ndczc ckvzoo", 'c'));
        System.out.println(lowToUpFromHalf("Alamakkotaa"));
        System.out.println(removeWhiteSigns("ala ma kota"));
        System.out.println("isStartsLike=" + isStartsLike("kaota", "aaaaakot"));
        int[] tab5= {1, 1,1,2, 3, 6, 4, 5};
        //System.out.println("k-ty element"+kElement(tab5, 3));
        
        
    }

    //0. metoda licząca pole koła
    static double circleArea(double r) {
        return r * r * Math.PI;
    }

    //0. metoda licząca obwód okręgu
    static double circleCircuit(double r) {
        return 2 * r * Math.PI;
    }

    //0. metoda licząca pole trójkąta argumenty: wysokość i bok
    static double triangleArea(double a, double h) {
        return 0.5 * a * h;
    }

    //0. metoda licząca pole trójkąta argumenty: boki
    static double triangleArea(double a, double b, double c) {
        double p = 0.5 * (a + b + c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    //0.  metoda licząca pole trójkąta argumenty: dwa boki i kąt
    static double triangleAreaSin(double a, double b, double angle) {
        return 0.5 * a * b * Math.sin(angle);
    }

    //0. metoda licząca pole prostopadłościanu
    static double cuboidArea(double a, double b, double h) {
        return 2 * a * b + 2 * a * h + 2 * b * h;
    }

    //1.  metoda licząca prędkość. Argumenty: czas i odległość
    static double speed(double t, double s) {
        return s / t;
    }

    //2. metoda liczaca spalanie paliwa. Argumenty: dystans s i spalanie f
    public static double fuelCalc(double s, double f) {
        return s * f / 100;
    }

    //3. metoda przeliczająca Celcius <-> Fahrenheit
    static double CelciusToFahrenheit(int celcius) {
        return 32 + (9 / 5) * celcius;
    }

    //3. metoda przeliczająca Fahrenheit <-> Celcius
    static double FahrenheitToCelcius(int fahr) {
        return (5 / 9) * (fahr - 32);
    }

    //4.  metoda przeliczająca mile/h na km/h
    static double mphToKmph(double mph) {
        return 1.61 * mph;
    }

    //5.  metoda znajdująca k-ty co do wielkości element tablicy.
    static int kElement(int[] tab, int k) {
        int e = 0;
        int temp;
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            }
        }
        for(int i=0; i<tab.length; i++) {
        	
        }
        e = tab[k - 1];
        return e;
    }

    //6.  metoda licząca średnią tablicy dwuwymiarowej
    static double array2DAverage(int[][] tab) {
        double sum = 0;
        double totalQ = 0;
        // obliczenie średnich dla wierszy i całej macierzy
        for (int j = 0; j < tab.length; j++) {
            double lineSum = 0;
            double lineAverage = 0;
            for (int i = 0; i < tab[j].length; i++) {
                lineSum = lineSum + tab[j][i];
                sum = sum + tab[j][i];
                totalQ++;
            }
            lineAverage = lineSum / tab[j].length;
            System.out.println(j + " line average=" + lineAverage);
        }
        // obliczenie średnich dla kolumn
        for (int i = 0; i < tab[0].length; i++) {
            double columnAverage = 0;
            double columnSum = 0;
            for (int j = 0; j < tab.length; j++) {
                columnSum = columnSum + tab[j][i];
            }
            columnAverage = columnSum / tab.length;
            System.out.println(i + " column average=" + columnAverage);
        }
        double totalAverage = sum / totalQ;
        System.out.println("totalAverage=" + totalAverage);
        return totalAverage;
    }
    //7. Histogram
    static void histogram(int[][] tabIn){
        int[] tabV = new int[100];
        int[] tabF = new int[100];
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
    }
    // 8. trójkąt Pascala
    static int[][] pascal(int lines) {
        int columns = 2 * lines - 1;
        int[][] pascal = new int[lines][columns];
        int x = (columns / 2);
        //wypełniam tablicę jedynkami
        int i = 0;
        for (int j = pascal.length; j > 0; j--) {

            pascal[j - 1][i] = 1;
            pascal[j - 1][columns - i - 1] = 1;
            i++;
        }

        for (int j = 1; j < pascal.length; j++) {
            for (int k = 1; k < pascal[j].length - 1; k++) {
                if (pascal[j][k] != 1) {
                    pascal[j][k] = pascal[j - 1][k - 1] + pascal[j - 1][k + 1];
                }
            }
        }

        return pascal;
    }

    //metoda wypisująca trójkąt Pascala
    static void printArrayForPascal(int[][] tab) {
        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab[j].length; i++) {
                if (tab[j][i] != 0) {
                    System.out.print(tab[j][i] + "     ");

                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
            System.out.println();
            System.out.println();
        }

    }

    //10. metoda sprawdza czy zmienne typu String są takie same
    static boolean equalString(String str1, String str2) {
        boolean equalString;
        if (stringLength(str1) == stringLength(str2)) {
            equalString = true;
            for (int j = 0; j < stringLength(str1); j++) {
                if (str1.charAt(j) != str2.charAt(j)) {
                    equalString = false;
                }

            }
        } else {
            equalString = false;
        }

        return equalString;

    }

    //12. metoda odwracająca napis
    static String reverseString(String oldString) {
        String newString = "";
        for (int i = oldString.length() - 1; i >= 0; i--) {
            newString = newString + oldString.charAt(i);
        }
        return newString;
    }

    //13. metoda sprawdzająca czy zmienna typu string str1 zacyzna się podany ciąg znaków str2
    static boolean isStartsLike(String str1, String str2) {
        boolean isStartsLike = false;
        if (stringLength(str1) < stringLength(str2)) {
            isStartsLike = false;
        } else {
            for (int i = 0; i < stringLength(str2); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isStartsLike = false;
                } else {
                    isStartsLike = true;
                }

            }
        }
        return isStartsLike;
    }
    //14. metoda sprawdzająca czy zmienna typu string str1 zawiera podany ciąg znaków str2

    //15. metoda liczy ilość słów
    static int countWords(String str) {
        str = str.trim();
        int count = 0;
        if (!str.equals("")) {
            count = count + 1;
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                    count++;
                }

            }
            return count;

        } else {
            return 0;
        }


    }

    //16. metoda usuwa spacje z ciągu znaków
    static String removeSpace(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newString = newString;
            } else {
                newString = newString + str.charAt(i);
            }

        }
        return newString;
    }

    //17. metoda dodaje spację po wystąpieniu podanej litery
    static String addSpaceAfter(String str, char character) {
        String newString = "";
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == character || str.toLowerCase().charAt(i) == character) {
                newString = newString + str.charAt(i);
                newString = newString + "_";
            } else {
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }

    //18. metoda dodoająca separator n- razy
    static String addSeparators(String word, String separator, int n) {
        String newString = "";
        for (int i = 1; i <= n; i++) {
            if (i < n) {
                newString = newString + word + separator;
            } else {
                newString = newString + word;
            }

        }

        return newString;
    }

    //19. metoda sprawdzająca długość zmiennej typu String
    static int stringLength(String str) {
        int i = 0;
        String tmpString = "";
        while (!tmpString.equals(str)) {
            tmpString = tmpString + str.charAt(i);
            i++;
        }
        return i;
    }

    //20. długość ciągu znaków aż do wystąpienia podanej litery
    static int stringLengthChar(String str, char ch) {
        int i = 0;

        while (str.charAt(i) != ch) {
            i++;
        }
        return i;
    }

    //21. metoda przepisująca zmienną typu String do tablicy
    static char[] stringToArray(String str) {
        //korzystam z wcześniej napisanej metody zwracajacej długość zmiennej typu String
        char[] charArray = new char[stringLength(str)];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    //23. metoda zamieniająca wszystkie małe litery na wielkie od połowy
    static String lowToUpFromHalf(String str) {
        String newString = "";
        String s = "";
        for (int i = 0; i < stringLength(str) / 2; i++) {
            newString = newString + str.charAt(i);
        }
        for (int i = (stringLength(str) / 2); i < stringLength(str); i++) {
            newString = newString + String.valueOf(str.charAt(i)).toUpperCase();
        }
        return newString;
    }

    //24. metoda usuwająca białe znaki
    static String removeWhiteSigns(String str) {
        String newString = "";
        for (int i = 0; i < stringLength(str); i++) {

            if (!Character.isWhitespace(str.charAt(i))) {
                newString = newString + str.charAt(i);
            }
        }
        return newString;
    }


}
