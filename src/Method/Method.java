package Method;

public class Method {
    public static void Vote_method(String Name,boolean Citizenship, int Age, boolean Registered, String Candidate){
        System.out.println("Welcome to vote");
        if(Citizenship && Age>=18 && Registered){
//            System.out.println(Name+" "+","+" "+Citizenship+" "+","+" "+Age+" "+","+" "+Registered+" "+","+" "+"Has voted for "+Candidate);

            System.out.println(Name+" "+","+ Age+" "+","+" "+"has voted for "+Candidate);
        }

        else{
            System.out.println("You are not eligible for voting");
        }

    }

    public static void main(String[] args) {
   Vote_method("Jone",true,25,true,"Trump");
        System.out.println("Hope you have a great day");
    }

}
