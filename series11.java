//WAP to count the num of digits
import java.util.Scanner;
class series11
{
    int n;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
    }
    void calc()
    {
        int c=n;
        int count=0;
        while(c!=0)
        {
           c=c/10;
           count++;
        }
        System.out.println("The number of digits is:" +count);
    } 
    public static void main()
    {
        series11 s= new series11();
        s.input();
        s.calc();
    }
}