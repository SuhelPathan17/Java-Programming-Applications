
class Display
{
    public int iNo;
    public void Display()
    {
        int iCnt = 0;

        iCnt = 1;
        while(iCnt <= 5)
        {
            System.out.println("Jay Ganesh...");
            iCnt++;
        }
    }

}
class Program18
{
    public static void main(String ar[])
    {
        Display dobj = new Display();
        dobj.Display();
    }
}