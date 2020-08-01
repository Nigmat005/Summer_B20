package replt;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_Split_sentence {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String sentence = input.nextLine();

            //type your code below
            for(String each: sentence.split(" ")){
                System.out.println(each);
            }

            String A="hi how are you";
            String [] B=A.split(" ");
            System.out.println(Arrays.toString(B));
            A.startsWith("error");
        }
    }

