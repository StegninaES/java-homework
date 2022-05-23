package HomeWork06;

public class HomeWork06 {

    public static void main(String[] args) {
        Dog dog = new Dog(500, 10);
        Dog dog1 = new Dog(500, 10);
        Cat cat = new Cat(200);
        dog.run(600);
        cat.run(500);
        dog.swim(40);
        cat.swim(45);
        System.out.println("Dog count=" + Dog.getDogCount());
        System.out.println("Cat count=" + Cat.getCatCount());
        System.out.println("Animal count=" + Animal.getCount());
    }
}
