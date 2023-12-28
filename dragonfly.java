public class dragonfly extends Insects {
    public static int count;
    public static int maxSwimDistance = 0;
    public int lifeTime;
    public dragonfly(String name, int maxRunDistance, int lifeTime) {
        super(name, lifeTime, maxRunDistance, maxSwimDistance);
        count++;
    }
}
