import java.io.File;
import java.io.IOException;

public class Exercise {
    public static boolean createFile(String fileName) {

        try {
            File myObj = new File(fileName.);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
                return true;
            } else {
                System.out.println("File already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return false;

    }


   // public static boolean writeToFile(String fileName, String content) {

  //  }

   // public static String readFromFile(String fileName) {

    //}
}
