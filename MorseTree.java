import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MorseTree {
    TreeNode<String> letters = new TreeNode<String>("-");

    
    public MorseTree(){
    }

    void PreOrder(){
        letters.preorder(letters);
    }

    void PostOrder(){
        letters.postorder(letters);
    }

    void EngToMorse(String text,File file){
        try{
            Scanner scanner = new Scanner(file);
            for (int i = 0; i < text.length(); i++)
            while (scanner.hasNextLine()){
            
                
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
    }}

    void MorseToEng(){

    }
}
