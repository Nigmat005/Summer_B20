package Static;


class test1{
    //static variable
    static int max = 10;

    // non-static variable
    int min = 5;
}





public class Test {
        public static void main(String[] args) {
            test1 obj = new test1();

            // access the non-static variable
            System.out.println("min + 1 = " + (obj.min + 1));

            // access the static variable
            System.out.println("max + 1 = " + (test1.max + 1));
        }
    }

