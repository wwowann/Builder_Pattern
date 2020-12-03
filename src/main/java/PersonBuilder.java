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
        return this;
    }

    PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (this.name == null || this.surName == null) throw new
                IllegalStateException("отсутствуют обязательные поля");
        if (this.age < 0 || age > 150) throw
                new IllegalArgumentException("недопустимый возраст");
        return new Person(name, surName, age, address);
    }
}
