package HomeWork06;

public class Dog extends Animal {
    private int maxSwimDistance;
    private static int dogCount;


    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance);
        this.maxSwimDistance = maxSwimDistance;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println("Dog can swim only for distance = " + maxSwimDistance);
        } else {
            System.out.println("Dog swim for distance = " + distance);
        }
    }

   @Override
   public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println("Dog can run only for distance = " + maxRunDistance);
        } else {
            System.out.println("Dog run for distance = " + distance);
        }
    }
}
