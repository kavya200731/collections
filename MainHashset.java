import java.util.HashSet;

class MainTreeset {
    public static void main(String[] args) {
        HashSet<String> courses = new HashSet<>();
        courses.add("Java");
        courses.add("Python");
        courses.add("React");
        courses.add("java");

        System.out.println(courses);

        System.out.println("Contains 'Java': " + courses.contains("Java"));

        courses.remove("Python");

        System.out.println("After Removals:" + courses);

    }
}