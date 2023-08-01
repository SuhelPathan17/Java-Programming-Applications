
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    public int SumFactors(int iValue)
    {
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 1; iCnt <= (iValue/2); iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
        
    }

    public boolean CheckPerfect(int iValue)
    {
        int iTemp = SumFactors(iValue);
        if(iTemp == iValue)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}
class Program34
{
    public static void main(String ar[])
    {
        int iNo = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        bRet = aobj.CheckPerfect(iNo);
        if(bRet == true)
        {
            System.out.println(iNo+" is a perfect number");
        }
        else
        {
            System.out.println(iNo+" is not a perfect number");
        }
    }
}