package Method;

import java.util.Arrays;

public class Method_practice {
    public static void Method(String str){
       String res="";
        for(int i=0;i<str.length();i++){
//            char each=str.charAt(i);
//            if(!res.contains(Character.toString(str.charAt(i))+"")){
//
//            }
            if(!res.contains(str.charAt(i)+"")){
                res+=str.charAt(i);
            }
        }
        System.out.println(res);
        for(int i=0;i<res.length();i++){
           int count=0;
            for(int j=0;j<str.length();j++){
//                if(res.charAt(i)==str.charAt(j)){
//                    count+=1;
//
//                }
                if((res.charAt(i)+"").equals(str.charAt(j)+"")){
                    count+=1;

                }
            }
            System.out.println(res.charAt(i)+""+count);

        }


    }

    public static void main(String[] args) {
        Method("AABBCCCDE");
    }
}


class testing{
    public static void main(String[] args) {
        String st="AABBCCDD";
       char[] charArray=st.toCharArray();
        System.out.println(Arrays.toString(charArray));
    }
}