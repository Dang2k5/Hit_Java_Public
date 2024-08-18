package Bai2;

public abstract class Product {
    protected String id;
    protected String name;
    protected  double price;
    protected int total;
    public abstract double getTotalPrice();


    public Product(String id, String name, double price, int total) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void printData(){
        System.out.printf("%-15s %-15s %-15.4f %-15d", id, name, price, total);
    }
}
