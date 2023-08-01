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
        int iDigit = 0;
        int iSum = 0;

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            iSum = iSum + iDigit;
            iValue = iValue / 10;
        }

        return iSum;
    }
}

class Program52
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