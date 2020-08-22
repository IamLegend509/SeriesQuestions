//s=1+(1+2)+(1+2+3)+...+(1+2+3+....+n).
import java.util.Scanner;
class series5
{
    int n;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        n=sc.nextInt();
    }
    void computeSum()
    {
        int sum=1;
        int x=1;
        for(int i=1;i<=n;i++)
        {
           x=x+1;
           sum= sum + x;
           System.out.println("The sum is:"+sum);
        }
    }
    public static void main()
    {
        series5 s = new series5();
        s.getData();
        s.computeSum();
    }
}