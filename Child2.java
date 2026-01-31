class animal{
void sound(){
    System.out.println("hello");
}
void walk(){
    System.out.println("fast");
}
}
class Dog extends animal{
    void bark(){
        System.out.println("dog");
    }
}
public class Child2{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.bark();
        dg.sound();
        dg.walk();
    }
}