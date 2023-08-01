
import java.util.*; 

class Arithmatic
{
    public int iNo1;
    public int iNo2;
    public int iNo3;
    public int iNo4;
    public int iNo5;
    public int iSum;

    public Arithmatic()
    {
        iNo1 = 1;
        iNo2 = 2;
        iNo3 = 3;
        iNo4 = 4;
        iNo5 = 5;
        iSum = 0;
    }

    public int Summation()
    {

        iSum = iNo1 + iNo2 + iNo3 + iNo4 + iNo5;
    
        return iSum;
        
    }

}
class Program25
{
    public static void main(String ar[])
    {
        int iRet = 0;
        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Summation();
        System.out.println("Summation is : "+iRet);
    }
}