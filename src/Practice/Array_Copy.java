package Practice;
import org.w3c.dom.ls.LSOutput;

import static java.lang.Character.getType;
import java.util.Arrays;



public class Array_Copy {
    public static void main(String[] args) {
        int [] My_array = {1,5,356,26768,213214,534367,6547,1431,1451};
        int a =5235345;
        int [] My_number=My_array; // copy My_array to My_number
//        System.out.println(Arrays.toString(My_number));
        for(int i:My_number){

            System.out.print(i+",");
        }
    }
}

// change the element of an array
 class Array_element_change{
    public static void main(String[] args) {
        int [] My_array = {1,5,356,26768,213214,534367,6547,1431,1451};
        int [] My_number=My_array;
        System.out.println(Arrays.toString(My_number));
        My_array[3]=55555; // changing 4th element 26768 to 55555
        My_number[5]=1;
        //System.out.println(Arrays.toString(My_number));
        for(int allnumbers:My_number){
            System.out.println(allnumbers+",");
        }


    }

}
// use looping construct to copy array
 class Loop_Copy{
    public static void main(String[] args) {
        int [] My_array = {1,5,356,26768,213214,534367,6547,1431,1451};
        int [] My_number=new int [9];
        My_array[3]=55555; // changing 4th element 26768 to 55555
        My_number[5]=1;
        for(int i=0;i<My_array.length;i++){
            My_number[i]=My_array[i];
            System.out.println(My_number);
        }
        System.out.println(Arrays.toString(My_number));


    }

}

// use sytanx System.arraycopy()method
class array_Copy{
    public static void main(String[] args) {
        int[] a={1,4,5,6,25,18,28};
        int[] b=new int[a.length];// assigning same memory as what a is to array a
        int[] c=new int[5];
     /* a=source array; srcPos=Starting position(index) in your Source array. b=destination array. destPos= starting position(index) of destination array.
      length= number of elements you wanna copy to you des from source.*/

      System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
        System.arraycopy(b,2,c,1,3);
        System.out.println(Arrays.toString(c));
//        char alphabtic =76;
//        System.out.println(alphabtic);

    }

}
// use Array.copyOfRange()method
 class Array_copy_range{
    public static void main(String[] args) {
        int[] a={1,4,5,6,25,18,28};
        int[] b= Arrays.copyOfRange(a,0,7); // source array is a , starting from 0th position(index 0), length is 7
        int[] c=Arrays.copyOfRange(b,3,6);
        int[] d=new int[10];



        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.arraycopy(a,1,d,3,5);
        System.out.println(Arrays.toString(d));

    }
}
// using for-loop
 class for_loop_2d{
    public static void main(String[] args) {
        int[][] source = {{1, 4, 7, 5, 9, 10}, {3, 5, 7}, {10, 15, 20, 55}};

        int[][] destination = new int[source.length][]; // 给最外围分配空间

        System.out.println(Arrays.deepToString(destination));// 查看给destination分配的空间
//        array.length : length is a final variable applicable for arrays.
//        With the help of length variable, we can obtain the size of the array.
//                string.length() : length() method is a final variable which is applicable for string objects.
//                length() method returns the number of characters presents in the string.

        System.out.println(source[0].length);

//        String s="hi";
//        System.out.println(s.length());
        for (int i = 0; i < destination.length; i++) {

            destination[i] = new int[source[i].length];//给里面的{}分配空间 即给每一行分配空间

            for (int j = 0; j < destination[i].length; j++) {

                destination[i][j] = source[i][j];

            }
        }

        System.out.println(Arrays.deepToString(destination));


    }
}
class Main {
    public static void main(String[] args) {

        int[][] source = {
                {1, 2, 3, 4},
                {5, 6},
                {0, 2, 42, -4, 5}
        };

        int[][] destination = new int[source.length][];

        for (int i = 0; i < destination.length; ++i) {

            // allocating space for each row of destination array
            destination[i] = new int[source[i].length];

            for (int j = 0; j < destination[i].length; ++j) {

                destination[i][j] = source[i][j];
            }
            System.out.println(Arrays.deepToString(destination));
        }

        // displaying destination array
        System.out.println(Arrays.deepToString(destination));

    }
}
class test{
    public static void main(String[] args) {
        int[][] Source ={{1,3,5,7,9},{2,4,6,8,10},{1,3,5,7,9,2,4,6,8,10}};
        int[][] destination=new int[Source.length][];
//        System.out.println(destination);
         for(int i=0;i<destination.length;i++){
             destination[i]=new int[Source[i].length];
             for(int j=0;j<destination[i].length;j++){
                 destination[i][j]=Source[i][j];
             }
           }
         System.out.println(Arrays.deepToString(destination));
    }

}