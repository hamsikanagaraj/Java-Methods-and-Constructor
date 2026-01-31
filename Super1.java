class Animal {
    Animal() {
        System.out.println("hello");
    }

    void run() {
        System.out.println("run");
    }
}

class Dog extends Animal {
    Dog() {
        super();
    }

    void sound() {
        System.out.println("hi");
        super.run(); 
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog dg = new Dog();
        dg.sound();
    }
}