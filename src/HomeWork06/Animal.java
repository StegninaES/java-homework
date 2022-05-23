package HomeWork06;

public class Animal {

    int maxRunDistance;
    private static int count;

    public Animal(int maxRunDistance) {
        this.maxRunDistance = maxRunDistance;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int distance) {
        System.out.println("Animal can run for distance = "+ distance);
    }


    public void swim( int distance) {
        System.out.println("Animal can swim for distace ="+ distance);
    }
}
