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
    private HashMap<String, Item> equipped;
    private ArrayList<String> autists = new ArrayList<String>(10);

    /**
     * Constructer
     */
    public Player() 
    {
        inventory = new ArrayList<Item>();
        Item fists = new Item("fists", "0001", "Your hands count as weapons too, right?", 0.0, 0.0);
        equipped = new HashMap<String, Item>(7) {
			private static final long serialVersionUID = 1L;
			{
                put("Head", null);
                put("Chest", null);
                put("Arms", null);
                put("Legs", null);
                put("MainHand", fists);
                put("OffHand", null);
                put("Bag", null);
            }
        };
        autists.add("sam");
        Scanner scan = new Scanner(System.in);
        System.out.print("What's my name again?... ");
        playerName = scan.nextLine();
        scan.close();
        playerHealth = 100;
        playerHunger = 100;
        Random rand = new Random();
        stats = new HashMap<String, Integer>(8) {
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
     * simple mutators
     */
    public void setHealth(int i) { playerHealth = i; }
    public void setHunger(int i) { playerHunger = i; }

    /**
     * reduce players hunger/health by the given amount, minimum 0
     */
    public void reduceHunger(int i)
    {
        playerHunger -= i;
        if (playerHunger < 0)
        {
            playerHunger = 0;
        } 
    }
    public void reduceHealth(int i)
    {
        playerHealth -= i;
        if (playerHealth <= 0)
        {
            playerHealth = 0;
            System.out.println("Game Over");
            System.exit(0);
        }
    }

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

    /**
     * equip an item in your inventory to the character
     * @param item
     */
    public void equipItem(String position, Item it)
    {
        if (equipped.get(position) == null)
        {
            equipped.replace(position, it);
        } else {
            System.out.println(equipped.get(position).getName()+" has been moved to your inventory, and replaced with "+it.getName());
            inventory.add(equipped.replace(position, it));
        }
    }


}
