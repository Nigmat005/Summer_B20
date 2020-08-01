package Practice;

public class post_vs_pre {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a);//11
        System.out.println(a);// 11
        System.out.println(--a);
        int b =10;
        System.out.println(b++);//10
        System.out.println(b--);//10
        System.out.println(++b);
        System.out.println(--b);
        int A=55;
        System.out.println(++A+A+++--A+A--);

    }
}
