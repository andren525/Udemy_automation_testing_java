import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ciao {

    public static void main(String[] args) {
        //Example of checked exception
        File file = new File("C:\\randomname.txt");
        try {
            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //Example of runtime exception
        Integer[] arr = {2,3,4};

        try {
            System.out.println(arr[3]);
            System.out.println("Line after exception");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        finally {
            System.out.println("Finally block");
        }
        System.out.println("Additional Line");
    }
}