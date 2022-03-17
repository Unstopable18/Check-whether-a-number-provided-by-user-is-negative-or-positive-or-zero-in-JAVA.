import java.util.Scanner;
public class pvnv 
{
    public static void main(String[] args) 
    {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n********************");
        System.out.print("Enter Number:");
        num = scanner.nextInt();
        System.out.println("********************");
        if(num > 0)
        {
            System.out.println(num+" is Positive");
        }
        else if(num < 0)
        {
            System.out.println(num+" is Negative");
        }
        else
        {
            System.out.println(num+" is Zero");
        }
        System.out.println("********************");
    }   
}
