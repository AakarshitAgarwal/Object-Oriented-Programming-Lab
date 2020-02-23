import java.util.*;
class Employee{
  String n;
  int id;
  int sal;
 void info(String name,int empid,int salary){
  n=name;
  id=empid;
  sal=salary;
  
  System.out.println("The employee name and salary are: "+n+", "+sal);
 /*//
 //
  //int  increase_salary()
  //int inc;*/
  /*Scanner sc=new Scanner(System.in);
  System.out.println("Enter the increament in the salary");
  int inc=sc.nextInt();*/
  }
  
}
class Manager extends Employee{
 void department(){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the increament in the salary");
 int inc=sc.nextInt();
 if(inc>=0 && inc<=10)
 System.out.println("Department changed to: Systems Administrator");
 else if(inc>=10 && inc<=20)
 System.out.println("Department changed to: Senior Supervisor");
 else if(inc>=20 && inc<=30)
 System.out.println("Department changed to: Marketing Executive");
 else
 System.out.println("More working knowledge is required to change the post");
 }
}
class Test{
 public static void main(String args[]){
 Employee e=new Employee();
 e.info("Aakarshit",23,50000);
 //e.show();
 //e.increase_salary();
 Manager m=new Manager();
 m.department();
 }
}
