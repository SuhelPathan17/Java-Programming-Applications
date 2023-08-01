
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

}
class Program33
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        iRet = aobj.SumFactors(iNo);
        System.out.println("Summation of factors is : "+iRet);
    }
}