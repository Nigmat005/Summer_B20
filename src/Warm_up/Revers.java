package Warm_up;

import java.util.Scanner;

public class Revers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter String:");
       if(scan.hasNextLine()){
            String st=scan.nextLine();
            System.out.println(st);
//           String result="";
            for(int i=st.length()-1;i>=0;i--){
//                System.out.print(st.charAt(i));
                String result="";
                result+=st.charAt(i);

                System.out.print(result);
            }

//           System.out.println(result);
      }
    }}

class revers2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter String:");
//        if(scan.hasNextLine()){
        String st=scan.nextLine();
        StringBuilder stb=new StringBuilder();
        stb=stb.append(st);
        System.out.println(stb);
        stb=stb.reverse();
        System.out.println(stb);

        }}