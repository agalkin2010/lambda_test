import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person human1 = new Person("Petya", "Ivanov-Petrov", 32);
        Person human2 = new Person("Tolya", "Ivanov-Petrov-Sidorov", 20);
        Person human3 = new Person("Kolya", "Ivanov-Petrov-Novikov", 25);

        List<Person> list = new ArrayList<>();
        list.add(human1);
        list.add(human3);
        list.add(human2);

        System.out.println(list);

        Collections.sort(list, new PersonComparator(2));
        System.out.println(list);

        Collections.sort(list, new PersonComparator(3));
        System.out.println(list);

    }

}
