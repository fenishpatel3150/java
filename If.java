import java.util.Scanner;

public class If
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        byte one;
        System.out.print("Enter the number A:");
        one = input.nextByte();

        if(one>0)
        {
            System.out.print("value is positive");
        } else if (one<0)
        {
            System.out.print("value is negative ");
        }else
        {
            System.out.print("value is natural ");
        }

    }

}
