public class Person {
    private String name;
    private String surname;
    private int age;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }
    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;

    }

    @Override
    public String toString() {
        return name + ", фамилия " + surname + ", возраст " + age +
                ", адрес: " + address + " ";
    }

   public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        if (this.age == 0)
            this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday() {
        this.age = age++;
    }

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder person = new PersonBuilder();
        person.setSurname(surname);
        person.setAddress(address);
        return person;
    }

}
