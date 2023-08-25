import java.util.*;


class StringX
{
    public char ch;

    public StringX(char c)
    {
        ch = c;
    }

    public char CharToggleX()
    {
        if((ch >= 'A') && (ch <= 'Z'))
        {
            return (char)(ch+32);
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            return (char)(ch-32);
        }
        else
        {
            return (char)ch;
        }
    }
}

class Program150
{
    public static void main(String arg[])
    {
        char cValue = '\0';
        char cRet = '\0';

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter Character");
        cValue = sobj.next().charAt(0);

        StringX obj = new StringX(cValue);
        cRet = obj.CharToggleX();

        System.out.println("Character after toggle is : "+cRet);
        
    }
}
