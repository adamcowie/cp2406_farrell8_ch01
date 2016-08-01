public class TableAndChairs
{
    private int count=4;
    private String[] tableChairs = new String[count];
    public static void main(String[] args)
    {
        tableChairs[0]="X                      X";
        tableChairs[1]="X      XXXXXXXXXX      X";
        tableChairs[2]="XXXXX  X        X  XXXXX";
        tableChairs[3]="X   X  X        X  X   X";
        for(int i=1; i<6; i++)
        {
            if (i<2){System.out.println(tableChairs[0]);}
            if (i==3){System.out.println(tableChairs[1]);}
            if (i==4){System.out.println(tableChairs[2]);}
            if (i>4){System.out.println(tableChairs[3]);}
        }
    }
}