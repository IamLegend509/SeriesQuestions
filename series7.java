//S= 2!-4!+6!-8!+....n
import java.util.Scanner;
class series7
{
    int n;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        n=sc.nextInt();
    }
    int fact(int m)
    {
        int prod = 1;
        for (int i=1;i<=m;i++)
        {
            prod = prod*i;
        }
        return prod;
    }
    void computeSum()
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
          if(i%2==0)  
            sum=sum-fact(2*i);
          else
            sum= sum + fact(2*i) ;
        }
        System.out.println("The sum is: "+sum);
    }
    public static void main()
    {
        series7 s = new series7();
        s.getData();
        s.computeSum();
    }
}