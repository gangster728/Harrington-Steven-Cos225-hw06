public class MorseTree {
    TreeNode<String> letters;

    public MorseTree(){
        letters = new TreeNode<String>(null);
    }

    public void CreateTree(){
        letters.setElement("-");
        letters.insertLeft("e");
        letters.insertRight("t");
        letters.getLeft().insertLeft("i");
        letters.getLeft().insertRight("a");
        letters.getRight().insertLeft("n");
        letters.getRight().insertRight("m");
        letters.getLeft().getLeft().insertLeft("s");
        letters.getLeft().getLeft().insertRight("u");
        letters.getLeft().getRight().insertLeft("r");
        letters.getLeft().getRight().insertRight("w");
        letters.getRight().getLeft().insertLeft("d");
        letters.getRight().getLeft().insertRight("k");
        letters.getRight().getRight().insertLeft("g");
        letters.getRight().getRight().insertRight("o");
        letters.getLeft().getLeft().getLeft().insertLeft("h");
        letters.getLeft().getLeft().getLeft().insertRight("v");
        letters.getLeft().getLeft().getRight().insertLeft("f");
        letters.getLeft().getRight().getLeft().insertLeft("l");
        letters.getLeft().getRight().getRight().insertLeft("p");
        letters.getLeft().getRight().getRight().insertRight("j");
        letters.getRight().getLeft().getLeft().insertLeft("b");
        letters.getRight().getLeft().getLeft().insertRight("x");
        letters.getRight().getLeft().getRight().insertLeft("c");
        letters.getRight().getLeft().getRight().insertRight("y");
        letters.getRight().getRight().getLeft().insertLeft("z");
        letters.getRight().getRight().getLeft().insertRight("q");

    }

    public void PreOrder(){
        System.out.print("Preorder tree contents: ");
        letters.preorder(letters);
        System.out.println();
    }

    public void PostOrder(){
        System.out.print("Postorder tree contents: ");
        letters.postorder(letters);
        System.out.println();
    }

    public String EngToMorse(String text){
        String output = "";
        for (int i = 0; i < text.length(); i++){
            char data = text.charAt(i);
            if (data == 'e' || data == 'E'){
                output = output + "o" + "|";
            }
            else if (data == 't' || data == 'T'){
                output = output + "-" + "|";
            }
            else if (data == 'i' || data == 'I'){
                output = output + "o o" + "|";
            }
            else if (data == 'a' || data == 'A'){
                output = output + "o -" + "|";
            }
            else if (data == 'n' || data == 'N'){
                output = output + "- o" + "|";
            }
            else if (data == 'm' || data == 'M'){
                output = output + "- -" + "|";
            }
            else if (data == 's' || data == 'S'){
                output = output + "o o o" + "|";
            }
            else if (data == 'u' || data == 'U'){
                output = output + "o o -" + "|";
            }
            else if (data == 'r' || data == 'R'){
                output = output + "o - o" + "|";
            }
            else if (data == 'w' || data == 'W'){
                output = output + "o - -" + "|";
            }
            else if (data == 'd' || data == 'D'){
                output = output + "- o o" + "|";
            }
            else if (data == 'k' || data == 'K'){
                output = output + "- o -" + "|";
            }
            else if (data == 'g' || data == 'G'){
                output = output + "- - o" + "|";
            }
            else if (data == 'o' || data == 'O'){
                output = output + "- - -" + "|";
            }
            else if (data == 'h' || data == 'H'){
                output = output + "o o o o" + "|";
            }
            else if (data == 'v' || data == 'V'){
                output = output + "o o o -" + "|";
            }
            else if (data == 'f' || data == 'F'){
                output = output + "o o - o" + "|";
            }
            else if (data == 'l' || data == 'L'){
                output = output + "o - o o" + "|";
            }
            else if (data == 'p' || data == 'P'){
                output = output + "o - - o" + "|";
            }
            else if (data == 'j' || data == 'J'){
                output = output + "o - - -" + "|";
            }
            else if (data == 'b' || data == 'B'){
                output = output + "- o o o" + "|";
            }
            else if (data == 'x' || data == 'X'){
                output = output + "- o o -" + "|";
            }
            else if (data == 'c' || data == 'C'){
                output = output + "- o - o" + "|";
            }
            else if (data == 'y' || data == 'Y'){
                output = output + "- o - -" + "|";
            }
            else if (data == 'z' || data == 'Z'){
                output = output + "- - o o" + "|";
            }
            else if (data == 'q' || data == 'Q'){
                output = output + "- - o -" + "|";
            }
        }
        
        return output;
    }
    public String MorseToEng(String text){
        String output = "";
        String english = "";
        for (int i = 0; i < text.length(); i++){
            char data = text.charAt(i);
            if (data == 'o' || data == '-'){
                output = output + data + " ";
            }
            else if (data == '|'){
                if (output.equals("o ")){
                    english = english + "e";
                }
                else if (output.equals("- ")){
                    english = english + "t";
                }
                else if (output.equals("o o ")){
                    english = english + "i";
                }
                else if (output.equals("o - ")){
                    english = english + "a";
                }
                else if (output.equals("- o ")){
                    english = english + "n";
                }
                else if (output.equals("- - ")){
                    english = english + "m";
                }
                else if (output.equals("o o o ")){
                    english = english + "s";
                }
                else if (output.equals("o o - ")){
                    english = english + "u";
                }
                else if (output.equals("o - o ")){
                    english = english + "r";
                }
                else if (output.equals("o - - ")){
                    english = english + "w";
                }
                else if (output.equals("- o o ")){
                    english = english + "d";
                }
                else if (output.equals("- o - ")){
                    english = english + "k";
                }
                else if (output.equals("- - o ")){
                    english = english + "g";
                }
                else if (output.equals("- - - ")){
                    english = english + "o";
                }
                else if (output.equals("o o o o ")){
                    english = english + "h";
                }
                else if (output.equals("o o o - ")){
                    english = english + "v";
                }
                else if (output.equals("o o - o ")){
                    english = english + "f";
                }
                else if (output.equals("o - o o ")){
                    english = english + "l";
                }
                else if (output.equals("o - - o ")){
                    english = english + "p";
                }
                else if (output.equals("o - - - ")){
                    english = english + "j";
                }
                else if (output.equals("- o o o ")){
                    english = english + "b";
                }
                else if (output.equals("- o o - ")){
                    english = english + "x";
                }
                else if (output.equals("- o - o ")){
                    english = english + "c";
                }
                else if (output.equals("- o - - ")){
                    english = english + "y";
                }
                else if (output.equals("- - o o ")){
                    english = english + "z";
                }
                else if (output.equals("- - o - ")){
                    english = english + "q";
                }
                output = "";
            }
        }
        return english;
    }
}
