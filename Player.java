import java.util.*;

/**
 * The player character. One for each logged in player.
 */
public class Player 
{
    private String playerName;
    private int playerHealth;
    private int playerHunger;
    private HashMap<String, Integer> stats;
    private ArrayList<Item> inventory;
    private ArrayList<String> autists = new ArrayList<String>(10);

    public Player() 
    {
        autists.add("sam");
        Scanner scan = new Scanner(System.in);
        System.out.print("What's my name again?... ");
        playerName = scan.nextLine();
        scan.close();
        playerHealth = 100;
        playerHunger = 100;
        Random rand = new Random();
        stats = new HashMap<String, Integer>() {
			private static final long serialVersionUID = 1L;
			{
                put("Endurance", rand.nextInt(10));
                put("Strength", rand.nextInt(10));
                put("Agility", rand.nextInt(10));
                put("Autism", rand.nextInt(10));
                put("Aholeness", rand.nextInt(10));
                put("Coolness", rand.nextInt(10));
                put("Accuracy", rand.nextInt(10));
		        put("Gold", 100);
            }
        };
        if (autists.contains(playerName.toLowerCase())) {
            int aut = stats.get("Autism");
            stats.replace("Autism", aut+50);
        }
    }

    /**
     * accessors
     */
    public int getHealth() { return playerHealth; }

    public int getStat(String statName) { return stats.get(statName); }

    public String getName() { return playerName; }


    /**
     * print the names of all the items in the player inventory
     */
    public void printInv()
    {
        for (Item i : inventory)
        {
            System.out.println("    "+i.getName());
        }
    }

}
