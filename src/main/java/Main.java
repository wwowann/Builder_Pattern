import javax.xml.bind.SchemaOutputResolver;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(-100)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        if (mom.getName() == null || mom.getSurname() == null) throw new
                IllegalStateException("отсутствуют обязательные поля");
        if (mom.getAge() < 0 || mom.getAge() > 150) throw
                new IllegalArgumentException("недопустимый возраст");
        System.out.println("У " + mom + "есть сын:\n " + son);
    }
}
