public class MovieQuoteInfo
{
    private int count=4;
    private String[] myMovie = new String[count];
    public static void main(String[] args)
    {
        myMovie[0]="Ill Be Back!";
        myMovie[1]="The Terminator";
        myMovie[2]="T800";
        myMovie[3]="1984";
        for(int i=1; i<count; i++)
        {
            System.out.println(myMovie[i]);
        }
    }
}