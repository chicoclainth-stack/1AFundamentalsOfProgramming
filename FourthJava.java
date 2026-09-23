import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FourthJava {
    public static void main(String[] args){

        String filePath = "Chico.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("this is the first line of text");
            writer.newLine();
            writer.write("this is the second line of text.");
            writer.newLine();
            writer.write("BufferedWriter makes writing fast and efficient.");
            System.out.println("data successfully written to the file!");

        }catch (IOException e){
            System.err.println("an error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
