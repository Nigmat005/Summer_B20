package replt;

public class Method_with_return1_countapprance {
    public static String reverse(String input)
    {  String res="";
        for(int i=input.length()-1;i>=0;i--){
            res+=input.charAt(i);

        } System.out.print(res);
        return res;
    }
    public static void main(String[]args){
        reverse("Hello");

    }
//        public int  count_appearance(String[] arr,String t)
//        { int count=0;
//            for(String each:arr){
//
//                if(t==each){
//                    count+=1;
//                }
//            }return count;
//        } //end  count_appearance
//        public static void main(String[] args){
//            String[] arr={"apple","banana","grape","orange","orange"};
//            String word="orange";
//            Method_with_return1_countapprance obj=new Method_with_return1_countapprance();
//            obj.count_appearance(arr,word);
//        }

    }

