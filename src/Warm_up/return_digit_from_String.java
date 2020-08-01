package Warm_up;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class return_digit_from_String {
    public static void main(String[] args) {
        String given="a4b2c3";
        int sum=0;
       for(int i=0;i<given.length();i++){
           if(given.charAt(i)>48&&given.charAt(i)<57){
              sum+=Integer.parseInt(given.charAt(i)+"");

           }

       }
        System.out.println(sum);
    }
}


class return_digit_from_String2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your String That Contains Digits ");
        String input=scan.nextLine();
        scan.close();
          int sum=0;
        for( char each:input.toCharArray()){
           if(Character.isDigit(each)){
               sum+=Integer.parseInt(Character.toString(each));
//               sum+=Integer.valueOf(Character.toString(each));
//               sum+=Integer.parseInt(each+"");
           }
        }
        System.out.println(sum);
    }

}