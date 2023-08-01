import java.util.*;

class Arithmatic
{
    public int iValue1;

    public Arithmatic(int i)
    {
        iValue1 = i;
    }

    public int DivisibleByFive()
    {
        if(iValue1 % 5 == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class Program8
{
    public static void main(String ar[])
    {
        int iNo1 = 0, iAns = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();


        Arithmatic aobj = new Arithmatic(iNo1);
        iAns = aobj.DivisibleByFive();
        if(iAns == 1)
        {
            System.out.println(iNo1+" is Divisible by five");
        }
        else
        {
            System.out.println(iNo1+" is not Divisible by five");
        }

    }
}