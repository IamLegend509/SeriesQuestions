//S=1-2+3-4+...n
import java.util.Scanner;
class series6
{
    int n;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        n=sc.nextInt();
    }
    void computeData()
    {
        int s=0;
        for(int i=0;i<=n;i++)
        {
            if (i%2!=0)
                s=s+i;
            else
                s=s-i;
        }
    }
    public static void main()
    {
        series6 s = new series6();
        s.getData();
        s.computeData();
    }
}