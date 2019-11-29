public class Item 
{
    private String name;
    private String itemID;
    private String desc;
    private double weight;
    private double size;

    public Item(String name, String itemID, String desc, double weight, double size)
    {
        this.name = name;
        this.itemID = itemID;
        this.desc = desc;
        this.weight = weight;
        this.size = weight;
    }

    /**
     * accessors
     */
    public String getName() { return name; }
    public String getItemID() { return itemID; }
    public String getDesc() { return desc; }
    public double getWeight() { return weight; }
    public double getSize() { return size; }

}
