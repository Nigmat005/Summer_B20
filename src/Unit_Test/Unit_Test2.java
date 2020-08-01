package Unit_Test;

import org.w3c.dom.ls.LSOutput;

public class Unit_Test2 {
    public static void main(String[] args) {
//        String word="  Winter is coming  ";
//        word=word.trim();
//        System.out.println(word.length());
        String result=3425>(9*1000)?"garden":"pation";
//        String A=result.substring(2);
        result=result.substring(2);
        System.out.println(result);
//        System.out.println(A);
        String str="the fox ran under the bridge";
        str=str.substring(4,17);
        str.toUpperCase();
        System.out.println(str+"ground");
        String s="the game was tied at 2-2";
        String s2=s.substring(5);
        int index1=s.indexOf("game");
        int index2=s2.indexOf("game");
        if(index1==index2){
            System.out.println(index1);
        }else{
            System.out.println(index2);

        }
//        String z="popcorn";
//        z=z.substring(1,8);
//        if(z.equals("opcor")){
//            System.out.println(z.length());
//        }else{
//            System.out.println(z.replace("o","a"));
//        }
        String a="today I will go to the beach";
        boolean b=a.contains("i");
        System.out.println(b);
//        System.out.println(a.indexOf("i"));
        boolean c=a.substring(12).startsWith("go");
        System.out.println(c);
        String result1=b&&c?"go":"don't go";
        System.out.println(result1);
        for(int i=0;i<10;i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);
        }
        String s1="I will find the lost book";
        String word1="";
        for(int i=s1.length()-1;i<=0;i--){
            word1+=s1.charAt(i);
        }
        System.out.println(word1);
        int num1=2;
        int num2=6;
        int total=0;
//        for(int j=0;j<5;j++){
//            if(j%3==0){
//                continue;
//                total+=num1+num2;
//            }
//        }
//        System.out.println(total);
        int count=0;
        for(int a1=0;a1<4;a1++){
            if(a1==3)
                continue;
                for(int b1=a1+1;b1<5;b1++){
                    count++;
                    if(b1==3){
                        break;
                    }
                }
            }
        System.out.println(count);
        }

    }

