package Warm_up;
import java.util.Arrays;
import java.util.Scanner;
public class Method_split_personinfo_153 {

        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);
            String s = inp.nextLine();
            person(s) ;
        }

        public static void person(String info)
        {

            //your code here

            String[] arr=info.split(",");
            System.out.println(Arrays.toString(arr));
            System.out.println((arr[1]));
            System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);

        }//end person

    }



