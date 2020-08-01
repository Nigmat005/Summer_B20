package Practice;
//The throw statement allows you to create a custom error.
//        The throw statement is used together with an exception type.
//        There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
public class throw_keyword {
    public static void main(String[] args) {
        int age=19;
        boolean goodtogo= age>21;
        if(!goodtogo){
            throw new ArithmeticException("Not allowed to buy");
        }
        else{
            System.out.println("You are good to go");
        }

    }
}
