package Practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Max_and_Min { // Always remember the most max number in java is 999999999 and the most min-999999999
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        System.out.println(Max_num);
        int MAX=-999999999;// when you try to find the the most max-number you need to put the least number
        // cuz any user input would be greater than the least number (int min=-999999999)
        int MIN=999999999;// when you try to find the the min number you need to put the max number
        // cuz any user input would be less than the max number (int min=999999999)
        for(int i=1;i<=5;i++){
            int num=input.nextInt();
            if(num>MAX){
                MAX=num;
            }
            if(num<MIN){
                MIN=num;
            }

        }
        System.out.println("The max number is: "+MAX);
        System.out.println("The min number is: "+MIN);
    }
}
