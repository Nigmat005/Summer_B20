package Practice;

import org.w3c.dom.ls.LSOutput;

public class Constructor {
    public int age=30;
    public static void main(String[] args) {
        data_Hiding obj=new data_Hiding();
        int age=0;

        System.out.println("age is "+age);
        System.out.println("age is "+obj.age);

    }

}

class Vehicle {

    int wheels;

    // constructor accepting single value
    private Vehicle(int wheels){
        wheels = 2;
        System.out.println(wheels + " wheeler vehicle created.");
    }

    public static void main(String[] args) {

        // calling the constructor by passing single value
        Vehicle v1 = new Vehicle(2);
      System.out.println(v1.wheels);

    }
}
class Vehicle1 {

    int wheels;

    // constructor accepting single value
    private Vehicle1(int wheels){
      this. wheels=wheels;
        System.out.println(wheels + " wheeler vehicle created.");
    }

    public static void main(String[] args) {

        // calling the constructor by passing single value
        Vehicle1 v1 = new Vehicle1(2);
        System.out.println(v1.wheels);

    }
}
class Main1 {

    int i;

    // constructor with no parameter
    private Main1(){
        i = 5;
        System.out.println("Object created and i = " + i);
    }

    public static void main(String[] args) {

        // calling the constructor without any parameter
        Main1 obj = new Main1();
        System.out.println(obj.i);
    }
}
class MyClass1 {
    int x;  // Create a class attribute

    // Create a class constructor for the MyClass class
    public MyClass1() {
        x = 5;  // Set the initial value for the class attribute x
        System.out.println("Constructor: "+x);
    }


    public static void main(String[] args) {
        MyClass1 myObj = new MyClass1(); // Create an object of class MyClass (This will call the constructor)
        System.out.println(myObj.x);

    }
}

 class Car {
    int modelYear;
    String modelName;

    public Car(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Car myCar = new Car(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
        System.out.println(myCar.modelName="hi");
        System.out.println(myCar.modelName);
    }
}

