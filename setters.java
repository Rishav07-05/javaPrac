class laptop {
    String brand;
    int price;

    laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
    
    void displayPreviousDetails() {
        System.out.println("Previous brand is: " + brand + " and previous price is: " + price);
    }

    void setPrice(int newPrice) {
        this.price = newPrice;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

}

public class setters {
    public static void main(String[] args) {
        laptop obj = new laptop("Dell", 50000);
        System.out.println("Before modification: ");
        obj.displayPreviousDetails();

        obj.setPrice(10000);
        obj.setBrand("Infinix");

        System.out.println("After modification: " );
        
        obj.displayPreviousDetails();
    }
}
