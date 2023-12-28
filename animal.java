public class animal {
    protected String name;
    private int maxRunDistance;
    private int maxSwimDistance;
    public static int count;
    public animal(String name, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }
    public void run(int distance){
        if (maxRunDistance == 0){
            System.out.println(this.name + " не умеет бегать ");
        }else if (distance <= maxRunDistance){
            System.out.println(this.name + " пробежал " + distance + " м");
        }else {
            System.out.println(this.name + " не может пробежать " + distance + " м");
        }
    }
    public void swim(int distance){
        if (maxSwimDistance == 0){
            System.out.println(this.name + " не умеет плавать ");
        }else if (distance <= maxSwimDistance){
            System.out.println(this.name + " проплыл " + distance + " м");
        }else{
            System.out.println(this.name + " не может проплыть " + distance + " м");
        }
    }
}



