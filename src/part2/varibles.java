package part2;

import org.w3c.dom.ls.LSOutput;

import static java.lang.Integer.sum;
import static java.lang.Math.max;

public class varibles
{

    public static void main(String[] args)
    {
      String employeeName="Asye";
      int employeeID= 123456;
      String jobTitle="developer";
      Double salary=890_867_6.567;
      char gender='F';
      boolean isFullTime= true;
        System.out.println( employeeID+("\n")+employeeName+("\n")+jobTitle+("\n")+salary+gender+("\n")+isFullTime);
        System.out.println("\n\n");
        System.out.println( employeeID+"\n"+employeeName+"\n"+jobTitle+"\n"+salary+gender+"\n"+isFullTime);
        System.out.println(employeeName. concat(jobTitle));


    }
}

class Test{
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是: " + age);
    }

    public static void main(String[] args){
        Test test = new Test();
        test.pupAge();
    }
}

// Create a Java Method.
// Java method must be create (declared) within a Class. It is defined with the name of method,followed by().
class CreateMethod
{
    static void myMethod()
    {  // code to be excuted
        System.out.println("excuted the method");
    }

    public static void main(String[] args)
    {
       myMethod();
        myMethod();
        myMethod();
    }


}


class PupMethod{
    static void Pupage(){   //using Method  类变量不需要创建对象（Object）来访问，可以直接/调用/访问。
        int age=0;
        age=age+7;
        System.out.println("Pup's age is "+age);
    }

    public static void main(String[] args) {
    Pupage();
    }
    //{Pupage();}

}

class PupObject{
    public void Pupage(){ //局部变量
        int age=0; //  age 为局部变量，定义在方法Pupage中。
        age=age+7;
        System.out.println("Pup 的年龄是： "+age);
    }

    public static void main(String[] args) {

        PupObject myObj= new PupObject(); // 局部变量只能通过对象（Object）来 调用/访问方法。
        myObj.Pupage();

    }
}


class Car{
    public void fullThrottle() {
        System.out.println("THe car is going as fast as it can");
    }
    public void speed(int maxSpeed){
        System.out.println("This car's max speed is "+maxSpeed);

    }

    public static void main(String[] args) {
        Car myCar=new Car();
        myCar.fullThrottle(); myCar.speed(300);

    }
}
// Below is using object myCar(in class OtherClass) to call public method in (class Car1)
class Car1{
    public void fullThrottle(){
        System.out.println("THe car is going as fast as it can");
    }
    public void Speed(int maxSpeed){
        System.out.println("This car's max speed is "+maxSpeed);
    }
}

class OtherClass{
    public static void main(String[] args) {
        Car1 myCar=new Car1();
        myCar.fullThrottle();
        myCar.Speed(500);
    }
}

class math{
    static void Max(){
        int a=10, b=20;
        System.out.println(Math.max(a,b));
    }
    public static void main(String[] args) {
        Max();
    }

}

class math1 // static non-object
{
    static void min (int a,int b){
        System.out.println(Math.min(a,b));

    }
    static void max (int a,int b){
        System.out.println(Math.max(a,b));
    }

    public static void main(String[] args) {
        min(5,7);
        max(5,7);
        System.out.println(sum(13,15));

    }

}
// public object
class math2{
    public void min (int a, int b){
        System.out.println(Math.min(a,b));

    }
    public void max (int a, int b){
        System.out.println(Math.max(a,b));
    }

    public static void main(String[] args) {
      math2 Obj=new math2();
      Obj.min(3,9);
      Obj.max(3,9);


    }
}


// one object in two classes
class math3{
    public void min(int a , int b){
        System.out.println(Math.min(a,b));
    }
    public void max(int a , int b){
        System.out.println(Math.max(a,b));
    }

}
class math4{
    public static void main(String[] args) {
        math3 Obj= new math3();
        Obj.min(11,15);
        Obj.max(11,15);

    }
}

// using return

/*class math5{
    static int min(int a , int b){
        return (Math.min(a,b));
    }

    public static void main(String[] args) {
        min(25,19);
    }
}*/

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(24);
        System.out.println("My age is " + p1.getAge());
    }
}

class Testr {
    public static void main(String args[]) {
        int x=4;
        System.out.println(x++);
    }
}

class delete_append
{
    public static void main(String[] args)
    {
        StringBuffer a = new StringBuffer("Runoob");
        StringBuffer b = new StringBuffer("Google");
        a.delete(1,3);
        a.append(b);
        System.out.println(a);
    }
}

class Person1{
    protected String fname = "John";
    protected String lname = "Doe";
    protected String email = "john@doe.com";
    protected int age = 24;
}

class Student extends Person1 {
    private int graduationYear = 2018;
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        System.out.println(15%2);
    }
}


