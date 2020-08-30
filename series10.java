import java.util.Scanner;
class series10
{
    int num;
    void acceptNumber()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        num =sc.nextInt();
        System.out.println("The original number is"+ num);
    }
    void getReverse()
    {
        int n= num;
        int rem,rev=0;
        while(num!=10)
        {
         rem=n%10;
         rev=rev*10+rem;
         n=n/10;
        }
        System.out.println("The reverse number is:"+ rev);
    }
    public static void main()
    {
        series10 s = new series10();
        s.acceptNumber();
        s.getReverse();
    }
}
//WAP to find whether or not the number entered by the user is an automorphic number.
//WAP to display all the special numbers between 1 and 1000. Such numbers are also referred to as factorions.