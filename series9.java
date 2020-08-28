import java.util.Scanner;
class series9
{
    int num;
    void getData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
    }
    void digitCount()
    {
        int n= num;//preserved copy
        int digit=0;
        int sum=0;
        while(n!=0)
        {
            digit=n%10;
            sum= sum+digit;
            n=n/10;
        }
        System.out.println("The sum of series is:"+sum);
    }
    public static void main()
    {
        series9 s = new series9();
        s.getData();
        s.digitCount();
    }
}
//WAP to find the prod of digits
//WAP to find sum of digit
//WAP to find average of the num
//WAP to find square of digits of number
//WAP to find if number is armstrong or not