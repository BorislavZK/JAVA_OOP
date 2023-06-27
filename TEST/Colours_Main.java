package TEST;

public class Colours_Main {
    public static void main(String[] args) {


        Colours colour = Colours.RED;
        Colours green = Colours.valueOf("GREEN");

        System.out.println(colour.secondValue + " " + colour.value);
        System.out.println(green);

        Colours[] values = Colours.values();
    }

}
