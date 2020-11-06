import jdk.jshell.SourceCodeAnalysis;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class StockDemo {
    public static void main(String[] args){
        StockManager products = new StockManager();
        String ID;
        String name;
        int inventory;
        Scanner scanner = new Scanner(System.in);

        System.out.print("------**** Welcome to use the stock demo ****------");
        while (true){
            System.out.println();
            System.out.println("Select the method you want to work with");
            System.out.println("1、addProduct");
            System.out.println("2、printProductDetails");
            System.out.println("3、findProduct");
            System.out.println("4、numberInStock");
            System.out.println("5、delivery");
            System.out.println("6、sellProducts");
            System.out.println("7、printLowStockProducts");
            System.out.println("8、findProductByName");
            System.out.println("0、exit");
            int input =scanner.nextInt();
            scanner.nextLine();

            if(input == 1){
                System.out.print("please enter the ID of the product:");
                ID = scanner.nextLine();
                System.out.print("please enter the name of the product:");
                name = scanner.nextLine();
                System.out.print("please enter the inventory of the product:");
                inventory =scanner.nextInt();
                Product product = new Product(ID, name, inventory);
                products.addProduct(product);

            }else if (input == 2){
                products.printProductDetails();
            }else if (input == 3 || input == 4 || input == 5 || input == 6){
                System.out.print("please enter the ID of the product you want:");
                ID = scanner.nextLine();
                Product product = new Product ();
                if(input == 3 && (product = products.findProduct(ID))!= null ){
                    product.toString();
                }else if(input == 4 && (inventory = products.numberInStock(ID))!= 0 ){
                    System.out.println("tne inventory pf the product you want is " + inventory);
                }else if(input == 5 ){
                    System.out.print("please enter the quantity you want to increase:");
                    inventory = scanner.nextInt();
                    products.delivery(ID, inventory);
                }else if(input == 6){
                    System.out.print("Please enter the  quantity  you want to sell:");
                    inventory = scanner.nextInt();
                    products.sellProducts(ID,inventory);
                }else {
                    System.out.println("the product you are looking for does not exist!");
                }
            }else if(input == 7){
                System.out.print("please enter the highest rating:");
                inventory = scanner.nextInt();
                products.printLowStockProducts(inventory);
            }else if(input == 8){
                System.out.print("please enter the name of the product you want to find:");
                name = scanner.nextLine();
                Product product = new Product ();
                if((product = products.findProductByName(name))!=null){
                    product.toString();
                }else {
                    System.out.println("the product you are looking for does not exist!");
                }
            }else if(input == 0){
                System.out.println("------**** Thank you for using the stock demo ****------");
                System.exit(0);
            }else{
                System.out.println("please enter the correct option!");
            }

        }
    }



}
