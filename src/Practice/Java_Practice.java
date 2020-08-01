package Practice;

import org.w3c.dom.ls.LSOutput;

import javax.lang.model.util.AbstractElementVisitor14;
import javax.swing.*;
import java.util.ArrayList;

// Practice for triangle
public class Java_Practice {
    public static void main(String[] args) {
        int m =8;
        int i,j;
        for(i=1;i<=m;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
             }
            System.out.print("\n");
        }


    }
}
// while loop using static and no need to create object just use method(Mtd) to call the code part.
class P2{
    static void Mtd(int n){
        n=1;
        while(n<30){
            System.out.println(n);
            n++;


        }

    }

    public static void main(String[] args) {
        Mtd(29);
    }
}

// same as above but use break statement:

class P3 {


    static void Mtd1(int n) {
        //n = 1;
        while (n < 30) {
            System.out.println(n);
            n++;
            if(n==15){
                break;
            }



        }

    }

    public static void main(String[] args) {
        Mtd1(1);
    }



}

// for loop using break
class P4{
    public static void main(String[] args) {
        String[] a= {"apple","banana","grape","orange","peach"};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}


// Using foreach loop
class P5{
    public static void main(String[] args) {
        String[] a= {"apple","banana","grape","orange","peach"};
        for(String fruit:a){
            System.out.println(fruit);
        }
    }
}
// combo of foreach and continue
class P6{
    public static void main(String[] args) {
        String[] a= {"apple","banana","grape","orange","peach"};
        for(String fruit:a){
            if(fruit=="grape"){
                continue;
            }
            System.out.println(fruit);
        }
    }
}

class p7{
    public static void main(String[] args) {
        int [] a={1,2,3,4,5,6,7,8,9,10};
        for(int i=1;i<=a.length;i++){
            if(i%2==0)
                System.out.println(i + " is even number");
            else
                System.out.println(i + " is odd number");
        }

        }
    }

/*class p8{
    public static void main(String[] args) {
        int [] a={14,26,38,476,586585,656757,7474,800,979,100000};
        for(int i=a[0];i<a.length;i=a[i+1]) {
            if (i % 2 == 0)
                System.out.println(i + " is even number");
            else
                System.out.println(i + " is odd number");
        }
    }
}*/


class p9{
    public static void main(String[] args) {
        int [] a={11,26,38,476,586585,656757,7474,800,979,100000};
        for(int i=0;i<a.length;i++)
            if(a[i]%2==0){
                System.out.println(a[i]+" is even number");
            }else
                System.out.println(a[i]+" is odd number");



    }

    // boolean test
    static class p10{
        public static void main(String[] args) {
            int age=18;
            String citizenship1 ="USA";
            String citizenship2 = "France";
            boolean eligible_to_vote =age>=18 && citizenship1=="USA"||citizenship2=="Spain";
            System.out.println("Eligibility of voting is: "+eligible_to_vote);

            int a=5;
            boolean res= a++==5 || a--==5;
            //              a=5        a=6
            System.out.println(res);
        }





}

// boolean test2
static class p11{
    public static void main(String[] args) {
        int D_L=15;
        int D_W=5;
        String fked="Of Course";
        boolean you_are_man= D_L>=13 && D_W>=4 && fked=="Of Course";
        System.out.println(you_are_man);
    }

}

// two booleans compared
static class p12 {
    public static void main(String[] args) {
        int D_L = 15;
        int D_W = 5;
        String fked = "Of Course";
        boolean you_are_man = D_L >= 13 && D_W >= 4;
        boolean had_chicks= fked=="Of Course";
        boolean o_yeah=you_are_man||had_chicks;
        System.out.println(o_yeah);
    }
}

// If statement practice
static class p13{
    public static void main(String[] args) {
        String str1="Hot";
        String str2="Cold";
        if(str1=="Hot"){
            System.out.println("Suncreen");
        }
        else{
            System.out.println("put more");
        }
    }

}
}

// if Statement alcohol
