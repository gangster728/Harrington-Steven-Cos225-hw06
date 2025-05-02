public class MorseTester {
    public static void main(String[] args){
        String input = "The quick fox";
        
        MorseTree tree = new MorseTree();
        tree.CreateTree();
        tree.PreOrder();
        tree.PostOrder();
        String Morse = tree.EngToMorse(input);
        System.out.println(Morse);
        String English = tree.MorseToEng(Morse);
        System.out.println(English);
        
    } }

