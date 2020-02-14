import java.util.*;
class PlayerClass
{
 Scanner sc =new Scanner(System.in);
  String Country=sc.nextLine();
  //String Country=sc.nextLine();
  int BMI=sc.nextInt();
 public void Player_Information()
 {
  System.out.println("Player information are");
  System.out.println("Country:  "+Country);
  System.out.println("BMI:  "+BMI);
  }
}
class Cricket_Player extends PlayerClass
{ 
 public void Cricket()
 {
  System.out.println("Cricket");
 }
}
class Football_Player extends PlayerClass
{ 
 public void Football()
 {
  System.out.println("Football");
 }
}
class Hockey_Player extends PlayerClass
{ 
 public void Hockey()
 {
  System.out.println("Hockey");
  System.out.println("Dhyan Chand");
  System.out.println("Goal 7");
  }
}
class Player
{
 public static void main(String args[])
 {
  Cricket_Player obj1=new Cricket_Player();
  Football_Player obj2=new Football_Player();
  Hockey_Player obj3=new Hockey_Player();
  obj3.Player_Information();
  obj1.Cricket();
  obj2.Football();
  obj3.Hockey();
 }
}  
