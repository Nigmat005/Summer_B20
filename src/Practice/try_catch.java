package Practice;

public class try_catch {
    //Java try and catch
    //The try statement allows you to define a block of code to be tested for errors while it is being executed.
    //
    //The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
    //
    //The try and catch keywords come in pairs:
//    The finally statement lets you execute code, after try...catch, regardless of the result:

    public static void main(String[] args) {
        try {
            int[] a = {1, 2, 6, 8, 24};
            System.out.println(a[10]);
        } catch (Exception e) {
            System.out.println("The element you looking for does not exist");
        } finally {
            System.out.println("Go back try again if failed");


        }
    }}
class A {
    public static void main(String[] args) {
       try{int[] a={1,2,3,4,5};
           System.out.println(a[6]);
       } catch(Exception e){
           System.out.println("out of bounds");
       }
       finally{
           System.out.println("Please enter number smaller than index ");
       }
    }
}