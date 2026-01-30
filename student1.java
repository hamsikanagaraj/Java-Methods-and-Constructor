public class student1 {

    int id;
    String name;
    int age;

    student1(int a, String b, int c) {
        id = a;
        name = b;
        age = c;
    }

    student1(int a, int b) {
        id = a;
        age = b;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }
}

class Main1 {
    public static void main(String[] args) {
        student1 s1 = new student1(1, "Anusha", 20);
        student1 s2 = new student1(2, 30);

        s1.display();
        s2.display();
    }
}
