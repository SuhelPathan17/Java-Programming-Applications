import java.util.*;

class Pattern
{
    public int iValue;

    public Pattern(int i)
    {
        iValue = i;
    }

    public void DisplayPattern()
    {
        int iCnt = 0;

        if(iValue < 0)
        {
            iValue = -iValue;
        }
        for(iCnt = 1; iCnt <=iValue; iCnt++)
        {
            System.out.print("*\t");
        }
        System.out.print("\n");
    }
}

class Program89
{
    public static void main(String ar[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Number:");
        iNo = sobj.nextInt();

        Pattern pobj = new Pattern(iNo);
        pobj.DisplayPattern();
    }
}