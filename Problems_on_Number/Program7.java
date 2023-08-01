import java.util.*;

class Arithmatic
{
    public int iValue1;
    public int iValue2;

    public Arithmatic(int i, int j)
    {
        
        iValue1 = i;
        iValue2 = j;
    }

    public int Multiplication()
    {
        return iValue1*iValue2;
    }
}

class Program7
{
    public static void main(String ar[])
    {
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter First Number :");
        iNo1 = sobj.nextInt();

        System.out.println("Enter Second Number :");
        iNo2 = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo1, iNo2);
        iAns = aobj.Multiplication();
        System.out.println("Multiplication is : "+iAns);

    }
}