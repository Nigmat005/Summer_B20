package Practice;


    import java.util.*;
import java.util.Scanner;

    public class Vending_machine{
        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter price in cents:");

               int quarters=0;
               int dimes=0;
               int nickles=0;
               int itemPrice=scanner.nextInt();
            if(itemPrice>=25&&itemPrice<=100){
                if(itemPrice%5==0){
                    quarters=(100-itemPrice)/25;
                    dimes=((100-itemPrice)%25)/10;
                     nickles=(((100-itemPrice)%25)%10)/5;
                    System.out.println("Your change is "+quarters+" quarters "+", " +dimes+" dimes"+" ," +" and "+nickles+" nickles.");
                }
                else {
                    System.out.println("Invalid price!");
                }

            }
            else{
                System.out.println("Invalid price!");
            }






        }
    }
class second{

        public static void main(String[] args) {
            //ENTER CODE HERE
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter price in cents:");

            int quarters=0;
            int dimes=0;
            int nickels=0;
            int itemPrice=scanner.nextInt();
            if(itemPrice>=25&&itemPrice<=100){
                if (itemPrice%5!=0){
                    System.out.println("Invalid price!");
//                    quarters=(100-itemPrice)/25;
//                    dimes=((100-itemPrice)%25)/10;
//                    nickles=((100-itemPrice)%25)%10;
//                    System.out.println("Your change is "+quarters+" quarters "+", " +dimes+" dimes"+" ," +" and "+nickles+" nickles.");
                }
                else {
                    quarters=(100-itemPrice)/25;
                    dimes=((100-itemPrice)%25)/10;
                    nickels=((100-itemPrice)%25)%10/5;
                    System.out.println("Your change is "+quarters+" quarters "+", " +dimes+" dimes"+" ," +" and "+nickels+" nickels.");

                }

            }
            else{
                System.out.println("Invalid price!");
            }






        }
}
