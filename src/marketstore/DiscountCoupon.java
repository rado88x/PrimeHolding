package marketstore;

public class DiscountCoupon implements Discount {
    private long couponID;
    private double discountRate;

    public DiscountCoupon(long couponID, double discountRate) {
        this.couponID = couponID;
        this.discountRate = discountRate;
    }

    public long getCouponID() {
        return couponID;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    @Override
    public long getID() {
        return couponID;
    }

    @Override
    public double getDiscount() {
        return discountRate;
    }

    @Override
    public String cardType() {
        return "Coupon";
    }
}
