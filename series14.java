//WAP to find the prod of digits
import java.util.Scanner;
class series14
{
    int n;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
    }
    void getProd() 
    { 
        int product = 1; 
        while (n != 0) 
        { 
            product= product*(n%10); 
            n= n/10; 
        }
        System.out.println(product);
    } 
    public static void main()
    {
        series14 s = new series14();
        s.input();
        s.getProd();
    }
}