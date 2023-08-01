import java.util.*;


class Program6
{
    public static void main(String ar[])
    {
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        iNo2 = sobj.nextInt();

        iAns = iNo1 * iNo2;
        
        System.out.println("Multiplication is :"+iAns);
        

    }
}