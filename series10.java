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
}
//WAP to accept a number from the user finf the:
//a. largest digit   b.smallest digit

//WAP to convert a binar number to decimal number
// wap to find whether or not the number entered by the user is an automorphic number.
//WAP to input a number and display sum of first and last digit only.
//WAP to display all the special numbers between 1 and 1000. Such numbers are also referred to as factorions.