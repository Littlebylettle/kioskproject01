
public class Menu {
   private String name;
   private String desc;
   private double price;

    public Menu(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public Menu(String name, String desc, double price) {
        this.name = name;
        this.desc = desc;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getDesc() {
        return desc;
    }
    public double getPrice() {
        return price;
    }
}


