package replt;

public class Methods_with_String3_cover {

        public static void main(String[] args) {
//            System.out.println(coverString("java methods", "me") ) ; java [me]thods
           System.out.println(coverString("Certified Wooden Spoon","o") ) ;
        }

        public static String coverString(String main, String coverME) {
            String res="";
            if(main.contains(coverME)){
                res=main.replaceAll(coverME,("["+coverME+"]"));
//                System.out.println(res);
            }else{
                res="["+main+"]";
//                System.out.println(res);
            }
            return res;

        }


    }


