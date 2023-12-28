public class dog extends animal{
    public static int maxSwimDistance = 30;
    public static int count;
    public dog(String name, int maxRunDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        count++;
    }
}
