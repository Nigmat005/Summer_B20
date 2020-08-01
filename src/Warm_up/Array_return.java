package Warm_up;

import java.util.Arrays;
import java.util.Scanner;

public class Array_return {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter the Length of Array");
        int Array_length=scan.nextInt();
        String[] string_Array=new String[Array_length];
//        System.out.println("Please Enter Element");
//        String st1=scan.nextLine();
        if(scan.hasNext()){
             for(int i=0;i<Array_length;i++){

                 String st1=scan.next();
                 string_Array[i]=st1;
                 System.out.println(string_Array[i]);
        }

         }




//            System.out.println("Please Enter Element");





        System.out.println(Arrays.toString(string_Array));
    }
}


 class Array_return_test_nextLine {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.println("Please Enter the Length of Array");
         int Array_length = scan.nextInt();
         scan.nextLine();// Give this one or scanner will skip your one nextLine method
         String[] string_Array = new String[Array_length];
//        System.out.println("Please Enter Element");
//        String st1=scan.nextLine();

         for (int i = 0; i < Array_length; i++) {
             String st1 = scan.nextLine();
             string_Array[i] = st1;
             System.out.println(string_Array[i]);
         }
         System.out.println(Arrays.toString(string_Array));

         int Longest = 0;
         for (int i = 0; i < string_Array.length; i++) {
             Longest = string_Array[0].length();
             if (string_Array[i].length() >= Longest) {
                 Longest = string_Array[i].length();

             }


         }
         System.out.println(Longest);
//         for (int i = 0; i < Array_length; i++) {
//             if (string_Array[i].length() == Longest) {
//                 System.out.println(string_Array[i]);
//             }
//         }
       for(String each:string_Array){
           if(each.length()==Longest);{
               System.out.println(each);
           }

       }

         }



 }






//            System.out.println("Please Enter Element");







