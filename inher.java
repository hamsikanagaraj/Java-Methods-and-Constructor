 class animal{
void sound(){
    System.out.println("hello");
}
}
class Dog extends animal{
    void bark(){
        System.out.println("dog");
    }
}
public class inher{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.bark();
        dg.sound();
    }
}