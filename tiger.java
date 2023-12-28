public class tiger extends animal{
    public static int maxSwimDistance = 7;
    public static int count;
    public tiger(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
