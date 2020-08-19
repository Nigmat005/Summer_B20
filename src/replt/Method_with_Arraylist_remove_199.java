package replt;
import java.util.ArrayList;
 import java.util.Arrays;
public class Method_with_Arraylist_remove_199 {

        //create your method below
        public static void removeAll(ArrayList<String> wordList, String targetWord){
            wordList.removeIf(p-> p.equals(targetWord));
            System.out.println(wordList);
        }



        public static void main(String[]args){
             ArrayList<String> list=new ArrayList<>(Arrays.asList("hi","hey","hi","yo"));
             String targetWord="hi";
             removeAll(list,targetWord);
        }
    }


