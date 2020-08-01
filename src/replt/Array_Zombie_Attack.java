package replt;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

class Array_Zombie_Attack2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];

        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
//        int[]Array={0,0,0,0,0,0,0,0};


        System.out.println("Day 0 "+Arrays.toString(inhabitants));
        int day=1;    int count=0;
         do{
                   for(int i=0;i<inhabitants.length-1;i++){
                       if(inhabitants[i]!=0 && inhabitants[i+1]==0){
                           inhabitants[i]/=2;
                       }
                       if(inhabitants[i]==0 && inhabitants[i+1]!=0){
                           inhabitants[i+1]/=2;
                           i+=1; //in case of let one element become twice in one time(or in one day)
                       }




                   }


                   System.out.println("Day "+day+Arrays.toString(inhabitants));
                   day++;
                     count=0;// here, count=0 must be placed here because every time we wanna count from 0 otherwise count will always >0,
                             // meaning loop will not end forever.
                   for(int each:inhabitants){
                           count+=each;
                   }

                 }while(count>0);
        System.out.println("--- EXTINCT ---");

//        while(true){
//            int j=0;
//            if(inhabitants[j]==0){
//            inhabitants[j+1]=inhabitants[j+1]/2;
//
//        }
//
//
//           for (int i = 1; i < inhabitants.length - 1; i++) {
//               if (inhabitants[i] == 0) {
//                   inhabitants[i - 1] = inhabitants[i - 1] / 2;
//                   inhabitants[i + 1] = inhabitants[i + 1] / 2;
//                   i += 1;
//
//               }
//               System.out.println(Arrays.toString(inhabitants));
//           }
////           for(int each:inhabitants){
////               countinner+=each;
////           }
////
//
//
//       if(inhabitants[inhabitants.length-1]==0){
//                inhabitants[inhabitants.length-2]= inhabitants[inhabitants.length-2]/2;
//                System.out.println(Arrays.toString(inhabitants));
//            }
//
//            System.out.print("Day "+j+" ");
//            System.out.println(Arrays.toString(inhabitants));
//            j++;
//             int counter=0;
//            for (int element : inhabitants) {
//                counter = counter + element;
//            }
//
//            //if each element value in every city is zero, we stop
//            if (counter == 0) {
//               break;
//            }
//
//
//        }
//        System.out.println("--- EXTINCT ---");
 }
}

class test{
    public static void main(String[] args) {
            int a=1/2;
            System.out.println(a);
            int b=0;
            System.out.println(b);
            System.out.println(a==b);
            String A="rggagag";
        System.out.println(A.substring(0,1)+A.substring(A.length()-1,A.length()));
        System.out.println(Character.toString(A.charAt(0))+A.charAt(A.length()-1));
        System.out.println(A.charAt(0)+""+A.charAt(A.length()-1));
        }


    }


 class B138_Zombies3 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.
        int cnt = 0, sum = 0;
        System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));

        do {
            for (int i = 0; i < inhabitants.length-1; i++) {
//                if (i < inhabitants.length - 1) {
                    if (inhabitants[i] != 0 && inhabitants[i + 1] == 0) {
                        inhabitants[i] /= 2;
                    }
                    if (inhabitants[i] == 0 && inhabitants[i + 1] != 0) {
                        inhabitants[i + 1] /= 2;
                        i += 1;
                    }
                }System.out.println( Arrays.toString(inhabitants));
//                }
            sum = 0;
            for (int n : inhabitants)
                sum += n;

            cnt++;
            System.out.println("Day " + cnt + " " + Arrays.toString(inhabitants));
        } while (sum > 0);
        System.out.println("---- EXTINCT ----");


    }
}

class test11{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.print(i);
            i+=1;
//            System.out.println(i);
        }
    }
}
