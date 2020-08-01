//package Practice;
//
//import java.util.Scanner;
//
//public class forloop_password {
//    public static void main(String[] args) {
//        String password="19900502Nigmat!";
//        Scanner input=new Scanner(System.in);
//        String A="You only have three times attempt ";
//
//
//        System.out.println(A);
//        System.out.println("==================================");
//        System.out.println("Please enter your password");
//        String st=input.nextLine();
//        if(st.equals(password)){
//            System.out.println("Logged in");
//        }else {
//            for(int i=2;i>=0;i--){
//
//                String B="You only have two times attempt ";
//                String C="You only have last chance ";
//                if(i==2){
//                    System.out.println(B);
//                }else if(i==1){
//                    System.out.println(C);
//                }else{
//                    System.out.println("15 mins later");
//                }
//
//
//
//
//
//
//            }
//
//
//        }
//
//    }
//
//}
package Practice;

import java.util.Scanner;

 class forloop_password2 {
    public static void main(String[] args) {
        String password = "19900502Nigmat!";
        Scanner input = new Scanner(System.in);
        String A = "You only have three times attempt ";


        System.out.println(A);
        System.out.println("==================================");
        System.out.println("Please enter your password");
        String st = input.nextLine();
        if (st.equals(password)) {
            System.out.println("Logged in");
        }
        else{
            System.out.println("Try one more time");
            for(int i=2;i>0;i--){
                st = input.nextLine();
                if(st.equals(password)){
                    System.out.println("Logged in");
                    break;
                }else{
                    if(i==2){
                        System.out.println("Try one more time");
                    }else{
                        System.out.println("Account Locked");
                        break;
                    }


                }
//            }if(!st.equals(password)){
//                System.out.println("Account Locked");
            }
        }

        }
        }


class forloop_password3 {
    public static void main(String[] args) {
        String password = "19900502Nigmat!";
        Scanner input = new Scanner(System.in);
        String A = "You only have three times attempt ";


        System.out.println(A);
        System.out.println("==================================");
        System.out.println("Please enter your password");
        String st = input.nextLine();
        if (st.equals(password)) {
            System.out.println("Logged in");
        }
        else{
            System.out.println("Second Attempt");
            for(int i=2;i>0;i--){
                st = input.nextLine();
                if(st.equals(password)){
                    System.out.println("Logged in");
                    break;
                }else{
                    if(i==2){
                        System.out.println("Last Attempt");
                    }else{
                        System.out.println("Account Locked");
                        break;
                    }


                }
//            }if(!st.equals(password)){
//                System.out.println("Account Locked");
            }
        }

    }
}




