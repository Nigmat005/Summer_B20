package Practice;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Your Numbers And Operator");
        int input1=scan.nextInt();
        char input2=scan.next().charAt(0);
        int input3=scan.nextInt();
        boolean Go=input2=='+'||input2=='-'||input2=='*'||input2=='/'||input2=='%';
        if(input2=='+'||input2=='-'||input2=='*'||input2=='/'||input2=='%'){
            switch(input2){
                case'+':
                    System.out.println(input1+input3);
                    break;
                case'-':
                    System.out.println(input1-input3);
                    break;
                case'*':
                    System.out.println(input1*input3);
                    break;
                case'/':
                    System.out.println(input1/input3);
                    break;
                default:
                    System.out.println(input1%input3);

            }
        }else{
            System.out.println("Cannot help");
        }



    }
}
