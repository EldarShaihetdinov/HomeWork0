package application;

public class Owner {
    private String name;
    final private String secondName;
    private int age;
    private String welcome = "Здрасте я ";

    public String getWelcome() {
        return welcome;
    }

    public Owner(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    @Override
    public String toString() {
        return name +" "+secondName+" "+age+" "+welcome+getName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }
}
