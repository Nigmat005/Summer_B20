package Method;


public class Method_frequency {
    public static int frequency_char(String str, char chr){
        int count=0;
        for(char each:str.toCharArray()){
            if (each == chr) {
                count++;
            }
//        System.out.println(count);
        }
        System.out.println(count);
        return count;
    }
    public static void main(String[] args) {
        frequency_char("AABCDE",'A');

    }
}



class testme{

        public static void frequency_char(String str,char chr){
            int count=0;
            for(char each:str.toCharArray()){
                if (each == chr) {
                    count++;
                }
//
            }
            System.out.println(count);
        }
        public static void main(String[] args) {
            frequency_char("ABCDE",'A');
        }
    }

    class testme1{
     static int num(int a, int b){
        int res=(a*b);
        return res;
    }

        public static void main(String[] args) {
            num(5,10);
        }
    }