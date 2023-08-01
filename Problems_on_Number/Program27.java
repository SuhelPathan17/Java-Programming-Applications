
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

        iSum = iSum + 1;
        iSum = iSum + 2;
        iSum = iSum + 3;
        iSum = iSum + 4;
        iSum = iSum + 5;

        return iSum;
        
    }

}
class Program27
{
    public static void main(String ar[])
    {
        int iRet = 0;
        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Summation();
        System.out.println("Summation is : "+iRet);
    }
}