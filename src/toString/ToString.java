package toString;
import java.util.ArrayList;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ToString {
    public static void main(String[] args) {
        String st=new String("Cybertek");
        System.out.println(st.toString());
       Object object=new Object();
        System.out.println(object.toString());

        System.out.println(new String("Hello"));
        System.out.println(st.toString());




                // getClass() with Object
                Object obj1 = new Object();
                System.out.println("Class of obj1: " + obj1.getClass());

                  ToString obj4 = new ToString();
                  System.out.println("Class of obj1: " + obj4.getClass());


                  // getClass() with String
                String obj2 = new String();
                System.out.println("Class of obj2: " + obj2.getClass());

                // getClass() with ArrayList
                ArrayList<Integer> obj3 = new ArrayList<>();
                System.out.println("Class of obj3: " + obj3.getClass());

            }
        }

class Animal {

    public void eat() {
        System.out.println("I can eat");
    }

    public void sleep() {
        System.out.println("I can sleep");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("I can bark");
    }
}

class Main {
    public static void main(String[] args) {

        Animal ani=new Animal();
        ani.eat();

        Dog dog1 = new Dog();

        dog1.eat();
        dog1.sleep();

        dog1.bark();
    }
}