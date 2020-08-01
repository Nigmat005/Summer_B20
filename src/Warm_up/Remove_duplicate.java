package Warm_up;

import java.util.Scanner;

public class Remove_duplicate {
    public static void main(String[] args) {

            Scanner input =new Scanner(System.in);
            System.out.println("Please enter String");

            String res="";
            String st1="";
        System.out.println(res.contains(st1));

                String st = input.nextLine();


                int i = st.length() - 1;
                while (i >= 0) {
//                    System.out.println(st.charAt(i));

//                    st1=""+st.charAt(i);
                    st1= ""+st.charAt(i);

                    System.out.println(st1);

                    if (!res.contains(st1)) {
                        res += st1;
                    } else {
                        res = res;
                    }
                    i--;
//

//
                }
                System.out.println(st1);
                System.out.println(res);


            }
    }





