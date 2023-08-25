import java.util.*;

class Characters
{
    public char ch;

    public Characters(char c)
    {
        ch = c;
    }

    public boolean IsCapitalX()
    {
        if(ch >= 65 && ch <= 90)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program129
{
    public static void main(String arg[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter character");
        cValue = sobj.next().charAt(0);

        Characters cobj = new Characters(cValue);
        bRet = cobj.IsCapitalX();
        if(bRet == true)
        {
            System.out.println("It is a Capital Character");
        }
        else
        {
            System.out.println("It is not a Capital Character");
        }
    }
}