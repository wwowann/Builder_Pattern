public class PersonBuilder {
    private String name;
    private String surName;
    private int age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    PersonBuilder setSurname(String surname) {
        this.surName = surname;
        return this;
    }

    PersonBuilder setAge(int age) {
        this.age = age;
        if (age < 0 || age > 150) throw new IllegalArgumentException("недопустимый возраст\n");
        return this;
    }

    PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surName, age, address);
    }
}
