package vector;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Vector firstVector = new Vector();
        Vector secondVector = new Vector();
        boolean again;

        do {
            enterVector(firstVector);
            enterVector(secondVector);
            try {
                firstVector.checkVectorLength(secondVector);
                WriteResultToFile w = new WriteResultToFile();
                w.writeToFile(firstVector, secondVector);
                again = false;
            } catch (WektoryRoznejDlugosciException e) {
                System.out.println("Wektory są różnej długości! Wektor AA: " + e.getFirstVectorLength() + " wektor BB: " + e.getSecondVectorLength());
                e.printStackTrace();
                again = true;
            }
        } while (again);

    }

    static void enterVector(Vector vector) {
        String string;
        String[] array;
        Scanner elements = new Scanner(System.in);
        System.out.println("Podaj wektor:");
        vector.valueList.clear();
        string = elements.nextLine();
        array = string.split(" ");

        try {
            for (int i = 0; i < array.length; i++) {
                vector.valueList.add(Integer.parseInt(array[i]));
            }
        } catch (NumberFormatException e) {
            System.out.println("Błąd wprowadzania danych!");
            enterVector(vector);
        }
    }

}
