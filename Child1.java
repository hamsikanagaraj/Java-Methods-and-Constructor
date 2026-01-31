class Animal{
    void sound(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("sound");
    }
}
    class cat extends Animal{
    void move(){
        System.out.println("slow");
    }
    }
public class Child1{
    public static void main(String[] args){
        Dog dg=new Dog();
        cat ct=new cat();
        dg.bark();
        ct.move();
        dg.sound();
    }
}