//WAP to find sum of digit
import java.util.Scanner;
class series15
{
   int n;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr the number");
       n=sc.nextInt();
   }
   void getSum() 
   { 
        int sum= 1; 
        while (n!= 0) 
        { 
            sum= sum+(n % 10); 
            n= n/10; 
        }  
   } 
   public static void main()
   {
       series15 s= new series15();
       s.input();
       s.getSum();
    }
}