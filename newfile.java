import java.util.List;
import java.util.ArrayList;

// Base class for Shoe
class Shoe {
    private String brand;
    private double size;
    private double price;

    public Shoe(String brand, double size, double price) {
        this.brand = brand;
        this.size = size;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public double getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Size: " + size + ", Price: $" + price);
    }
}

// Derived class for SportShoe
class SportShoe extends Shoe {
    private String sportType;

    public SportShoe(String brand, double size, double price, String sportType) {
        super(brand, size, price);
        this.sportType = sportType;
    }

    public String getSportType() {
        return sportType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sport Type: " + sportType);
    }
}

// Derived class for FormalShoe
class FormalShoe extends Shoe {
    private String material;

    public FormalShoe(String brand, double size, double price, String material) {
        super(brand, size, price);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Material: " + material);
    }
}

// ShoeShop class to manage the inventory
class ShoeShop {
    private List<Shoe> inventory;

    public ShoeShop() {
        inventory = new ArrayList<>();
    }

    public void addShoe(Shoe shoe) {
        inventory.add(shoe);
    }

    public void displayInventory() {
        for (Shoe shoe : inventory) {
            shoe.displayInfo();
            System.out.println();
        }
    }

    public Shoe findShoeByBrand(String brand) {
        for (Shoe shoe : inventory) {
            if (shoe.getBrand().equalsIgnoreCase(brand)) {
                return shoe;
            }
        }
        return null;
    }
}

// Main class to run the program
public class ShoeShopProgram {
    public static void main(String[] args) {
        ShoeShop shop = new ShoeShop();

        SportShoe sportShoe1 = new SportShoe("Nike", 10, 150, "Running");
        SportShoe sportShoe2 = new SportShoe("Adidas", 9.5, 120, "Soccer");
        SportShoe sportShoe3 = new SportShoe("service", 9, 140, "Running");
        SportShoe sportShoe4 = new SportShoe("Puma", 8.5, 130, "Soccer");
        SportShoe sportShoe5 = new SportShoe("Reebok", 8, 110, "Nano(tranning)");
        SportShoe sportShoe6 = new SportShoe("Under Armour", 7.5, 170, "basketball");
        SportShoe sportShoe7 = new SportShoe("Asics", 7, 160, "Ds trainer");
        SportShoe sportShoe8 = new SportShoe("Mizuno", 6.5, 120, "Wave rider");
        SportShoe sportShoe9 = new SportShoe("Brooks", 6, 190, "Running");
        SportShoe sportShoe10 = new SportShoe("Altra", 5.5, 140, "Soccer");
        SportShoe sportShoe11 = new SportShoe("Hoka one one", 5, 155, "Running");
        SportShoe sportShoe12 = new SportShoe("Salomon", 11, 120, "Soccer");
        SportShoe sportShoe13 = new SportShoe("Skechers", 15, 170, "Running");
        SportShoe sportShoe14 = new SportShoe("Saucony", 14, 180, "Soccer");
        FormalShoe formalShoe1 = new FormalShoe("Allen Edmonds", 11, 200, "Exectives bussiness professional");
        FormalShoe formalShoe2 = new FormalShoe("Gucci", 10.5, 500, "Suede");
        FormalShoe formalShoe3 = new FormalShoe("Clarks", 10, 300, "Leather");
        FormalShoe formalShoe4 = new FormalShoe("Alden", 9.5, 900, "Craftmanship");
        FormalShoe formalShoe5 = new FormalShoe("Church's", 9, 200, "professional envoirnment");
        FormalShoe formalShoe6 = new FormalShoe("Crockett& Jones", 8.5, 400, "for formal event");
        FormalShoe formalShoe7 = new FormalShoe("Magganni", 8, 220, "fashion");
        FormalShoe formalShoe8 = new FormalShoe("Hugo Boss", 7.5, 100, "formal oaccasions");
        FormalShoe formalShoe9 = new FormalShoe("Salvatore Ferragamo   ", 7, 240, " high fashion");
        FormalShoe formalShoe10 = new FormalShoe("Prada", 12, 300, "Leather");
        FormalShoe formalShoe11 = new FormalShoe("Tod's", 12.5, 200, "Leather");
        FormalShoe formalShoe12 = new FormalShoe("Loake", 13, 550, "Suede");
        FormalShoe formalShoe13 = new FormalShoe("Cole Haan", 13.5, 260, "Leather");
        FormalShoe formalShoe14 = new FormalShoe("Johnston", 14, 750, "Suede");
        shop.addShoe(sportShoe1);
        shop.addShoe(sportShoe2);
         shop.addShoe(sportShoe3);
         shop.addShoe(sportShoe4);
         shop.addShoe(sportShoe5);
         shop.addShoe(sportShoe6);
         shop.addShoe(sportShoe7);
         shop.addShoe(sportShoe8);
         shop.addShoe(sportShoe9);
         shop.addShoe(sportShoe10);
         shop.addShoe(sportShoe11);
         shop.addShoe(sportShoe12);
        shop.addShoe(sportShoe13);
        shop.addShoe(sportShoe14);
        shop.addShoe(formalShoe1);
        shop.addShoe(formalShoe2); 
        shop.addShoe(formalShoe3);
        shop.addShoe(formalShoe4);
        shop.addShoe(formalShoe5);
        shop.addShoe(formalShoe6);
        shop.addShoe(formalShoe7);
        shop.addShoe(formalShoe8);
        shop.addShoe(formalShoe9);
        shop.addShoe(formalShoe10);
        shop.addShoe(formalShoe11); 
        shop.addShoe(formalShoe12);
        shop.addShoe(formalShoe13);
        shop.addShoe(formalShoe14);
        System.out.println("Inventory:");
        shop.displayInventory();

        System.out.println("Searching for Nike shoes:");
        Shoe foundShoe = shop.findShoeByBrand("Nike");
        if (foundShoe != null) {
            foundShoe.displayInfo();
        } else {
            System.out.println("Shoe not found!");
        }
    }
}