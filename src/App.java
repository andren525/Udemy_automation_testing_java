import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        File file = new File("text");
        Scanner scanner = new Scanner(file);
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("Some Text");
        fileWriter.flush();
        fileWriter.close();
        while(scanner.hasNext()){
            System.out.print(scanner.next());
        }
    }
}