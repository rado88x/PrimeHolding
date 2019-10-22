package marketstore;

public class BronzeCard extends Card {
    public BronzeCard(long cardID, String owner) {
        super(cardID, owner, 0);
    }

    @Override
    public String cardType() {
        return "Bronze";
    }

    @Override
    public double getDiscount() {
        double turnover = getTurnover();
        if (turnover < 100) {
            return getInitialDiscountRate() + 0;
        } else if (turnover <= 300) { // between 100 and 300
            return getInitialDiscountRate() + 1;
        } else { //over 300
            return getInitialDiscountRate() + 2.5;
        }
    }
}
