package Method;

public class copy_test {
    public static int frequency(String str, char ch){ // finds the frequency of char from string str
        int count = 0;
        for(char each  : str.toCharArray() ){
            if(each == ch){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str="AABBVDE";
        char ch='A';
        frequency(str,ch);
    }
}
