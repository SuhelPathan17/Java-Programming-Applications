import java.util.*;


class StringX
{
    public String s1;
    public char ch;

    public StringX(String s, char c)
    {
        s1= s;
        ch = c;
    }

    public int CountCap()
    {
        int i = 0;
        int iCnt = 0;
        for(i = 0; i<s1.length();i++)
        {
            if(s1.charAt(i) == ch)
            {
                iCnt++;
            }
        }
        return iCnt;
    }
}

class Program143
{
    public static void main(String arg[])
    {
        String str = null;
        int iRet = 0;
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        System.out.println("Enter character");
        cValue = sobj.next().charAt(0);

        StringX obj = new StringX(str,cValue);
        iRet = obj.CountCap();
        System.out.println("Count of character in string are : "+iRet); 
    }
}
