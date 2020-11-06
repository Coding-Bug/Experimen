import java.util.ArrayDeque;
import java.util.ArrayList;

public class StockManager {
        private ArrayList<Product> products = new ArrayList<>();

    /**
     * add a product, only when the ID of the new product is not the same as the ID of the existing product list can add the product.
     * @param
     */
    public void addProduct(Product product){
        if(product.getInventory()< 0 ){
         System.out.println("inventory has to be positive!");
        }
        for( Product product1 : products) {
            if(product1.getID().equals(product.getID())){
                System.out.println("the product for that ID already exists!");
                return;
            }
        }
        products.add(product);
        System.out.println("successfully add a product!");
    }

    /**
     * print out the details of all products
     */
    public void printProductDetails(){
         for( Product product : products) {
             product.toString();
         }
    }

    /**
     * search the container for the product with an ID that matches its parameter ID
     * @param ID
     * @return
     */
    public Product findProduct( String ID){
        for( Product product : products) {
            if(ID.equals(product.getID())){
                return product;
            }
        }
        return null;
    }


    /**
     * find the product with a matching ID in the container, and then return the current number of that product.
     * if the product with an ID matching is not found, 0 is returned
     * @param ID
     * @return
     */
    public int numberInStock(String ID){
        for( Product product : products) {
            if(ID.equals(product.getID())){
                return product.getInventory();
            }
        }
        return 0;
    }

    /**
     * finds the product based on the given ID and increase the specified amount of stock for the product.
     * @param ID
     * @param quantity
     */
    public void delivery(String ID , int quantity) {
        if (quantity < 0) {
            System.out.println("quantity has to be positive!");
        } else {
            for (Product product : products) {
                if (ID.equals(product.getID())) {
                    product.increaseQuantity(quantity);
                    return;
                }
            }
            System.out.println("the product you are looking for does not exist!");
        }
    }

    /**
     * finds the product based on the given ID and sell the specified amount of stock for the product
     */
    public void sellProducts(String ID , int quantity){
        if (quantity < 0) {
            System.out.println("quantity has to be positive!");
            return;
        }
        for (Product product : products) {
            if (ID.equals(product.getID())) {
                if(quantity > product.getInventory()){
                    System.out.println("there are not enough products to sell!");
                    return;
                }
                for(int i = 0; i < quantity; ++i ){
                    product.sellOne();
                }
                System.out.println("successfully sold " + quantity + " products, and now the inventory of products is " +  product.getInventory());
            }
        }
    }

    /**
         * prints out the details of all products whose quantity level is below a given value
         * @param quantity
         */
        public void printLowStockProducts ( int quantity){
            for (Product product : products) {
                if (product.getInventory() < quantity) {
                    product.toString();
                }
            }
        }

        /**
         * searches the container for a match based on the name of the product.
         * @param name
         * @return
         */
        public Product findProductByName (String name){
            for (Product product : products) {
                if (name.equals(product.getName())) {
                    return product;
                }
            }
            return null;
        }


}
