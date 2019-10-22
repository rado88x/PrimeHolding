package marketstore;

public class SilverCard extends Card {
    public SilverCard(long cardID, String owner) {
        super(cardID, owner, 2);
    }

    @Override
    public String cardType() {
        return "Silver";
    }

    @Override
    public double getDiscount() {
        double turnover = getTurnover();
        if (turnover <= 300) {  //In case, the turnover is over $300
            return getInitialDiscountRate() + 0;
        } else {
            return getInitialDiscountRate() + 1.5;
        }
    }
}
