package Unit_Test;
import java.util.ArrayList;
import org.w3c.dom.ls.LSOutput;

public class Test3 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        int n=-5;
        for(int i=1;i<5;i++){
            n*=i;
        }
        System.out.println(n);


                // create an ArrayList
                ArrayList<String> languages = new ArrayList<>();

                // insert element to the arraylist
                languages.add("JavaScript");
                languages.add("Java");
                languages.add("Python");
                System.out.println("ArrayList: " + languages);

                // remove the element from position 2
                String element = languages.remove(2);
                System.out.println("ArrayList after remove(): " + languages);
                System.out.println("Removed Element: " + element);

        ArrayList<Integer> randomNumbers = new ArrayList<>();

        // add element to the arraylist
        randomNumbers.add(22);
        randomNumbers.add(13);
        randomNumbers.add(35);
        randomNumbers.add(13);
        randomNumbers.add(40);
        System.out.println("ArrayList: " + randomNumbers);
Integer a=35;
        // remove the first occurrence of 13
        boolean result = randomNumbers.remove(Integer.valueOf(13));
        System.out.println(randomNumbers.remove(a));
        System.out.println(randomNumbers.remove(1));
        System.out.println("Is element 13 removed? " + result);
        System.out.println("ArrayList after remove(): " + randomNumbers);


        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(4);System.out.println(nums);
        nums.remove(nums.size()-1);System.out.println(nums);
        nums.add(2);System.out.println(nums);
        nums.add(10);System.out.println(nums);
        nums.add(0,6);System.out.println(nums);
        nums.remove(1);System.out.println(nums);
        nums.add(-7);System.out.println(nums);
        nums.add(2,2);System.out.println(nums);
        System.out.println(nums);

    }
        }


        class Test{

            public static void main(String[] args) {

                double number=add(3.4);
                number+=add("dual");
                number+=add(Integer.parseInt("100"));
                number+=add(11341L);
                number+=add(Float.parseFloat("50.8"));
                System.out.println(number);

            }
    public static int add(int n){
                return 5;
    }
            public static double add(double n){
                return 2.5;
            }
            public static long add(String s){
                return 10;
            }

        }