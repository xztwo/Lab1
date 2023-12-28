 public class eagle extends bird{
    public static int count;
    public static int maxSwimDistance = 0;
    public static int flightAltitude = 9000;
    public eagle(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance, flightAltitude);
        count++;
    }
}
