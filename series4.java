//S=2+5+10+17+25+....n
import java.util.Scanner;
class series4
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
        int x=1;
        int sum=0;
        for(int i=x;i<=n;i++)
        {
            sum= sum+((i*i)+1);
        }
        System.out.println("The sum is:"+sum);
    }
    public static void main()
    {
        series4 s = new series4();
        s.getData();
        s.computeSum();
    }
} 