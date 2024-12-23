import java.util.ArrayList;
import java.util.Comparator;

public class School {
    private ArrayList<Person> members = new ArrayList<>();

    public void sortMembers(){

        members.sort((a,b)->a.compareTo(b));
    }
    public void addMember(Person member) {
        members.add(member);
    }

    @Override
    public String toString() {
        String result = "";
        for (Person member : members) {
            result += member.toString() + "\n";
        }
        return result;
    }
}
