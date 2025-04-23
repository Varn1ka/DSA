abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Eats");
    }
}
interface Move {
    void fly();
}
class Bird extends Animal implements Move {
    void sound() {
        System.out.println("Sound");
    }
    public void fly() {
        System.out.println("Flies");
    }
}
class Main {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.sound();
        b.eat();
        b.fly();
    }
}
