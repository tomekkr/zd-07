public class SpecialOffer {
    private Product product;
    private String description;
    private int startDate;
    private int endDate;
    private double discount;

    public SpecialOffer(String description, int startDate, int endDate, double discount) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.discount = discount;
    }

    public double applyDiscount(Product product, double discount) {
        double discountPrice = product.getPrice() * (1 - discount);
        product.setPrice(discountPrice);
        return discountPrice;
    }
}
