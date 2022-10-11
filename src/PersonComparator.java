import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PersonComparator implements Comparator<Person> {

    private int maxWords;

    public PersonComparator(int maxWords) {
        this.maxWords = maxWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        List<String> surname1 = new ArrayList<>();
        surname1.addAll(List.of(o1.getSurname().split("\\P{IsAlphabetic}+")));
        List<String> surname2 = new ArrayList<>();
        surname2.addAll(List.of(o2.getSurname().split("\\P{IsAlphabetic}+")));

        if ((surname1.size() < this.maxWords || surname2.size() < this.maxWords) && (surname1.size() != surname2.size())) {
            return Integer.compare(surname1.size(), surname2.size());
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

    }
}
