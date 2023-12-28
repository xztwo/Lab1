public class main {
    public static void main(String[] args) {
        animal[] animals = {
                new cat("Барсик", 200),
                new dog("Бобик", 360),
                new tiger("Ричард", 150),
                new tiger("Граф", 100),
                new eagle("Орел", 2),
                new chicken("Курица", 4),
                new hummingbird("Колибри", 0),
                new butterfly("Бабка", 0, 20),
                new dragonfly("Стрекоза", 0, 30),
                new ant("Муровей", 150, 365)
        };
        for (animal a : animals){
            a.run(350);
            a.swim(5);
        }
        System.out.println("Количетво котов: " + cat.count);
        System.out.println("Количество собак: " + dog.count);
        System.out.println("Количество тигров: " + tiger.count);
        System.out.println("Количество птиц: " + bird.count);
        System.out.println("Количество всех животных: " + animal.count);
        System.out.println("Количество бабочек: " + butterfly.count);
        System.out.println("Количество стрекоз: " + dragonfly.count);
        System.out.println("Количество муравьев: " + ant.count);
        ((bird) animals[4]).height();
        ((bird) animals[5]).height();
        ((bird) animals[6]).height();
        ((chicken) animals [5]).layegg();
        ((Insects) animals[7]).lifespan();
        ((Insects) animals[8]).lifespan();
        ((Insects) animals[9]).lifespan();
    }
}




