package OOP;

import javax.management.modelmbean.ModelMBean;

public class Class_Object {
    String Make="";
    String Model="";
    int Year=0;
    int Millage=0;
    double Price=0;
public void setINFO(String carMake,String carModel,int carYear,int carMillage,double carPrice){
    Make=carMake; Model=carModel;Year= carYear; Millage=carMillage;Price=carPrice;
    System.out.println(Make+" "+Model+" "+Year+" "+Millage+" "+Price);
}
    public static void main(String[] args) {
       Class_Object obj=new Class_Object();
      /*
       obj.Make="Honda";obj.Model="Accord";obj.Year=2012;
       obj.Millage=47900;obj.Price=11000;
        System.out.println(obj.Make);
        System.out.println(obj.Model);
        System.out.println(obj.Year);
        System.out.println(obj.Millage);
        System.out.println(obj.Price);*/

      obj.setINFO("Honda","Accord",2012,49000,11000);

    }
}
