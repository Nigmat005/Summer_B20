package replt;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tip_calculator {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double Total_per_person=0;
        double Total_tip=0;
        double Tip_per_person=0;

        System.out.println("Split or No split");
        String Split=scan.next();
        System.out.println("Number of people:");
        int Num_people=scan.nextInt();
        System.out.println("Check amount:");
       double Amount=scan.nextDouble();
        System.out.println("Service Quality:");
        String Service_quality=scan.next();


        switch (Service_quality.toLowerCase()){
            case "poor":
                Total_tip=Amount*0.05;
                break;
            case "fair":
                Total_tip=Amount*0.1;
                break;
            case "good":
                Total_tip=Amount*0.15;
                break;
            case "great":
                Total_tip=Amount*0.20;
                break;
            case "excellent":
                Total_tip=Amount*0.25;
                break;
            default:
                System.out.println("I need your valid feedback!");

        }
        if(Split.equalsIgnoreCase("yes")){
            Total_per_person=Amount/Num_people;
            Tip_per_person=Total_tip/Num_people;
        }else if(Split.equalsIgnoreCase("no")){

        }
        else{
            System.out.println("Not invalid!");
        }
        System.out.println("Number of people entered: "+Num_people);
        System.out.println("Total to pay: "+Amount);
        System.out.println("Total tip: "+Total_tip);
        System.out.println("Total per person: "+Total_per_person);
        System.out.println("Tip per person: "+Tip_per_person);
    }
}


class Second{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        double Total_per_person=0;
        double Total_tip=0;
        double Tip_per_person=0;

        System.out.println("Split or No split");
        String Split=scan.next();

        if(Split.equalsIgnoreCase("yes")){
            System.out.println("Number of people:");

           int Num_people=scan.nextInt();

            System.out.println("Check amount:");

            double Amount=scan.nextDouble();

            System.out.println("Service Quality:");

            String Service_quality=scan.next();



            switch (Service_quality.toLowerCase()){
                case "poor":
                    Total_tip=Amount*0.05;
                    break;
                case "fair":
                    Total_tip=Amount*0.1;
                    break;
                case "good":
                    Total_tip=Amount*0.15;
                    break;
                case "great":
                    Total_tip=Amount*0.20;
                    break;
                case "excellent":
                    Total_tip=Amount*0.25;
                    break;
                default:
                    System.out.println("I need your valid feedback!");

            }
            Total_per_person=(Amount+Total_tip)/Num_people;
            Tip_per_person=Total_tip/Num_people;

            String Sum_people="";

            for(int i=1;i<=Num_people;i++){

                Sum_people+="&";
                System.out.println(Sum_people);
            }
            System.out.println("Number of people entered: "+Sum_people);
            System.out.println("Total to pay: "+(Amount+Total_tip));
            System.out.println("Total tip: "+Total_tip);
            System.out.println("Total per person: "+Total_per_person);
            System.out.println("Tip per person: "+Tip_per_person);
        }

        else if(Split.equalsIgnoreCase("no")){
            System.out.println("Number of people:");

            int Num_people=scan.nextInt();

            System.out.println("Check amount:");

            double Amount=scan.nextDouble();

            System.out.println("Service Quality:");

            String Service_quality=scan.next();

            switch (Service_quality.toLowerCase()){
                case "poor":
                    Total_tip=Amount*0.05;
                    break;
                case "fair":
                    Total_tip=Amount*0.1;
                    break;
                case "good":
                    Total_tip=Amount*0.15;
                    break;
                case "great":
                    Total_tip=Amount*0.20;
                    break;
                case "excellent":
                    Total_tip=Amount*0.25;
                    break;
                default:
                    System.out.println("I need your valid feedback!");

            }

            String Sum_people="";

            for(int i=1;i<=Num_people;i++){

                Sum_people+="&";
                System.out.println(Sum_people);
            }
            System.out.println("Number of people entered: "+Sum_people);
            System.out.println("Total to pay: "+(Amount+Total_tip));
            System.out.println("Total tip: "+Total_tip);
            System.out.println("Total per person: "+Total_per_person);
            System.out.println("Tip per person: "+Tip_per_person);

        }
        else{
            System.out.println("Not invalid!");
            System.exit(0);
        }


    }
}
