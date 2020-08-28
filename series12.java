import java.util.Scanner;
class series12//Buzz and GCD
{
    void generateMenu()
    {
        System.out.println("What would you like to do ?");
        System.out.println("1. Check if number is a Buzz number");
        System.out.println("2. Find GCD of 2 numbers");
    }
    void BuzzNum()
    {
        Scanner sc = new Scanner(System.in);
       int num;
       System.out.println("Enter the number");
       num=sc.nextInt();
       if (num % 10 == 7 || num % 7 == 0) 
       {		
         System.out.println("Entered number " + num + " is a Buzz number.");		
        }
	else 
	{
          System.out.println("Entered number " + num + " is not a Buzz number.");		
	}
    }
    void GCD()
    {
        int num1, num2;
        int hcf=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        num1=sc.nextInt();
        System.out.println("Enter the second number");
        num2=sc.nextInt();
        for(int i=1;i<=num1;i++)
        {
            if(num1%i==0 && num2%i==0)
               hcf=i;
        }
        System.out.println("The GCD is"+hcf);
    }
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        series12 obj= new series12();
        char choice;
        int opt;
        do
        {
           obj.generateMenu();
           System.out.println("Enter your selection[1/2]");
           opt=sc.nextInt();
           if(opt==1)
            obj.BuzzNum();
           else if(opt==2) 
            obj.GCD();
           else
            return;
           System.out.println("Would you like to continue[y/n]"); 
           choice=(sc.next()).charAt(0);
        } while(choice=='y');
    }
}