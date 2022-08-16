package jpractice;

public class child extends parent{
    public child(String name, int age, String address) {
        super(name, age, address);
    }

    public child() {
        System.out.println("child");
    }

    public static void main(String[] args) {
        parent pcpc = new child();
        System.out.println("==========");
        child c = new child();
        System.out.println("==========");

        parent pc = new child("cn", 2, "ca");
        System.out.println(pc.getName());
        System.out.println(pc.getAge());
        System.out.println(pc.getAddress());
    }
}
