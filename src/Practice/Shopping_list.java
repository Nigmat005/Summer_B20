package Practice;


import java.util.Scanner;

public class Shopping_list {
 public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Item1,count and its price:");
    String item1=scan.next();
     int count1=scan.nextInt();
     double price1=scan.nextDouble();
     System.out.println("Enter Item2,count and its price:");
     String item2=scan.next();
     int count2=scan.nextInt();
    double price2=scan.nextDouble();
     System.out.println("Enter Item3,count and its price:");
    String item3=scan.next();
     int count3=scan.nextInt();
     double price3=scan.nextDouble();
     if(count2==0){
         String report=("Item1: "+item1+" price: "+count1*price1+", "+"Item3: "+item3+" price: "+count3*price3);
         Double totalprice=(count1*price1)+(count3*price3);
         System.out.println(report);
         System.out.println("Total price: "+totalprice);


     }
     else if(count3==0){
         String report=("Item1: "+item1+" price: "+count1*price1+", "+"Item2: "+item2+" price: "+count2*price2);
         Double totalprice=(count1*price1)+(count2*price2);
         System.out.println(report);
         System.out.println("Total price: "+totalprice);
     }
     else{
         String report=("Item1: "+item1+" price: "+count1*price1+", "+"Item2: "+item2+" price: "+count2*price2+"Item3: "+item3+" price: "+count3*price3);
         Double totalprice=(count1*price1)+(count2*price2)+(count3*price3);
         System.out.println(report);
         System.out.println("Total price: "+totalprice);
     }

    }

}

