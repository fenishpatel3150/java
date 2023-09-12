import java.util.Scanner;

public class nested {

    public static void main(String[] args) {

        short a=0;
        short b=1;

        Scanner input = new Scanner(System.in);
        System.out.println("enter the value :");
        short aShort = input.nextShort();
        System.out.println("enter the second value :");
        short bshort = input.nextShort();

        if(a>b)
        {
            System.out.println(" A is a maximum");
        } else
        {
            System.out.println("B is a maximum");
        }

    }
}
