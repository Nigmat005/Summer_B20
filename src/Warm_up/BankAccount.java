package Warm_up;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class BankAccount {
    class hello{

    }
    String AccountType;
    String AccountHolder;
    String AccountNumber;
    Double AccountBalance;

    public void SetAccountInfo(String type, String holder, String number,double balance){
        AccountType=type;
        AccountHolder=holder;
        AccountNumber=number;
        AccountBalance=balance;
    }
   public void GetAccountInfo(){
       System.out.println("Account_type: "+AccountType+"Account_holder: "+AccountHolder+"Account_number: "+AccountNumber+"Account_balance: "+AccountBalance);
   }

   public void CheckBalance(){
       System.out.println("Your current balance is: "+AccountBalance+" $");
   }
    public void Deposit(double deposite){
        System.out.println("Your have successfully deposited: "+deposite+" $");
        AccountBalance+=deposite;
        System.out.println(AccountBalance);
    }
    public void Withdraw(double withdraw){
        System.out.println("Your have successfully withdraw: "+withdraw+" $");
        AccountBalance-=withdraw;
        System.out.println(AccountBalance);
    }
}

class BankAccountObject{
    public static void main(String[] args) {

        BankAccount obj1= new BankAccount();
        BankAccount obj2= new BankAccount();
        BankAccount obj3= new BankAccount();


        obj1.SetAccountInfo("Visa","Nigmat","123456789",100000.0);
        obj2.SetAccountInfo("Master","Esil","342152525",90000.0);
        obj3.SetAccountInfo("American Express","Xax","2352272372",55555.0);

        obj1.GetAccountInfo();obj2.GetAccountInfo();obj3.GetAccountInfo();
        obj1.Deposit(500);
        obj2.Withdraw(1000);
        obj3.Deposit(555);

        System.out.println("==================================================================");

        // Here we gonna create Arrays of object.
//        In order to create a Arrays of object we need to have Class name and always use keyword "new" + constructor name.

            BankAccount[] bankArr={ new BankAccount(),new BankAccount(),new BankAccount()};
            bankArr[0].SetAccountInfo("Visa","Nigmat","123456789",100000.0);
            bankArr[1].SetAccountInfo("Master","Esil","342152525",90000.0);
            bankArr[2].SetAccountInfo("American Express","Xax","2352272372",55555.0);

            for(BankAccount each:bankArr){
                each.GetAccountInfo();

            }
        System.out.println("========================================");
        // Here we gonna create ArraysList of object.
//        In order to create a ArrayList of object we need to have Class name
             ArrayList<BankAccount>list=new ArrayList<>();
            list.addAll(Arrays.asList(obj1,obj2,obj3));
            list.get(0).AccountBalance=50000.0;
            for(int i=0;i<list.size();i++){
                list.get(i).GetAccountInfo();
            }
        System.out.println("=========================================");

//Here we use removeif()method using predication
        // Let's remove whose balance is under 10000$
//        here the p stands for what is stored in the ArrayList, which is "Object"
        list.removeIf(p-> p.AccountBalance<55000);
        for(BankAccount each:list){
            each.GetAccountInfo();
        }
    }
}