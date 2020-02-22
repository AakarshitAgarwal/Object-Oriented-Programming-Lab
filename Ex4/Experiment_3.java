class Worker{
   int n;
   String s;
   public void info(int no,String name){
    n=no;
    s=name;
   }
   void show(){
    System.out.println("Employee no. is "+n);
    System.out.println("Employee name. is "+s);
   }
}
/*class Salaried_Worker extends Worker{
   int rate;
   void SalaryWorker(int no,String name,int r){
     //super(no,name);
     rate=r;
   }
   void Compay(){
     show();
     int hour=40;
     System.out.println("Salary of the worker is "+rate*hour);
   }
}*/
class Daily_Worker extends Worker{
   int rate;
    void DailyWorker(int no,String name,int r){
     super(no,name);
     rate=r;
   }
    void Compay(int h){
     show(); 
     System.out.println("Salary of the worker is "+rate*h); 
   }
}
class Experiment_3{ 
  public static void main(String args[]){
   //Worker w0=new Worker();
   //w0.info(10,"Aakarshit");
   Salaried_Worker w1=new Salaried_Worker();
   w1.SalaryWorker(10,"Aakarshit",5);
   //w1.Compay();
   Daily_Worker w2=new Daily_Worker();
   w2.DailyWorker(20,"Abhishek",10);  
   w2.Compay(2); 
   }
 } 