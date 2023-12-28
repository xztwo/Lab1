public class cat extends animal{
    public static int maxSwimDistance = 0;
    public static int count;
    public cat(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
