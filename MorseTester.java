import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseTester {
    public static void main(String[] args){
        try{
            File file = new File("morsecode.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
            String data = scanner.nextLine();
                
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

    }
}
