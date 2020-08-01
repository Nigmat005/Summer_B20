package Practice;

import java.util.Arrays;

import static java.util.Arrays.sort;

public class Array_Practice {
    public static void main(String[] args) {
        String[] st1={"hi,how are you"};
        System.out.println(st1[0]);
        String[] st2={"hi,how are you", "what is your name"};
        System.out.println(st2[1]);
        String[] st3={"hi,how are you", "what is your name","fuck","you",};
       Arrays.sort(st3);
        System.out.println(st3);
        String st4=Arrays.toString(st3);
        System.out.println(Arrays.toString(st1));
        System.out.println(Arrays.toString(st2));
        System.out.println(st4);
        System.out.println(st4.length());
        System.out.println(st4.charAt(0));
        char[] ch={'h','o'};
        System.out.println(ch[1]);
        System.out.println(ch);
        String st5="hello";
        System.out.println(st5);


    }
}
