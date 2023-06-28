package HotelReservation;

public class PriceCalculator {
    public static double calculatePrice(double pricePerDay, int days, Main.Season season, Main.Discount discount) {

        double basePrice = pricePerDay * days * season.getMultiplier();

        return basePrice * discount.getDiscount();
    }
}
