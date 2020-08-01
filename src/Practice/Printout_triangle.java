package Practice;

public class Printout_triangle {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=1;j<i;j++){
                System.out.print(" * ");
            }System.out.print(" \n");
        }

    }
}
class reverse{
    public static void main(String[] args) {
        for(int i=1;i<=8;i++){
            for(int j=8;j>=i;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}