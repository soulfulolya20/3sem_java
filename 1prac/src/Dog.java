public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(){
        name = "Нет имени";
        age = 0;
    }

    public String toString(){
        return name +", Лет "+ age*7;
    }

    public void get_info() {
        System.out.println("Собака с именем " + name + "\nЛет в человеческих годах: " + age*7);
    }
}