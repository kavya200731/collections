import java.util.LinkedHashSet;

class MainLinkedHashSet {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();

        names.add("Rahul");
        names.add("Saran");
        names.add("Java");
        names.add("Rahul");

        System.out.println(names);

        names.remove("Saran");

        System.out.println(names);

        System.out.println(names.contains("Java"));
        System.out.println(names.size());
    }
}