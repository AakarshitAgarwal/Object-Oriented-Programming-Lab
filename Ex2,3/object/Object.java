class Student{
int rollno;
String name;
void insertRecord(int r,String n){
rollno=r;
name=n;
}
void displayInformation(){
System.out.println(rollno+" "+name);
 }
}
class Object{
 public static void main(String args[]){
   Student s1=new Student();
   Student s2=new Student();
   s1.insertRecord(1,"Aakarshit");
   s2.insertRecord(5,"Abhishek");
   s1.displayInformation();
   s2.displayInformation();
 }
}