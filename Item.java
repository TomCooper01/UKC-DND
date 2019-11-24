class Item 
{
    private String name;
    private String itemID;
    private Float weight;
    private Float size;

    public Item(String name, String itemID, Float weight, Float size)
    {
        this.name = name;
        this.itemID = itemID;
        this.weight = weight;
        this.size = weight;
    }

    public String getName() { return name; }

    public String getItemID() { return itemID; }

    public Float getWeight() { return weight; }

    public Float getSize() { return size; }

}
