package Method;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class combo_Array {
    public static int[] My_method(int[]arr1,int[]arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
          arr3[i]=arr1[i];
        }
        int i=0;
        for(int j=((arr1.length+arr2.length)-arr1.length);j<arr3.length;j++){
            arr3[j]=arr2[i];
            i++;
        }
        return arr3;
    }

    public static void main(String[] args) {
        int [] A={1,2,3,4,5};
        int [] B={6,7,8,9,10};
        My_method(A,B);//Since we are using return type. We can assign our return value to any data type.Check below
        int[] new_Array=My_method(A,B);
        for(int i=0;i<My_method(A,B).length;i++){
            System.out.println(My_method(A,B)[i]);
        }
        System.out.println(Arrays.toString(new_Array));
    }
}



class test{
    public static void main(String[] args) {
        int [] arr1={1,2,3,4,5};
        int [] arr2={6,7,8,9,10};
        int[] arr3=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        int i=0;
        for(int j=((arr1.length+arr2.length)-arr1.length);j<arr3.length;j++){
            System.out.println(j);
            arr3[j]=arr2[i];

            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

}