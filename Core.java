import java.util.Scanner;

class Core
{
    static Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        Player player1 = new Player();
        System.out.println("BEEP BEEP BEEP...\n...Shit, I'm late again! I need to get dressed...\n");
        Boolean wantsToDie = false;
        while (wantsToDie == false)
        {
            String[] inp = scan.nextLine().toLowerCase().split(" ");
            if (inp[0] == "go" || inp[0] == "g")
            {
                // player1.move(inp[1]);
                // see if we can move to inp[1]
            } else if (inp[0] == "quit")
            {
                wantsToDie = true;
            }
        }
    }
}