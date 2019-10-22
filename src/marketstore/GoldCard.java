package marketstore;

public class GoldCard extends Card {
    public GoldCard(long cardID, String owner) {
        super(cardID, owner, 2);
    }

    @Override
    public String cardType(){
        return "Gold";
    }

    @Override
    public double getDiscount() {
        double turnover = getTurnover();
        int additionalDiscount = (int) turnover / 100;
        if (additionalDiscount > 8) {  // max discount
            additionalDiscount = 8;
        }
        return getInitialDiscountRate() + additionalDiscount;
    }
}
