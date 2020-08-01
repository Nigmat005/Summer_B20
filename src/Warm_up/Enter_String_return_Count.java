package Warm_up;

import java.util.Scanner;

public class Enter_String_return_Count {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st1=input.nextLine();
      char st2=input.next().charAt(0);// very important
        System.out.println("Input "+st1);
        System.out.println("Input "+st2);
        int count=0;
//        String string="";
        for(int i=0;i<= st1.length()-1;i++){
            char each= st1.charAt(i);//aabcd
//            string=""+each;

            if(st2==(each)){//a,a,b,c,d
                count+=1;
            }else{
                count=count;
            }
        }
        System.out.println(count);
    }
}

 class Enter_String_return_Count1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String st1=input.nextLine();
        String st2=input.next();
        System.out.println("Input "+st1);
        System.out.println("Input "+st2);
        int count=0;
        String string="";
        for(int i=0;i<= st1.length()-1;i++){
            char each= st1.charAt(i);//aabcd
            string=""+each;

            if(st2.equals(string)){//a,a,b,c,d
                count+=1;
            }else{
                count=count;
            }
        }
        System.out.println(count);
    }
}