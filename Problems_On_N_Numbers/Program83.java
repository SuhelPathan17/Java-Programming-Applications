import java.util.*;

class Arithematic
{
    public int iSize;;
    public int Arr[];
    public Scanner sobj;

    public Arithematic(int i)
    {
        iSize = i;
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

    public void Display()
    {
        int iCnt = 0;
        System.out.println("elements from array are :");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

    public int Minimum()
    {
        int iCnt = 0;
        int iMin = Arr[0];
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;
    }
}

class Program83
{
    public static void main(String ar[])
    {
        int iLength = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the Length of array:");
        iLength = sobj.nextInt();

        Arithematic aobj = new Arithematic(iLength);
        aobj.Accept();
        aobj.Display();

        iRet = aobj.Minimum();
        System.out.println("Minimum no. is : "+iRet);
    }
}