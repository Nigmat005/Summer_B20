package replt;

public class OOP_callII {

        public static void main(String[] args) {

            Calc a = new Calc();
            a.setX(1);
            a.setY(1);
            a.plus();
            System.out.println("1+1 = "+ a.getResult());//1+1 = 2



        }
    }


class Calc {

    private int x;
    private int y;
    private int result;

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public void plus(){ // the reason is in plus() there is no parameter in () that confuses the compiler to take what <instance or local > variable should be taken.
        this.result=x+y;
    }

    public void minus(){
        this.result=x-y;
    }

    public int getResult(){
        return result;
    }
}


/*class Calc {

    private int x;
    private int y;
    private int result;

    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }

    public void plus(){ // the reason is in plus() there is no parameter in () that confuses the compiler to take what <instance or local > variable should be taken.
        this.result=this.x+this.y;
    }

    public void minus(){
        this.result=this.x-this.y;
    }

    public int getResult(){
        return result;
    }
}
*/

