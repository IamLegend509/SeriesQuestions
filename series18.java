//WAP to find square of digits of number
import java.util.Scanner;
class series18
{
   int n;
   void input()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr the number");
       n=sc.nextInt();
   }
   void getSquare()
   {
       while(n!=0)
       {
          int count= 1;
          double prod=1;
          while (count!=0)
          {
              int c=n;
              double rem=0;
              rem=c%10;
              prod= Math.pow(rem,2);
              count--;
          }
          System.out.println(prod);
          n=n/10;
       }
   }
}