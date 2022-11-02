import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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

        Comparator<Person> personComparator1 = (Person o1, Person o2) -> {

            int maxWords = 3;

            List<String> surname1 = new ArrayList<>();
            surname1.addAll(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
            List<String> surname2 = new ArrayList<>();
            surname2.addAll(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));

            if ((surname1.size() < maxWords || surname2.size() < maxWords) && (surname1.size() != surname2.size())) {
                return Integer.compare(surname1.size(), surname2.size());
            } else {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        };

        Collections.sort(list, personComparator1);
        System.out.println(list);


    }

}
