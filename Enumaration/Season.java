package Enumaration;

public enum Season {
    SUMMER("Summer", 24, 12),
    SPRING("Spring", 16, 22),
    AUTUMN("Autumn", 18, 45),
    WINTER("Winter", 3, 12);

    private  String name;
    private int avgTemp;
    private int mmRain;

    Season(String name, int avgTemp, int mmRain) {
        this.name = name;
        this.avgTemp = avgTemp;
        this.mmRain = mmRain;
    }


}
