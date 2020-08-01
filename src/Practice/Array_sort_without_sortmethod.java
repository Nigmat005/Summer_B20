package Practice;

import java.util.Arrays;

public class Array_sort_without_sortmethod {
    public static void main(String[] args) {
        int[] int1={1,1,2,2,3,3,4,5,5};
        //          1,2,3,4,5

//        Find length of new Array is key
        int n=0;

        for(int i=0;i<int1.length;i++){
//            int n=0;
            int j=i+1;
             // Reason why j=i+1. because if you wanna find duplicate you need to compare that element with another element right next to it
             //instead of itself. If you do j=i. There would always be one duplication more cuz comparing itself.
             if(int1[i]==int1[j]) {

                 n+=1;

             }
             System.out.println(n);

        }
//        System.out.println(n);
//        int Temp=0;
//        int[] int2=new int[n];
//        System.out.println(int2.length);
//        for(int i=0;i<int1.length;i++){
//            for(int j=i+1;j<int1.length;j++){
//                if(int1[i]!=int1[j]){
//                  int1[j]=int1[int1.length-1];
//
//                }
//            }
//        }

    }
}


class Array_sort_without_sortmethod1{
    public static void main(String[] args) {
        int[] int1={5,1,4,3,2,67,100,55};
        int Temp=0;
        for(int i=0;i<int1.length;i++){
            for(int j=i+1;j<int1.length;j++){
                if(int1[i]>int1[j]){
                    Temp =int1[i];
                    int1[i]=int1[j];
                    int1[j]=Temp;
//                    System.out.println(Arrays.toString(int1));
                }
            }
        }
        System.out.println(Arrays.toString(int1));
// decending way
        System.out.println("===================================");
        for(int i=0;i<int1.length;i++){
            for(int j=i+1;j<int1.length;j++){
                if(int1[i]<int1[j]){
                    Temp =int1[i];
                    int1[i]=int1[j];
                    int1[j]=Temp;
//                    System.out.println(Arrays.toString(int1));
                }
            }
        }
        System.out.println(Arrays.toString(int1));

    }
}



class test1{
    public static void main(String[] args) {
        int[] a={1,1,2,2,3,3,4,5,5,5};
        int num=0;
        for(int i=0;i<a.length-1;i++){

            if(a[i]==a[i+1]){
                num+=1;

            }


        }
        System.out.println(num);

        }





    }
