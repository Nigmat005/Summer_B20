package replt;
import java.util.Scanner;
public class Revers {
    public static void main(String[] args) {
        String st8="apple";
        System.out.println(st8.length());
        System.out.println(st8.length()-1);
        System.out.println(st8.charAt(st8.length()-1));
        System.out.println(st8.charAt(st8.length()-2));
        System.out.println(st8.charAt(3));
        System.out.println(st8.charAt(3)+st8.charAt(4));
        System.out.println(st8.charAt(3)+""+st8.charAt(4)+st8.charAt(1));
        System.out.println(Character.toString(st8.charAt(3))+Character.toString(st8.charAt(4)));

            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
            if(word.length()==5){
                System.out.println(word.charAt(word.length()-1)+""+word.charAt(word.length()-2)+word.charAt(2)+word.charAt(1)+word.charAt(0));
            }else if(word.length()>5){
                System.out.println("Too long!");

            }else{
                System.out.println("Too short!");
            }

        }
    }
