// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public boolean ChkPallindrome()
    {
        int iDigit = 0;
        int iRev = 0;
        int iTemp = iValue;

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        for(iRev = 0; iValue != 0; iValue = iValue / 10)
        {
            iDigit = iValue % 10;
            iRev = (iRev*10) + iDigit;
            
        }

        return (iRev == iTemp);

    }
}

class Program63
{
    public static void main(String ar[])
    {
        int iNo = 0;
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        bRet = dobj.ChkPallindrome();
        if(bRet == true)
        {
            System.out.println(iNo+" is Pallindrome");
        }
        else
        {
            System.out.println(iNo+" is not Pallindrom");
        }

    }
}