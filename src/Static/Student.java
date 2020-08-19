package Static;

public class Student {
    String name;
    int age;
    int groupNumber;
    char gender;

    static String schoolName="Cybertek School";
    static String favotite_Teacher="Muhtar";

    public void setInfo(String name,int age,int groupNumber,char gender){
        this.name=name;
        this.age=age;
        this.groupNumber=groupNumber;
        this.gender=gender;
    }

    public static void main(String[] args) {
        System.out.println(schoolName);
        System.out.println(favotite_Teacher);
//        System.out.println(age); will give compile error
        Student obj=new Student();
        System.out.println(obj.age);

    }



}
