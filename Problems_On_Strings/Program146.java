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

    public boolean CountCap()
    {
        int i = 0;
        boolean bflag = false;
        for(i = 0; i<s1.length();i++)
        {
            if(s1.charAt(i) == ch)
            {
                break;
            }
        }
        if(i == s1.length())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}

class Program146
{
    public static void main(String arg[])
    {
        String str = null;
        boolean bRet = false;
        char cValue = '\0';

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        System.out.println("Enter character");
        cValue = sobj.next().charAt(0);

        StringX obj = new StringX(str,cValue);
        bRet = obj.CountCap();
        if(bRet == true)
        {
            System.out.println("Character is present in the string");
        } 
        else
        {
            System.out.println("Character is not present in the string");
        }
    }
}
