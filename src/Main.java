import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Person human1 = new Person("Petya", "Ivanov-Petrov", 32);
        Person human2 = new Person("Tolya", "Ivanov-Petrov-Sidorov", 15);
        Person human3 = new Person("Kolya", "Ivanov-Petrov-Novikov", 25);
        Person human4 = new Person("Tanya", "Potemkina-Petrova-Sidorova", 11);

        List<Person> list = new ArrayList<>();
        list.add(human1);
        list.add(human3);
        list.add(human2);
        list.add(human4);

        System.out.println(list);

        Predicate<Person> filter = (Person person) -> person.getAge() < 18;

        list.removeIf(filter);

        System.out.println(list);

        Collections.sort(list, new PersonComparator(2));
        System.out.println(list);

        Collections.sort(list, new PersonComparator(3));
        System.out.println(list);

    }

}
