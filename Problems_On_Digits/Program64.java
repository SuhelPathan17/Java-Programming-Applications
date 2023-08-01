// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int MaxDigit()
    {
        int iDigit = 0;
        int iMax = 0;

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            if(iDigit > iMax)
            {
                iMax = iDigit;
            }
            iValue = iValue / 10;
        }
        return iMax;


    }
}

class Program64
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.MaxDigit();
        System.out.println("Max Digit is : "+iRet);
        

    }
}