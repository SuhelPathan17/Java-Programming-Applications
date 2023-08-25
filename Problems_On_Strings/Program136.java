import java.util.*;


class StringX
{
    public char Arr[];

    public StringX(String s)
    {
        Arr = s.toCharArray();
    }

    public int StrlenX()
    {
        int iLength = Arr.length;
        return iLength;
    }
}

class Program136
{
    public static void main(String arg[])
    {
        String str = null;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        StringX obj = new StringX(str);
        iRet = obj.StrlenX();
        System.out.println("Length of string is : "+iRet); 
    }
}
