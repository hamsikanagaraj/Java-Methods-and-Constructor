class Animal{
    void sound(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("hii");
    }
}
public class child{
    public static void main(String[] args){
        Dog dg=new Dog();
        dg.sound();
    }
}