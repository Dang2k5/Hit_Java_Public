package Bai2;

public class Mobile extends Product{
    private String manufacturer;
    private String ram;


    public Mobile(String id, String name, double price, int total, String manufacturer, String ram) {
        super(id, name, price, total);
        this.manufacturer = manufacturer;
        this.ram = ram;
    }

    @Override
    public double getTotalPrice() {
        return (total * price) * 120/100;
    }
    @Override
    public void printData(){
        super.printData();
        System.out.printf("%-15s %-15s %-15.4f%n", manufacturer, ram, getTotalPrice());
    }
    public static void printTittle(){
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s%n", "Id", "Name", "Price", "Total", "Manufacturer", "Ram", "TotalPrice");
    }
}
