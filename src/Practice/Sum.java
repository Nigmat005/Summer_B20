package Practice;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Sum {
    public static void main(String[] args) {
        int sum=sum(15,18);
        System.out.println(sum);
    }
}


class Add_numbers {
    public static void main(String[] args) {
        //WRITE YOUR CODE HERE:
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
//        int sum=( num1+num2+num3);
       int result=Sum(num1,num2,num3);
        System.out.println("Sum of numbers: "+result);

    }
    static int Sum(int num1,int num2,int num3){

        return (num1+num2+num3);
    }







}
