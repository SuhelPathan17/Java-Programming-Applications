import java.util.*;

class Arithmatic
{
    public int iValue1;
    public int iAns;

    public Arithmatic(int i)
    {
        iValue1 = i;
    }

    public boolean DivisibleByFive()
    {
        iAns = iValue1 % 5;
        if(iAns != 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program10
{
    public static void main(String ar[])
    {
        int iNo1 = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();


        Arithmatic aobj = new Arithmatic(iNo1);
        bRet = aobj.DivisibleByFive();
        if(bRet == true)
        {
            System.out.println(iNo1+" is Divisible by five");
        }
        else
        {
            System.out.println(iNo1+" is not Divisible by five");
        }

    }
}