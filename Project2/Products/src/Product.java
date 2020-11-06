public class Product {
    private String ID;
    private String name;
    private int inventory;

    /**
     * Make a product.
     * @param ID
     * @param name
     * @param inventory
     */
    Product(String ID, String name, int inventory){
        this.ID = ID;
        this.inventory = inventory;
        this.name = name;
    }

    Product(){}


    /**
     * increase the inventory level of this product
     */
    void increaseQuantity(int quantity){
        if(quantity > 0) {
            inventory += quantity;
            System.out.println("the inventory quantity has increased by " + quantity + "， and the current inventory is " + inventory);
        }
    }


    /**
     *  sell a product.
     */
    void sellOne(){
        if (inventory > 0){
            inventory --;
        }else {
            System.out.println("insufficient stock!");
        }
    }

    /**
     * get parameters of the product.
     */
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public  int getInventory(){
        return  inventory;
    }

    /**
     * print details of the product.
     */
    public String toString(){
        System.out.println("the ID，name and inventory of the product is： " + ID +" "+ name + " "+" "+ inventory);
        return "yes";
    }



}
