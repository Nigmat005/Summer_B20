package Quiz;

public class String_quiz {
    public static void main(String[] args) {
        String str="  Batch 18";
        str.trim();
        int z= str.indexOf("");
        System.out.println(str.replace('B','A'));
        String ta="A";
        ta=ta.concat("B");
//        System.out.println(ta);
        String tb="C";
        ta=ta+tb;
//        System.out.println(ta);
        ta.replace('C','D');
        System.out.println(ta);
        ta=ta+tb;
        System.out.println(ta);




        System.out.println(z);

        String a =" Hello aabcde Worlda";
        System.out.println(a.replace('a','b'));
        System.out.println(a);
        System.out.println(a.replaceAll("a", "A"));
        System.out.println(a.replaceAll("a*", "A"));
       /* System.out.println(a.replaceAll("\\*a", "A"));*/
        System.out.println(a.replaceAll("a\\*", "A"));
        System.out.println(a.replaceAll("a.*", "A"));
        System.out.println(a.replaceAll("aabcde.*", "A"));
        System.out.println(a.replaceAll(".*aabcde.*", "A"));


    }
}
