package Encapsulation._03_TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Signals[] signals = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Signals::valueOf).toArray(Signals[]::new);

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {

            updateSignals(signals);
            printSignals(signals);

        }
    }

    private static void printSignals(Signals[] signals) {
        for (Signals signal : signals) {
            System.out.print(signal + " ");
        }
        System.out.println();
    }

    private static void updateSignals(Signals[] signals) {
        //red -> green -> yellow -> red

        for (int i = 0; i < signals.length; i++) {
            switch (signals[i]){
                case RED:
                    signals[i] = Signals.GREEN;
                    break;
                case GREEN:
                    signals[i] = Signals.YELLOW;
                    break;
                case YELLOW:
                    signals[i] = Signals.RED;
                    break;
            }

        }
    }
}
