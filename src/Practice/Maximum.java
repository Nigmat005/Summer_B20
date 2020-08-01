package Practice;
import org.w3c.dom.ls.LSOutput;

import static java.lang.Integer.sum;
import static jdk.internal.org.objectweb.asm.Type.getType;

import java.util.Scanner;

import static java.lang.Math.cbrt;
import static java.lang.Math.max;


public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter any number not same three times one by one");
        int A = 0;
        if (input.hasNextInt()) {
            A = input.nextInt();
        }
        int B = 0;
        if (input.hasNextInt()) {
            B = input.nextInt();
        }
         int C=0;
        if (input.hasNextInt()) {
             C = input.nextInt();
        }
        int D=0;
        if (input.hasNextInt()) {
             D = input.nextInt();
        }input.close();


        System.out.println(Math.max(A,B));
        System.out.println(Math.max(C,D));
        int a=Math.max(A,B);
        int b=Math.max(C,D);
        System.out.println("Finally the maximum number in 4 batches is: "+Math.max(a,b));


    }


}

class identify_type{
    public static void main(String[] args) {
        Scanner Type=new Scanner(System.in);
        System.out.println("Please enter String or int");
        if(Type.hasNext()){
            String st=Type.next();
            System.out.println(st+" is string"+getType(st));
        }
        if(Type.hasNextInt()){
            int number =Type.nextInt();
            System.out.println(number+" is int");

    }
        Type.close();

        int num=9;
        if (num++ == 10) {
            System.out.println("SFDS"+num);

        } else
        {
            System.out.println("Tytyt"+num);

        }
}
}
