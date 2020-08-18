package replt;

public class Methods_with_String_7 {
        public static String at3(String target,String word){
            String result="";
            for(int i =0;i<target.length();i++){ //(target.length()+word.length())

                if(i==3){
                    for(int j=0;j<word.length();j++){
                        result+=word.charAt(j);

                    }
                }
                result+=target.charAt(i);


        } return result;
        }

        public static void main(String[]args){
            System.out.println(at3("banan","a"));
            System.out.println(at3("longword","foo"));
            System.out.println(at3("blabla","a"));
        }





}
  // This is another way of doing

class Methods_with_String_7_II {
    public static String at3(String target,String word){
        String result="";
        for(int i =0;i<target.length();i++){ //(target.length()+word.length())
            result+=target.charAt(i);
            if(i==2){
                for(int j=0;j<word.length();j++){
                    result+=word.charAt(j);

                }
            }



        } return result;
    }

    public static void main(String[]args){
        System.out.println(at3("banan","a"));
        System.out.println(at3("longword","foo"));
        System.out.println(at3("blabla","a"));
    }





}