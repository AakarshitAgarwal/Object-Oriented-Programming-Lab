import java.util.*;
class Student2{
 public static void main(String args[]){
 int arr[]=new int[10];
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter 10 student marks");
 for(int i=0;i<10;i++){
 arr[i]=sc.nextInt();
 }
 for(int i=0;i<arr.length;i++)
 { 
  for(int j=i+1;j<arr.length;j++)
   {
     if(arr[i] > arr[j])
      { 
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp; 
      }
   }
 }
  int n=arr.length;
  System.out.println("Marks of students are:");
 for(int i=0;i<n;i++){
  System.out.print(arr[i]+","); 
  }
  System.out.print(arr[n-1]);
 }
} 
 /*if(arr[i]>=40 && arr[i]<=50){
 System.out.println("PASS");
 }
 else if(arr[i]>=51 && arr[i]<=75){
 System.out.println("MERIT");
 }
 else{
 System.out.println("DISTINCTION");
 }*/
 