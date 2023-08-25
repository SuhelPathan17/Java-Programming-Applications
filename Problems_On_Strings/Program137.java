import java.util.*;


class StringX
{
    public String s1;

    public StringX(String s)
    {
        s1= s;
    }

    public int StrlenX()
    {
        int iLength = s1.length();
        return iLength;
    }
}

class Program137
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
