package jpractice;

public class parent {
    private String name;
    private int age;
    private String address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public parent(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public parent() {
        System.out.println("parent");
    }
}
