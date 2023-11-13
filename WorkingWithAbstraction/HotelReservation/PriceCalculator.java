package WorkingWithAbstraction.HotelReservation;

public class PriceCalculator {


    public static double calculatePrice(double pricePerDay, int days, Season season, DiscountType discountType) {

        double price = pricePerDay * days;

        price = price * season.getMultiplier();

        price = price - price * (discountType.getPercent() / 100);

        return price;

    }
}
