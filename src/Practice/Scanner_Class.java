
package Practice;
import java.util.*;
import java.util.Scanner;

public class Scanner_Class {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);// Create a scanner that would get info from keyboard
        System.out.println("From your keyboard please enter:"); // Will you print message to ask to be entered

        if (scan.hasNextLine()) {    //  判断是否有输入 ； To check if there is any input value from user(keyboard)
            String s1=scan.nextLine();
            System.out.println(s1);


        }
        scan.close();


    }
}

class if_Scanner{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease Enter String");
        if(scan.hasNextLine()){
            String a =scan.nextLine();
            if(a.startsWith("hello")){
                System.out.println("Yes, here it is "+a.indexOf("hello"));


            }
            else if(a.startsWith("Nigmat")){
                System.out.println("here you go "+a.indexOf("Nigmat"));

        }
            else{
                System.out.println("Sorry, nothing here you want found. PLease keep trying");

            }scan.close();
        }
    }
}

class if_Scanner2{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease Enter String");
        if(scan.hasNextLine()){
            String a =scan.nextLine();

            if(a.contains("hello")){
                System.out.println("Yes, here it is "+a.indexOf("hello"));


            }
            else if(a.contains("Nigmat")){
                System.out.println("here you go "+a.indexOf("Nigmat"));

            }
            else{
                System.out.println("Sorry, nothing here you want found. PLease keep trying");

            }scan.close();
        }
    }
}

class if_Scanner3{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("PLease Enter Integer");

        if(scan.hasNextInt()){
           int a =scan.nextInt();

            if(a>=21){
                System.out.println("Your age is  "+a+" and you are able to buy alcohol");


            }
            else {
                System.out.println("Your age is  "+a+" and you have not reached the threshold to buy alcohol");

            }



            }
        if(scan.hasNextLine()){
                String st1 =scan.nextLine();
                System.out.println("Your input:!!!"+st1+"!!! is not valid value, please enter your age(\"Integer\")");
        }scan.close();
    }
}

// homework part Candy vs Gumballs
class homework{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter numbers of coupons");
        int input=s.nextInt();
        if(input>=10){
            System.out.println("Number of Candies: "+input/10+"\nNumber of Gumballs: "+(input%10)/3+"\nThe coupon(s) you have is / are "+((input%10)%3));
        }
        else if(input>=3 && input<10){
            System.out.println("Number of Candies: "+input/10+"\nNumber of Gumballs: "+input/3);
        }

        else{
            System.out.println("Not enough coupons");
        }
    }
}
