package edu.oit.lesson8;

import java.util.HashMap;
import java.util.Map.Entry;

public class TaobaoAccount {
    private String id;
    private HashMap<Product, Integer> products = new HashMap<>();
    private double totalAmount = 0;

    public static void main(String[] args) {
        TaobaoAccount ming = new TaobaoAccount("Ming");
        Product pencil = new Pencil();
        Product notebook = new Notebook();
        Product postcard = new Postcard();
        Product deskCalendar = new DeskCalendar();
        
        ming.addToCart(pencil, 4);
        ming.addToCart(notebook, 2);
        ming.addToCart(postcard, 3);
        ming.addToCart(deskCalendar, 1);
        
        System.out.println("Ming's shopping cart contains:");
        for(Entry<Product, Integer> entry : ming.getProducts().entrySet()) {
            System.out.printf("  %-15s %s %d\n", entry.getKey().getName() + ":", entry.getKey().getPrice() + " * ", entry.getValue());
        }
        System.out.println("The total amount of Ming's shopping cart is " + ming.getTotalAmount() + ".");
    }
    
    public TaobaoAccount(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void addToCart(Product product, Integer number) {
        this.products.put(product, number);
        this.totalAmount += product.getPrice() * number;
    }

}
abstract class Product {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract double getPrice();
    public abstract void setPrice(double price);
}

class Pencil extends Product {
    private String name = "pencil";
    private double price = 1.50;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Notebook extends Product {
    private String name = "notebook";
    private double price = 5.00;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class Postcard extends Product {
    private String name = "postcard";
    private double price = 1.00;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}

class DeskCalendar extends Product {
    private String name = "desk calendar";
    private double price = 3.00;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}