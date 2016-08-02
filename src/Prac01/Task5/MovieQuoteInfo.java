public class MovieQuoteInfo
{
    public static void main(String[] args)
    {
        int count=4;
        String[] myMovie = new String[count];

        myMovie[0]="Ill Be Back!";
        myMovie[1]="The Terminator";
        myMovie[2]="T800";
        myMovie[3]="1984";
        for(int i=0; i<count; i++)
        {
            System.out.println(myMovie[i]);
        }
    }
}