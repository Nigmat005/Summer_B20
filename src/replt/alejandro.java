package replt;

import java.util.Locale;
import java.util.Scanner;

public class alejandro {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String a ="alejandrO";
        String s =scan.nextLine().toLowerCase();
        System.out.println(s);


        boolean read=s.contains("alejandro");

        if(read){
            System.out.println("read this mail");
        }else{
            System.out.println("dont read");
        }
//        System.out.println(a.contains("alejandro"));
//        System.out.println(a.equalsIgnoreCase("alejandro"));
    }
}
class second{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        System.out.println(s.contains("HAHA")||s.contains("hi"));


            if( s.equalsIgnoreCase("hi,yes")||s.equalsIgnoreCase("HI,hello")){
                System.out.println("yes");
        }else{
                System.out.println("no");
            }
        }


    }


