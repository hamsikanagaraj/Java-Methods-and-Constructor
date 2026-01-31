interface payment{
    void pay();
}
class upi implements payment{
    public void pay(){
        System.out.println("paying");
    }
}
public class inf{
    public static void main(String[] args){
        upi payment=new upi();
        payment.pay();
    }
}