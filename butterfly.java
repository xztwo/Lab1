public class butterfly extends Insects {
    public static int count;
    public static int maxSwimDistance = 0;
    public int lifeTime;
    public butterfly(String name, int maxRunDistance, int lifeTime) {
        super(name, lifeTime, maxRunDistance, maxSwimDistance);
        count++;
    }

}