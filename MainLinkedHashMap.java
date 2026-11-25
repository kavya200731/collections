import java.util.LinkedHashMap;

class MainLinkedHashMap {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101, "Rahul");
        students.put(102, "Saran");
        students.put(103, "Java");
        students.put(104, "Python");

        System.out.println(students);

        System.out.println(students.get(102));

        students.remove(103);

        System.out.println(students);

        System.out.println(students.containsKey(101));
        System.out.println(students.size());
    }
}