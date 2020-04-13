public class ShopApp {
    public static void main(String[] args) {
        Category rims = new Category("Felgi", "felgi aluminiowe do aut osobowych");
        Category tyres = new Category("Opony", "opony do aut osobowych");

        Product rim1 = new Product("OZ", 750.0, "15x6, et 35, 4x100", rims);
        Product rim2 = new Product("ATS", 890.0, "17x7.5, et 42, 5x114.3", rims);
        Product tyre1 = new Product("Michelin", 315.0, "195/50/16, letnie", tyres);
        Product bulb = new Product("Philips", 47.9, "H7, +90%, kpl. 2 szt.");

        rim1.printInfo();
        System.out.println("");

        SpecialOffer specialOffer = new SpecialOffer("promocja z okazji 10-lecia firmy", 13, 17, 0.2);

        specialOffer.applyDiscount(rim1, 0.2);
        rim1.printInfo();

    }
}
