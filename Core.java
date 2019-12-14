import java.util.Scanner;

class Core
{
    public Boolean wantsToDie;

    public void Run()
    {
        Scanner scan = new Scanner(System.in);
        Player player1 = new Player();
        System.out.println();
        wantsToDie = false;
        while (wantsToDie == false)
        {
            String[] inp = scan.next().toLowerCase().split(" ");
            if (inp[0].equals("go") || inp[0].equals("g"))
            {
                // player1.move(inp[1]);
                // see if we can move to inp[1]
            } else if (inp[0].equals("grab"))
            {
                // player1.grab(inp[1]);
            } else if (inp[0].equals("look"))
            {
                for (int i = 0; i < inp.length; i++)
                {
                    if (inp[i].equals("asdf"))
                    {

                    }
                }
            } else if (inp[0].equals("quit"))
            {
                scan.close();
                wantsToDie = true;
            }
        }
    }
}