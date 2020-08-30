//WAP to accept a number from the user find the: a. largest digit b.smallest digit
import java.util.Scanner;
class series13
{
    int n;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        n =sc.nextInt();
        System.out.println("The original number is"+ n);
    }
    void Digits() 
    { 
       int largest = 0; 
       int smallest = 9; 
       while(n != 0)  
       { 
        int r = n % 10;
        largest = Math.max(r, largest); 
        smallest = Math.min(r, smallest); 
        n = n / 10; 
       } 
       System.out.println(largest + " " + smallest); 
    } 
    public static void main()
    {
        series13 s = new series13();
        s.input();
        s.Digits();
    }
}