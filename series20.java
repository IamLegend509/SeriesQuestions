//WAP to input a number and display sum of first and last digit only.
import java.util.Scanner;
class series20
{
     public static void main(String[] args) 
	{
	   Scanner sc= new Scanner(System.in);
	   int num, first_digit, last_digit;
	   System.out.print(" Please Enter any Number that you wish : ");
	   num = sc.nextInt();	
	   first_digit = num;
	   while(first_digit >= 10)
	   {
			first_digit = first_digit / 10;
           }
	   last_digit = num % 10;	
	   System.out.println("\n The First Digit of a Given Number " + num + "  =  " + first_digit);
	   System.out.println("\n The Last Digit of a Given Number " + num + "  =  " + last_digit);
	}
}