
import java.util.*; 

class Arithmatic
{
    public int iSum;

    public Arithmatic()
    {
        iSum = 0;
    }

    public int Summation(int iValue)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iSum = iSum + iCnt;
        }
        return iSum;
        
    }

}
class Program29
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Summation(iNo);
        System.out.println("Summation is : "+iRet);
    }
}