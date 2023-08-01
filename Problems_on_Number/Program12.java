import java.util.*;

class Arithmatic
{
    public int iValue1;
    public int iAns1;
    public int iAns2;

    public Arithmatic(int i)
    {
        iValue1 = i;
    }

    public boolean DivisibleByFiveAndThree()
    {
        iAns1 = iValue1 % 3;
        iAns2 = iValue1 % 5;
        if((iAns1 == 0) && (iAns2 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program12
{
    public static void main(String ar[])
    {
        int iNo1 = 0;
        boolean bRet = false;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();


        Arithmatic aobj = new Arithmatic(iNo1);
        bRet = aobj.DivisibleByFiveAndThree();
        if(bRet == true)
        {
            System.out.println(iNo1+" is Divisible by five and three");
        }
        else
        {
            System.out.println(iNo1+" is not Divisible by five and three");
        }

    }
}