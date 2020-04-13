public class Product {
    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    public Product(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    void printInfo() {
        System.out.println("Nazwa: " + name);
        System.out.println("Cena: " + price);
        System.out.println("Opis: " + description);
        if (category != null) {
            System.out.println("Kategoria: " + category.name + " - " + category.description);
        }
        System.out.println("");
    }

}
