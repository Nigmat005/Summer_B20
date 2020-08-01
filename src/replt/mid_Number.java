package replt;
import java.util.*;
public class mid_Number {
    public static void main(String[] args) {
            //WRITE YOUR CODE HERE
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number:");
        int num1=scan.nextInt();
        System.out.println("enter second number:");
        int num2=scan.nextInt();
        System.out.println("enter third number:");
        int num3=scan.nextInt();
        boolean midnum1=(num1>num2&&num1<num3)||(num1>num3&&num1<num2);
        boolean  midnum2=(num2>num1&&num2<num3)||(num2>num3&&num2<num1);
        if(midnum1){
            System.out.println("Medium number is "+num1);
        }else if(midnum2){
            System.out.println(("Medium number is ").replace("number","value")+num2);
        }else{
            System.out.println("Medium number is "+num3);
        }
            }
        }


