public class hummingbird extends bird{
    public static int maxSwimDistance = 0;
    public static int count;
    public static int flightAltitude = 10;
    public hummingbird(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance, flightAltitude);
        count++;
    }
}