import java.util.*;


class Arithematic
{
    public int iSize;
    public int Arr[];
    public Scanner sobj;
    int iValue;

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
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements from array are:");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

}

class Marvellous extends Arithematic
{
    public Marvellous(int k)
    {
        super(k);
        
    }
    public int Minimum()
    {
        int iMin = Arr[0]; 
        int iCnt = 0;

        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt]<iMin)
            {
                iMin = Arr[iCnt];
            }
        }
        return iMin;

    }
}
class Program203
{
    public static void main(String ar[])
    {
        int iSize = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the Size:");
        iSize = sobj.nextInt();

        Marvellous mobj = new Marvellous(iSize);
        mobj.Accept();
        mobj.Display();
        iRet = mobj.Minimum();
        System.out.println("Smallest element is: "+iRet);
        
        
    }
}