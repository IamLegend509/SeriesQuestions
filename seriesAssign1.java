import java.util.Scanner;
class seriesAssign1
{
    double series(double n)
    {
        double sum=0;
        for(int i= 1;i<=n;i++)
        {
            sum = sum+ 1/i;
        }
        return sum;
    }
    double series(double n,double a)
    {
        double sum=0;
        for(int i=2;i<=n;i+=3)
        {
            sum = sum + ((3 * i + 1.0) / Math.pow(a, 3 * i + 2));
        }
        return sum;
    }
    public static void main(double x, double z)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value n");
        x=sc.nextInt();
        System.out.println("Enter the value a");
        z=sc.nextInt();
        seriesAssign1 obj= new seriesAssign1();
        obj.series(x);
        obj.series(x,z);
    }
}