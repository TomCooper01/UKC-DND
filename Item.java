public class Item 
{
    private String name;
    private String itemID;
    private double weight;
    private double size;

    public Item(String name, String itemID, double weight, double size)
    {
        this.name = name;
        this.itemID = itemID;
        this.weight = weight;
        this.size = weight;
    }

    public String getName() { return name; }

    public String getItemID() { return itemID; }

    public double getWeight() { return weight; }

    public double getSize() { return size; }

}
