import java.util.Scanner;
class oddfinder
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number ");
        int value = in.nextInt();
        if(value%2!=0)
        {
            System.out.println("ODD");
        }
        else
        {
            System.out.println("Even");
        }
    }
}