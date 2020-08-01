

package replt;

import java.util.Scanner;

public class Real_estate_calculator {
    public static void main(String[] args) {

        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms, garageSpots;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType;
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        System.out.println("Enter your property type:");
        String Property = scan.nextLine();
        if (Property.equalsIgnoreCase("Condo")) {
            propertyPrice = 50000;
                                              System.out.println(propertyPrice);
            System.out.println("How many bedrooms do you have?");
            numberOfBedrooms = scan.nextInt();
            propertyPrice += (30000 * numberOfBedrooms);
                                               System.out.println(propertyPrice);
            System.out.println("Do you have a backyard?");
            backyard = scan.nextBoolean();
            if (backyard ==true) {
                System.out.println("Backyard is not available for condo!");
                propertyPrice = propertyPrice;
            }
                System.out.println("Do you have garage?");
                garage = scan.nextBoolean();
                if (garage ==true) {
                    System.out.println("How many spots?");
                   garageSpots = scan.nextInt();
                    if (garageSpots < 10) {
                        propertyPrice += garageSpots * 20000;
                                                 System.out.println(propertyPrice);
                    } else {
                        System.out.println(" Pardon,  it's not a public parking!");
                        propertyPrice = propertyPrice;
                    }
                }

                    System.out.println("How close is metro station?");
                    metroAccessibility = scan.nextFloat();
                    if(metroAccessibility <= 1){
                        propertyPrice+=10000;
                                                  System.out.println(propertyPrice);
                    }

                    else if(metroAccessibility > 1 && metroAccessibility <=3) {
                        propertyPrice += 5000;
                   }

                     else {
                        propertyPrice = propertyPrice;
                    }
                    System.out.println("How close is highway?");
                    highwayAccessibility = scan.nextFloat();
                    if(highwayAccessibility<=1){
                        propertyPrice+=15000;
                                                      System.out.println(propertyPrice);
                    }
                    else if(highwayAccessibility > 1 && highwayAccessibility <= 5) {
                        propertyPrice += 8000;
                                                          System.out.println(propertyPrice);
                    } else if(highwayAccessibility > 5 && highwayAccessibility <= 20) {
                        propertyPrice += 4000;
                    }
                    System.out.println("What's the rating of nearest school?");
                    schoolScore = scan.nextFloat();
                    if (schoolScore >= 8 && schoolScore <= 10) {
                        propertyPrice += 45000;
                                                       System.out.println(propertyPrice);
                    }
                    else if (schoolScore >= 4 && schoolScore < 8) {
                        propertyPrice += 20000;
                    } else {
                        propertyPrice += 5000;
                    }
                    System.out.println("Does any of your family members smoking?");
                                                    System.out.println(propertyPrice);
                    smoking = scan.nextBoolean();
                    if (smoking == true) {
                        propertyPrice -= 5000;
                    }                               System.out.println(propertyPrice);
               }

             else if (Property.equalsIgnoreCase("Townhouse")) {
                propertyPrice = 75000;
            System.out.println(propertyPrice);
               System.out.println("How many bedrooms do you have?");
               numberOfBedrooms = scan.nextInt();
               propertyPrice += 30000 * numberOfBedrooms;
               System.out.println("Do you have a backyard?");
               backyard = scan.nextBoolean();
               if (backyard ==true) {

                   propertyPrice+=5000;
               }
               System.out.println("Do you have garage?");
               garage = scan.nextBoolean();
               if (garage ==true) {
                   System.out.println("How many spots?");
                   garageSpots = scan.nextInt();
                   if (garageSpots < 10) {
                       propertyPrice += garageSpots * 20000;
                   } else {
                       System.out.println(" Pardon,  it's not a public parking!");
                       propertyPrice = propertyPrice;
                   }
               }
               System.out.println("How close is metro station?");
               metroAccessibility = scan.nextFloat();
            if(metroAccessibility <= 1){
                propertyPrice+=10000;
            }
            else if(metroAccessibility > 1 && metroAccessibility <= 3) {
                propertyPrice += 5000;
            }

            else {
                propertyPrice = propertyPrice;
            }
               System.out.println("How close is highway?");
               highwayAccessibility = scan.nextFloat();
            if(highwayAccessibility<=1){
                propertyPrice+=15000;
            }
            else if(highwayAccessibility > 1 && highwayAccessibility <= 5) {
                propertyPrice += 8000;
            } else if(highwayAccessibility > 5 && highwayAccessibility <= 20) {
                propertyPrice += 4000;
            }
               System.out.println("What's the rating of nearest school?");
               schoolScore = scan.nextFloat();
               if (schoolScore >= 8 && schoolScore <= 10) {
                   propertyPrice += 45000;
               }
               else if (schoolScore >= 4 && schoolScore < 8) {
                   propertyPrice += 20000;
               } else {
                   propertyPrice += 5000;
               }
               System.out.println("Does any of your family members smoking?");
               smoking = scan.nextBoolean();
               if (smoking == true) {
                   propertyPrice -= 5000;
               }



           }
           else if (Property.equalsIgnoreCase("Single Family Home")) {
                propertyPrice = 95000;
               System.out.println("How many bedrooms do you have?");
               numberOfBedrooms = scan.nextInt();
               propertyPrice += 30000 * numberOfBedrooms;
               System.out.println("Do you have a backyard?");
               backyard = scan.nextBoolean();
               if (backyard ==true) {

                   propertyPrice+=5000;
               }
               System.out.println("Do you have garage?");
               garage = scan.nextBoolean();
               if (garage ==true) {
                   System.out.println("How many spots?");
                   garageSpots = scan.nextInt();
                   if (garageSpots < 10) {
                       propertyPrice += (garageSpots * 20000);
                   } else {
                       System.out.println(" Pardon,  it's not a public parking!");
                       propertyPrice = propertyPrice;
//                       System.out.println(propertyPrice);
                   }
               }
               System.out.println("How close is metro station?");
               metroAccessibility = scan.nextFloat();
            if(metroAccessibility <= 1){
                propertyPrice+=10000;
            }
            else if(metroAccessibility > 1 && metroAccessibility <= 3) {
                propertyPrice += 5000;
            }

            else {
                propertyPrice = propertyPrice;
            }
            System.out.println("How close is highway?");
            highwayAccessibility = scan.nextFloat();
            if(highwayAccessibility<=1){
                propertyPrice+=15000;
            }
            else if(highwayAccessibility > 1 && highwayAccessibility <= 5) {
                propertyPrice += 8000;
            } else if(highwayAccessibility > 5 && highwayAccessibility <= 20) {
                propertyPrice += 4000;
            }
            System.out.println("What's the rating of nearest school?");
            schoolScore = scan.nextFloat();
            if (schoolScore >= 8 && schoolScore <= 10) {
                propertyPrice += 45000;
            }
            else if  (schoolScore >= 4 && schoolScore < 8) {
                propertyPrice += 20000;
            } else {
                propertyPrice += 5000;
            }
            System.out.println("Does any of your family members smoking?");
               smoking = scan.nextBoolean();
               if (smoking == true) {
                   propertyPrice -= 5000;
               }
            } else {
                System.out.println("Invalid");
            }
        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+propertyPrice+"$");



        }


    }

class Adad{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int price=243000;
        boolean boo=scan.nextBoolean();
        if(boo==true){
            System.out.println(boo);
            price-=5000;
            System.out.println(price);
        }
//        if(boo){
//        System.out.println(boo);
//        }

        else{
            System.out.println(boo);
            System.out.println(price);
        }
        System.out.println(price);

    }

}