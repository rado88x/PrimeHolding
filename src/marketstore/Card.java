package marketstore;

public abstract class Card implements Discount {
    private long cardID;  //every card should have ID because owners can have same names, also card can be deleted, suspended or damaged
    private String owner;
    private double turnover = 0;
    private double initialDiscountRate;

    public Card(long cardID, String owner, double initialDiscountRate) {
        if (initialDiscountRate < 0 && initialDiscountRate > 100) {
            throw new IllegalArgumentException("Invalid discount value.");
        }
        if (owner == null || owner.equals("")) {
            throw new IllegalArgumentException("Invalid owner name.");
        }
        this.cardID = cardID;
        this.owner = owner;
        this.initialDiscountRate = initialDiscountRate;
    } //all cards should start with turnover 0

    public long getCardID() {
        return cardID;
    }

    public String getOwner() {
        return owner;
    }

    public double getTurnover() {
        return turnover;
    }

    public double getInitialDiscountRate() {
        return initialDiscountRate;
    }


    public void setTurnover(double turnover) {
        if (turnover < 0) {
            throw new IllegalArgumentException("Turnover can not be less than 0");
        }
        this.turnover = turnover;
    } // we have to update this card. It should be automatically calculated but in case we have to cancel purchases to have option to set it manually;

    @Override
    public long getID() {
        return cardID;
    }
}
