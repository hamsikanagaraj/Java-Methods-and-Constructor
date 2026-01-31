class Animal{
    Animal(){
        System.out.println("hello");
        }
    }
class Dog extends Animal{
    Dog(){
    super();
    }
    void sound(){
        System.out.println("hi");
    }
}
public class sup{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.sound();
    }
}