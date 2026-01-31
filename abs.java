abstract class shape{
    abstract void draw();
    void message(){
        System.out.println("hello");
            }
}
class circle extends shape{
    void draw(){
        System.out.println("long");
    }
}
public class abs{
    public static void main(String[] args){
        circle cl=new circle();
        cl.draw();
        cl.message();
    }
}
        
