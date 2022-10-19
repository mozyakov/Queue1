import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new ArrayDeque<>();
        List<Person> people = generateClient();
        for (Person person : people) {
            queue.offer(person);
        }

        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println("Клиент " + person.getFirstname() + " использовал билет");
            person.spendTicket();
            if(person.hasMoreTicket()) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClient() {
        List<Person> ans = new ArrayList<>();
        ans.add(new Person("Solar", "S", 1));
        ans.add(new Person("Duetta", "D", 2));
        ans.add(new Person("Tristan", "T", 3));
        ans.add(new Person("Fores", "F", 4));
        ans.add(new Person("Kvint", "K", 5));
        return ans;
    }
}