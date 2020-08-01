package replt;

public class Method_with_return2 {

        public int max(int x,int  max)
        {
            if(x>max){
                return max;
            }else{
                return x;
            }

        }

    public static void main(String[] args) {
       Method_with_return2 obj=new Method_with_return2();
       obj.max(3,20);
    }
    }

