import java.util.*;

class Program125
{
    public static void main(String arg[])
    {
        int i = 0;
        System.out.println(" ASCII TABLE ");
        System.out.print("Decimal Number\t Character value\n");
        for(i = 0; i<=127; i++)
        {
            System.out.println(i+"\t"+(char)i);
        }
    }
}