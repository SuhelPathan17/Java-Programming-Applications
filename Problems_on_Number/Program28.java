
import java.util.*; 

class Arithmatic
{
    public int iSum;

    public Arithmatic()
    {
        iSum = 0;
    }

    public int Summation()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
        
    }

}
class Program28
{
    public static void main(String ar[])
    {
        int iRet = 0;
        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Summation();
        System.out.println("Summation is : "+iRet);
    }
}