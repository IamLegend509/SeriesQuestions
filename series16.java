//WAP to find average of the digits
import java.util.Scanner;
class series16
{
   int n;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr the number");
       n=sc.nextInt();
   }
   void getAvg()
   {
       int sum=0;
       int c=n; int rem;
       int count=0;
       while(c!=0)
       {
         rem=c%10;
         sum=sum+rem;
         c=c/10;
         count++;
       }
       int avg= sum/count;
   }
   public static void main()
   {
       series16 s= new series16();
       s.input();
       s.getAvg();
    }
}