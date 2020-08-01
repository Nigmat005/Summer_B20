package Warm_up;
//3. write a method that can add element to an array, the method accepts an array and and a number, then returns the new array by appending the number to the last index of the given array
//        Ex:
//        int[] arr = {1,2,3};
//        int num = 4;
//        addElement(arr, num); ===> {1,2,3,4}

import java.util.Arrays;

public class Add_element {
    public static int[] add_element(int original[],int adding_num){
        int [] new_Array=new int[original.length+1];
        int i=0;
        for(int each:original){
           new_Array[i]=each;
           i++;
        }
         new_Array[i]=adding_num;
        System.out.println(Arrays.toString(new_Array));
        return new_Array;
    }

    public static void main(String[] args) {
        int[]  orignal={1,2,3,4,5};
        int num=9;
        add_element(orignal,num);
    }
}
