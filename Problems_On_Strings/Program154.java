import java.util.*;


class StringX
{
    public String s1;

    public StringX(String s)
    {
        s1 = s;
    }

    public int CountSpace()
    {
        int i = 0;
        int iCnt = 0;
        for(i = 0; i<s1.length(); i++)
        {
            if(s1.charAt(i) == ' ' )
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program154
{
    public static void main(String arg[])
    {
        String str = null;
        int ret = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        StringX obj = new StringX(str);
        ret = obj.CountSpace();
        System.out.println("Count of spaces is : "+ret);
        
    }
}
