public abstract class bird extends animal{
    public static int count;
    private int flightAltitude;
    public bird(String name, int maxRunDistance, int maxSwimDistance, int flightAltitude) {
        super(name, maxRunDistance, maxSwimDistance);
        this.flightAltitude = flightAltitude;
        count++;
    }

    public void height() {
        System.out.println("Максимальная высота полета: " + this.name + " " + flightAltitude + "м");
    }
}
