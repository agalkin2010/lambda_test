public class Person {

    private String name;
    private String surname;
    private int age;

    // создайте конструктор на все поля
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    // создайте геттеры и сеттеры
    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return this.age;
    }

    public void getName(String name) {
        this.name = name;
    }

    public void getSurname(String surname) {
        this.surname = surname;
    }

    public void getAge(int age) {
        this.age = age;
    }

    // создайте toString
    @Override
    public String toString() {
        return this.surname + " " + this.name + " " + this.age;
    }

}
