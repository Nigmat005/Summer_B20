package Practice;

public class ternary<num1>
{


    public static void main(String[] args) {
        int num=9;
        if (num++ == 10) {
            System.out.println("SFDS"+num);

        } else
        {
            System.out.println("Tytyt"+num);
        }
        boolean X=true;
        boolean Y=!X==false;
        boolean Z=Y;
        if(X){
            System.out.println("Hello");
        }
        if(Y){
            System.out.println("Today");
        }
        if(Z){
            System.out.println("WE");
        }
        int x=10;
        int y=x++;
        System.out.println(y++ +" "+x++ +" "+y);
        int score=0;
        if(score==0){
            score=score+50;
        }
//        if(score!=0){
//            score+=50;
//
//        }
        System.out.println(score);




        // syntax of ternary
        int num1=20;
        int num2=50;
        if(num1>num2){
            System.out.println("Max is "+num1);

    }else {
            System.out.println("Max is "+num2);
        }

      String comparasion=(num1>num2)?"Max is num1":"Max is Num2";
        System.out.println(comparasion);

        // here is alcohol approval
        int age=21;
        String st1="";
        if(age>=21){
            st1="yes";
        }
        else{
            st1="No";
        }
        System.out.println(st1);
        // below is ternary version of above (For suing ternary you can only use it for simple if statement,eg. One if and else)
        //syntax is : variable=(condition)? expression1 : expression2
        String result=(age>=21)? "Yes, you can buy alcohol":"Here is milk you should buy";
        System.out.println(result);

        // below is else if statement in multi branch
//        int grade=95;                                      //age>=90 && age<95
//        String test_Result="";
//        String your_score=(grade>=95)?test_Result="your score is A" :(age>=90 && age<95)?test_Result="Your score is B":(age>=85 && age<90)?test_Result="Your score is C":(age>=80 && age<85)?test_Result="Your score is C+":"Your failed";
//        System.out.println(test_Result);

        int grade=97;                                      //grade>=90 && grade<95
        String your_score=(grade>=95)?"your score is A" :(grade>=90 && grade<95)?"Your score is B":
                (grade>=85 && grade<90)?"Your score is C":(grade>=80 && grade<85)?"Your score is C+":"Your failed";
        System.out.println(your_score);
        System.out.println("Hello".charAt(3));
    }

}
