package replt;
import java.util.*;
public class ArrayList_Search {

        public static String search(ArrayList<String> r, String find) {
//
//            if(r.contains(find)){
//                for(String each:r) {
//                    {
//                        if(each==find)
//
//                        return each;
//
//                    }
//            }
//            } else{
//                return "search failed";
//            }
//            return find;
//        }


                 // below also works
            r.removeIf(p-> !p.contains(find));
            for(String each:r) {
                {
                    return each;

                }
            }
            return "search failed";
        }     //end wineSeller

        public static void main(String[] args){


            ArrayList<String>  arr = new ArrayList<String>();
            arr.add("2");
            arr.add("6");
            arr.add("foo bar");
            arr.add("abc");


            String find_tst = search(arr,"2");
            String find_tst2 = search(arr,"sgrfsd");
            System.out.print(find_tst);//foo bar
            System.out.print(find_tst2);//foo bar


        }//end main
    }



class TestList{
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        for(String each:list){
            System.out.println(each);
        }
    }
}

