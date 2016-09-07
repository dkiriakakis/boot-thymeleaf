package main.domain;

public class Offer {

    private boolean discount;
    private String discountedPrice;

    public Offer() {
    }

    public boolean isDiscount() {
        return discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(String discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @Override
    public String toString() {
        return "Offer{" +
                "discount=" + discount +
                ", discountedPrice='" + discountedPrice + '\'' +
                '}';
    }
}
