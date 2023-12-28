public class chicken extends bird{
    public static int maxSwimDistance = 0;
    public static int count;
    public static int flightAltitude = 2;

    public chicken(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance, flightAltitude);
        count++;
    }

    public void layegg() { // метод для сброса яйца
            System.out.println(this.name + " снесла яйцо!");
    }
}