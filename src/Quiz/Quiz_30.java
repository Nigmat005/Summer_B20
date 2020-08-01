package Quiz;

import java.util.Scanner;

public class Quiz_30 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int one1=scan.nextInt();
        int two1=scan.nextInt();
        if(one1-- > two1*2){
            System.out.println("one");
            System.out.println(one1);
        } else
        {
            System.out.println(two1);
        }







        int num=-5;
        System.out.println(num++ + ",");
        System.out.println(num=0);
        System.out.println(","+--num);
        short s=13-9/3*10;
        s+=-10;
        System.out.println(s);
        boolean one=('a'!='z') && false;
        boolean two=one|| 0==(9-10+1);
        System.out.println(two);
        long l=100;
        short s1=(short)l;
        System.out.println(s1+10);
        int A=10;
        A=--A+A++ +A-- +A++;
        System.out.println(A);
        short s2=13+3*(10-6)%2;
        boolean b2=s !=25;
        System.out.println(b2);
        byte b=104;
        boolean check =b<100;
        if(check){
            b-=100;

        }else{
            b=50;
        }
        System.out.println(b);
        double pi=3.14;
        boolean b3=119%5==0;
        System.out.println(b3);
        System.out.println(!b3);
        int num1=0;
        if(pi>3.14&&!b3){
            num1+=50;
        }else{
            num-=50;
        }
        if(b3){
            num+=50;
        }
        System.out.println(num1);

        int Check =132;
        String str="";
        if(Check%2==0){
            str+=Check;
            if(Check%5==0){
                str+="132";

            }else{
                str="500";
            }

    }else{
            str+="132";
        }
        System.out.println(str);
        int num3=2;
        boolean B=true;
        switch(num3){
            case 0:
                B=false;
            case 1:
                System.out.println(1);

            case 2:
                if(B){
                    System.out.println(2);
                }else{
                    B=false;
                }

            case 3:
                if(B){
                    System.out.println(3);
                    B=false;
                }else{
                    break;
                }
            case 4:
                System.out.println(4);
            case 5:
                if (!B){
                    break;
                } System.out.println(5);

        }}


}
