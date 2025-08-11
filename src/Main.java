import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("array list");

        ArrayList<String> students = new ArrayList<>();
        students.add("Amit");
        students.add("neha");
        students.add("Ravi");
        System.out.println(students);

        System.out.println("Linked list");
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("write report");
        tasks.add("Email client");
        tasks.add("Attend meeting");
        System.out.println(tasks);

        System.out.println("HashSet");
        HashSet<String> countries = new HashSet<>();
        countries.add("India");
        countries.add("USA");
        countries.add("India");
        System.out.println(countries);

        System.out.println("Priority queue");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(30);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        System.out.println("Array Deque");
        ArrayDeque<String> dq = new ArrayDeque<>();
        dq.add("First");
        dq.addLast("second");
        dq.addFirst("zero");
        System.out.println(dq);

        System.out.println("Hash Map");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Ravi");
        map.put(102, "neha");
        map.put(103, "Amit");
        System.out.println(map);

    }
}