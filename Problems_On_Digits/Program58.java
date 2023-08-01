// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int Reverse()
    {
        int iDigit = 0;
        int iRev = 0;

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iRev = (iRev*10) + iDigit;
            iValue = iValue / 10;
        }

        return iRev;

    }
}

class Program58
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.Reverse();
        System.out.println("Reverse of "+iNo+" is : "+iRet);

    }
}