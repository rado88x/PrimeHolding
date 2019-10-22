package marketstore;

public class Main {
    public static void main(String[] args) {

        //test data
        BronzeCard b1 = new BronzeCard(1, "Petur");
        b1.setTurnover(0);
        BronzeCard b2 = new BronzeCard(2, "Stefan");
        b2.setTurnover(5000);

        SilverCard s1 = new SilverCard(10, "Georgi");
        s1.setTurnover(600);
        SilverCard s2 = new SilverCard(20, "Pavel");
        s2.setTurnover(20);

        GoldCard g1 = new GoldCard(100, "Maria");
        g1.setTurnover(1500);
        GoldCard g2 = new GoldCard(200, "Gloria");
        g2.setTurnover(9);


        DiscountCoupon c1 = new DiscountCoupon(18, 10);
        DiscountCoupon c2 = new DiscountCoupon(81, 20);


        PayDesk.purchase(b1, 150);
        PayDesk.purchase(b2, 255);
        PayDesk.purchase(s1, 850);
        PayDesk.purchase(s2, 12);
        PayDesk.purchase(g1, 1300);
        PayDesk.purchase(g2, 40000);
        PayDesk.purchase(c1, 150);
        PayDesk.purchase(c2, 1000);

    }
}
