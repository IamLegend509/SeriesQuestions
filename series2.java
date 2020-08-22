import java.util.Scanner;
//s=x+x^2+x^3....+x^n
class series2
{
    int n;double x;
    void getdata()
    {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in  the series");
        n=sc.nextInt();
    }
    void getData2()
    {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter the base value");
        x= c.nextInt();
    }
    void computeData()
    {
        double sum=1;
        for(double i=1; i<=n;i++)
        {
            //x = Math.pow(x,i);
            sum= sum+Math.pow(x,i);
        }
        System.out.println("The sum of this series="+sum);
    }
    public static void main()
    {
        series2 s = new series2();
        s.getdata();
        s.getData2();
        s.computeData();
    }
}
        