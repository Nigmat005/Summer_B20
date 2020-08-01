package Practice;
import java.util.*;

//    Switch statement never take long doulbe float and boolean
public class Switch {
    public static void main(String[] args) {
        int age=18;
        switch(age){
            case 16:
                System.out.println("Might to young");
                break;
            case 18:
                System.out.println("you just fit");
                break;
            case 20:
                System.out.println("watery");
            case 30:
                System.out.println("wow");
            default:
                System.out.println("Cann't you find anyone?");



        }


    }
}

class  a {
    public static void main(String[] args) {
        // DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        //WRITE YOUR CODE HERE
        //String st="";
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wensday");
                break;
            case 4:
                System.out.println("Thurday");
                break;
            case 5: System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
        }




    }
}


class Vehicle_recall{
    public static void main(String[] args) {
        // DO NOT CHANGE:
        Scanner input = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = input.nextInt();

        //WRITE YOUR CODE HERE:
        String st="Your vehicle needs to be recalled!";
        switch(vehicleYear){
            case 1995:
            case 1996:
            case 1997:
            case 1998:
                st=st;
                break;
            case 2001:
            case 2002:
                st=st;
                break;
            case 2004:
            case 2005:
            case 2006:
                st=st;
                break;
            case 2015:
            case 2016:
            case 2017:
                st=st;
                break;

            default:
                st="Your vehicle is fine, enjoy!";



        }
        System.out.println(st);




    }
}
