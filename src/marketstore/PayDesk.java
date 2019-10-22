package marketstore;

public class PayDesk {
    public static void purchase(Discount discount, double purchaseValue) {

        if (purchaseValue < 0) {
            throw new IllegalArgumentException("Invalid item price.");
        }

        System.out.println(String.format("You are owner of %s", discount.cardType()));
        System.out.println(String.format("Purchase value: $%.2f", purchaseValue));
        System.out.println(String.format("Discount rate: %.2f%%", discount.getDiscount()));
        System.out.println(String.format("Discount: $%.2f", (purchaseValue * discount.getDiscount() / 100)));
        System.out.println(String.format("Total: $%.2f", (purchaseValue - purchaseValue * discount.getDiscount() / 100)));
        System.out.println();
    }
}
