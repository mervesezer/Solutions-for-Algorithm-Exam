public class Person {
    private int id;
    private String name;
    private String lastName;
    private int age;

    public Person(int id, String name, String lastName, int age) {
        this.setId(id);
        this.setName(name);
        this.setLastName(lastName);
        this.setAge(age);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
