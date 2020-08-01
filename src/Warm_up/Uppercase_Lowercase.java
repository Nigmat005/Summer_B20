package Warm_up;

import javax.swing.plaf.SeparatorUI;
import java.util.Scanner;
//
//public class Uppercase_Lowercase {
//    public static void main(String[] args) {
//        Scanner input= new Scanner(System.in);
//        String st=input.next();
//        char A=st.charAt(0);
//        char B=st.charAt(st.length()-1);
//        Boolean uppercase= A>=65 && A<=90;
//        Boolean lowercase= B>=97 && B<=122;
//        if(uppercase && lowercase){
//            System.out.println("True");
//        }else{
//            System.out.println("False");
//        }
//
//    }
//}

public class Uppercase_Lowercase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String st=input.next();
        char A=st.charAt(0);
        char B=st.charAt(st.length()-1);
        Boolean uppercase= A>='A'&& A<='Z';
        Boolean lowercase= B>='a' && B<='z';
        if(uppercase && lowercase){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
