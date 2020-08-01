package Warm_up;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Remove_duplicate_and_count {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter string ");
        String st1=input.nextLine();
        System.out.println(st1);
        String st2="";
        String result="";
        for(int i=0;i<=st1.length()-1;i++){
//            System.out.println(st1.charAt(i)+"");
//            if(result.contains(st1.charAt(i)+"")){
//
//            }
            st2=Character.toString(st1.charAt(i));
//            st2=String.valueOf(st1.charAt(i));
            if(!result.contains(st2)){
               result+=st2;
//                System.out.println(result);
            }

        }
        System.out.println(result);

    }
}


class  Remove_duplicate_and_count1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter: ");
        String st1 = input.nextLine();
        String result = "";
//       String each="";
        char each=' ';


        for (int i = 0; i <= st1.length() - 1; i++) {
            if (!result.contains(st1.charAt(i)+"")){
                result+=st1.charAt(i);
            }

        }System.out.println(result);

        for(int i=0;i<= result.length()-1;i++){
            int count=0;
            each=result.charAt(i);
//            System.out.print(each);
           for(int j=0; j<=st1.length() - 1;j++){
               if(each==st1.charAt(j)){
                   count+=1;
               }
           }
            System.out.print(each+""+count);

        }



    }
}