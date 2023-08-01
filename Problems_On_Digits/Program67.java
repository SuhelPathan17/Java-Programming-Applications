// Template

import java.util.*;

class Digits
{
    
    public int iValue;

    public Digits(int i)
    {
        iValue = i;
    }

    public int MinDigit()
    {
        int iDigit = 0;
        int iMin = 9;

        if(iValue < 0)   // updater
        {
            iValue = -iValue;
        }

        while(iValue != 0)
        {
            iDigit = iValue % 10;
            if(iDigit < iMin)
            {
                iMin = iDigit;
            }
            if(iMin == 0)
            {
                break;
            }
            iValue = iValue / 10;
        }
        return iMin;


    }
}

class Program67
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number :");
        iNo = sobj.nextInt();

        Digits dobj = new Digits(iNo);
        iRet = dobj.MinDigit();
        System.out.println("Min Digit is : "+iRet);
        

    }
}