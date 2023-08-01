
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    public int SumNonFactors(int iValue)
    {
        int iCnt = 0;
        int iSum = 0;

        for(iCnt = 1; iCnt<iValue; iCnt++)
        {
            if((iValue % iCnt) != 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return iSum;
        
    }

}
class Program37
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        iRet = aobj.SumNonFactors(iNo);
        System.out.println("Summation of Non-factors is : "+iRet);
        
    }
}