public class SpecialOffer {
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
        double discountPrice = product.price * (1 - discount);
        product.price = discountPrice;
        return discountPrice;
    }
}
