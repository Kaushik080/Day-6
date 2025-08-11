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
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Ravi", 44);
        scores.put("neha", 70);
        scores.put("Amit", 91);
        System.out.println(scores);

        Set<String> keySet = scores.keySet();
        for (String key: scores.keySet()){
            System.out.println(key + "->" + scores.get(key));
        }

        for(Map.Entry<String, Integer> entry : scores.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        //Employees emp1 = new Employees("Rakesh",101,"Dev",10_00_000);
        Map<Integer, Employees> emp = new HashMap<>();
        emp.put(1, new Employees("Rakesh",101,"Dev",10_00_000));
        System.out.println(emp);

        Set<Map.Entry<Integer,Employees>> empEntrySet = emp.entrySet();

        for(Map.Entry<Integer,Employees> entry : empEntrySet){
            System.out.println("key: " + entry.getKey());
            System.out.println("value: " + entry.getValue());
        }



    }
}