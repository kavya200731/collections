import java.util.TreeMap;

class MainTreeMap {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Java");
        students.put(101, "Rahul");
        students.put(104, "Saran");
        students.put(102, "Python");

        System.out.println(students);

        System.out.println(students.get(102));

        students.remove(103);

        System.out.println(students);

        System.out.println(students.containsKey(101));
        System.out.println(students.size());
    }
}