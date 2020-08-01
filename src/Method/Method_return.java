package Method;

public class Method_return {
    public static String res_string(String str){
    String res="";
    for(int i=str.length()-1;i>=0;i--){
         res+=str.charAt(i);
    }
      return res;
    }

    public static void main(String[] args) {
      String st1="mom";
        res_string(st1);
        String last=res_string(st1);
        System.out.println(st1.equalsIgnoreCase(last));
    }
}
