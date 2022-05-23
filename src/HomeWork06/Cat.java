package HomeWork06;

public class Cat extends Animal {
    private static int catCount;

    public Cat(int maxRunDistance) {
        super(maxRunDistance);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat can't swim");

    }
   @Override
   public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println("Cat can run only for distance = " + maxRunDistance);
        } else {
            System.out.println("Cat run for distance = " + distance);
        }
    }
}

