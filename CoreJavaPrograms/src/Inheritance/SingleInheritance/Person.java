package Inheritance.SingleInheritance;

public class Person {
    private int pid;
    private String name;
    private String city;

    // Parameterized constructor
    public Person(int pid, String name, String city) {
        this.pid = pid;
        this.name = name;
        this.city = city;
    }

    // Getters and Setters
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
