package replt;

import java.util.Arrays;
import java.util.Scanner;

public class Zombie_Attack1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        if(inhabitants==0){
            System.out.println("---- EXTINCT ----");
            System.exit(0);
        }
        System.out.println("Day 0 "+"["+inhabitants+"]");
        int j=1;
        while(true){
            if(inhabitants>0){
                inhabitants/=2;
                if(inhabitants>0){
                    System.out.println("Day "+j+" ["+inhabitants+"]");
                }
            }

            j++;
            if(inhabitants==0){
                System.out.println("---- EXTINCT ----");
                break;
            }
        }

    }
    }

class test1{
    public static void main(String[] args) {
        String str="aabbccddee";
        String[] str1=new String[str.length()];
        str1=(str.split(""));
        System.out.println(Arrays.toString(str1));
        System.out.println(Arrays.toString(str.split("")));
    }
}