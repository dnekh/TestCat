public class Cat implements Voiceable {


    private String name;
    private String color;
    private int age;


    public Cat() {
        this("Mors", "Gray", 5);
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Color: " + this.color + ", Age: " + this.age;
    }

    @Override
    public void getVoice() {
        System.out.println("Moore");
        System.out.println("Meow");
    }
}
