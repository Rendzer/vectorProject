package vector;

import java.io.*;

public class WriteResultToFile {

    void writeToFile(Vector firstVector, Vector secondVector) {
        File file = new File("result.txt");
        FileWriter fileWriter;
        int result;
        try {
            fileWriter = new FileWriter(file);
            for (int i = 0; i < firstVector.valueList.size(); i++) {
                result = firstVector.valueList.get(i) + secondVector.valueList.get(i);
                fileWriter.write(result + "\t");
            }
            fileWriter.close();
        } catch(FileNotFoundException e) {
            System.out.println("Nie znaleziono takiego pliku!");
        } catch (IOException e) {
            System.out.println("Błąd odczytu pliku!");
        }
    }

}
