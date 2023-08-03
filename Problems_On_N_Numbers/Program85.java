import java.util.*;

class Arithematic
{
    public int iSize;
    public int iValue;
    public int Arr[];
    public Scanner sobj;

    public Arithematic(int i, int j)
    {
        iSize = i;
        iValue = j;
        Arr = new int[iSize];
        sobj = new Scanner(System.in);
    }

    public void Accept()
    {
        int iCnt = 0;
        System.out.println("Enter the elements :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public int CheckLastOccurence()
    {
        int iCnt = 0;
        
        for(iCnt = Arr.length-1; iCnt >= 0; iCnt--)
        {
            if(Arr[iCnt] == iValue)
            {
                break;
            }
        }
        return iCnt;
    }

}

class Program85
{
    public static void main(String ar[])
    {
        int iLength = 0;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Length of array:");
        iLength = sobj.nextInt();

        System.out.println("Enter the number to check:");
        iNo = sobj.nextInt();

        Arithematic aobj = new Arithematic(iLength,iNo);
        aobj.Accept();
        iRet = aobj.CheckLastOccurence();
        System.out.println("Last occurence is at index : "+iRet);

    }
}