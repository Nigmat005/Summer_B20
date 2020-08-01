package Warm_up;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Room_reservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Do you need to make a reservation?");
//        boolean make_reservation=scan.nextBoolean();
        int Price = 0;
        while(true){
            System.out.println("Please Select Room Type");
            System.out.println("1: King Bed 120$");
            System.out.println("2: Queen Bed 100$");
            System.out.println("3: Single Bed 80$");
            int Selection = scan.nextInt();

            switch (Selection) {
                case 1:
                    System.out.println("Your selection is King Bed Room");
                    Price += 120;
                    break;
                case 2:
                    System.out.println("Your selection is Queen Bed Room");
                    Price += 100;
                    break;
                case 3:
                    System.out.println("Your selection is Single Bed Room");
                    Price += 80;
                    break;
                default:
                    System.out.println("Your selection is Invalid, please Try again!");
                    System.exit(0);


            }     System.out.println("Your price is: "+Price);

                 System.out.println("Do you want to make other reservation?");
//                 String other=scan.nextLine();
                   String other=scan.next();
                  while(!(other.equalsIgnoreCase("yes") || other.equalsIgnoreCase("no"))){
                      System.out.println("Please Re-enter");
                      System.out.println("Do you want to make other reservation?");
                      other=scan.next();

                  }
                  if(other.equalsIgnoreCase("no")){
                  System.out.println("Reservation completed");
                  System.out.println("Your total price is: "+Price+"$");
                    break;
                }
//                  if(other.equalsIgnoreCase("yes")){
//                continue;
//            }


        }
//        while(!true){
//            System.out.println("Hope you have a great day");
//            break;
//        }


    }
}


 class CybertekInn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Cybertek Inn");

        while(true) {

            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $100");
            System.out.println("3. Single Bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

                default:
                    System.out.println("Get Out");
                    System.exit(0);
            }

            System.out.println("do you want to reserve another room?");
            String a = scan.next();

            while(  !((a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no")) ) ){ // while the answer is invalid
                System.out.println("Invalid, Please re-enter");
                System.out.println("do you want to reserve another room?");
                a=scan.next();
            }

            if(a.equals("no")){
                break;
            }

        }

        System.out.println("Your total price is: $"+total);


    }

}

class test{
    public static void main(String[] args) {
        Scanner test=new Scanner(System.in);

        int n=1;
        while(n>0){
            System.out.println("Please first enter");
            String a =test.nextLine();
            System.out.println("Please s enter");
            String b=test.nextLine();
            while(!(b.equalsIgnoreCase("Yes")||b.equalsIgnoreCase("No"))){
                System.out.println("Please s enter");
                System.out.println("What the fuck you doin?");
                 b=test.nextLine();

            }
            if(b.equalsIgnoreCase("no")){
                break;
            }

        }
    }
}