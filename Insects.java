abstract class Insects extends animal {
    private int lifeTime;
    public static int count;

    public Insects(String name, int lifeTime, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        this.lifeTime = lifeTime;
        count++;
    }

    public void lifespan() {
        System.out.println(this.name + " живет " + lifeTime + " дней");
    }
}

