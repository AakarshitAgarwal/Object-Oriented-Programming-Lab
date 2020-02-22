import java.util.*;
class Calls{
 String type;
 float dur;
 int rate(){   //type of rate
  if(type.equals("ordinary"))
   return 1;
  else if(type.equals("urgent"))
   return 2;
  else if(type.equals("lightning"))
   return 3;
  else
   return 4;
 }
}
class Bill extends Calls{
 float amount;
 void read(){   ///input for type and duration
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter the type of call :ordinary,urgent,lightning");
 type=sc.nextLine();
  System.out.println("Enter the call duration :");
  dur=sc.nextFloat();
 }
 void Calculation(){    //amount calculation
  if(dur<=5)
   amount=rate()*dur;
  else if(dur<=10)
   amount=rate()*dur;
  else if(dur<=15)
   amount=rate()*dur;
  else if(dur<=20)
   amount=rate()*dur;
  else
   amount=150;
 }
 void print(){         //to print values
  System.out.println("Call type: "+type);
  System.out.println("Call duration: "+dur);
  System.out.println("Total amount: "+amount);
 }
}
class Telephone_exchange{   //main method
 public static void main(String args[]){
  Bill b=new Bill();
  b.read();
  b.Calculation();
  b.print();
 }
} 