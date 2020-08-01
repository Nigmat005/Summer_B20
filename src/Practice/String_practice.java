package Practice;


import org.w3c.dom.ls.LSOutput;
import java.lang.*;
import java.io.*;
import java.util.*;

// String value of()
public class String_practice {
    public static void main(String[] args) {
        int a = 5;
        long l = -35678L;
        float f =46.567F;
        double d = 23.4356;
        String st1=String.valueOf(a);
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(d));
        System.out.println(st1);

        char ch='j';
        System.out.println(String.valueOf(ch));
        char[] ch1={'j','a','v','a'};
        System.out.println(String.valueOf(ch1));

        //Converting subarry of the char array to String
        //valueOf(char[] data,int offset,int length)
        char[] ch2={'h','i','y','w','t'};
        System.out.println(String.valueOf(ch2));
        System.out.println(String.valueOf(ch2,1,3));

        char ch3='J';
        char ch4='h';
        int a1='k';
        System.out.println(ch3+ch4);
        System.out.println(a1);
        String A="hi, i love java";
        System.out.println(A.substring(4));

        String st2="Hi, my name is Nigmat";
        System.out.println(st2.charAt(st2.length()-1));
        System.out.println(st2.length());
        char s1= st2.charAt(4);
        char s2=st2.charAt(5);
        int s3=s1;
        byte s4=(byte)s1;
        System.out.println(s1);
        System.out.println((int) s1);
        System.out.println((byte) s1);
        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s2);
        System.out.println(s1+s2);
        System.out.println(String.valueOf(s1)+String.valueOf(s2));
        System.out.println(s1+""+s2);
        String s5="I like java,java is fun,and java is cool";
        System.out.println(s5.replaceFirst("java","python"));
        System.out.println(s5.replace("java","python"));
        String s6;
        System.out.println(s6=s5.replace(s5.substring(12,16),"python"));
        System.out.println(s5);
        System.out.println(s6);
       String s7="Hel l  o w   o r \t\nld";
        System.out.println(s7.replaceAll("\\s*",""));
        System.out.println(s7.contains("w"));
        System.out.println(s7.toUpperCase().startsWith("H"));

        System.out.println(s7.endsWith("d"));
        System.out.println(s7.charAt(1));
        String txt="foo bar";

        System.out.println(txt.indexOf("b"));
        System.out.println(txt.indexOf("foo"));
        String st8="apple";
        System.out.println(st8.length());
        System.out.println(st8.toLowerCase());
//        System.out.println(st8.charAt(-1));

        System.out.println((st8.charAt(4)+""+st8.charAt(3)+""+st8.charAt(2)+""+st8.charAt(1)+""+st8.charAt(0)));
        System.out.println(Character.toString(st8.charAt(4))+Character.toString(st8.charAt(3))+Character.toString(st8.charAt(2))+Character.toString(st8.charAt(1))+Character.toString(st8.charAt(0)));
        StringBuilder st9=new StringBuilder();
        st9.append(st8);
        System.out.println(st9);
        st9=st9.reverse();
        System.out.println(st9);














    }
}
