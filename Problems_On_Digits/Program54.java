// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int SumDigits()
    {
        int iSum = 0;

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        while(iValue != 0)
        {
            iSum = iSum + (iValue % 10);
            iValue /= 10;
        }

        return iSum;
    }
}

class Program54
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.SumDigits();
        System.out.println("Summation of Digits are : "+iRet);

    }
}