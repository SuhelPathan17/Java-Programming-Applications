import java.util.*;

class Arithmatic
{
    public int iValue1;
    public int iAns;

    public Arithmatic(int i)
    {
        iValue1 = i;
    }

    public int DivisibleByFive()
    {
        iAns = iValue1 % 5;
        if(iAns != 0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}

class Program9
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