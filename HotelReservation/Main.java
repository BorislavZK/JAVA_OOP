package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    String[]inputCommand = scan.nextLine().split("\\s+");
    double pricePerDay = Double.parseDouble(inputCommand[0]);
    int days = Integer.parseInt(inputCommand[1]);
    Season season = Season.valueOf(inputCommand[2]);
    Discount discount = Discount.valueOf(inputCommand[3]);

    double finalPrice = PriceCalculator.calculatePrice(pricePerDay, days, season, discount);

        System.out.printf("%.2f", finalPrice);


    }

    public enum Discount {

        VIP(0.8), SecondVisit(0.9), None(1);

        public final double discount;

        Discount(double discount) {
            this.discount = discount;
        }

        public double getDiscount() {
            return discount;
        }
    }

    enum Season {

        Autumn(1), Spring(2), Winter(3), Summer(4);

        public final int multiplier;

        Season(int multiplier) {
            this.multiplier = multiplier;
        }

        public int getMultiplier() {
            return multiplier;
        }
    }
}
