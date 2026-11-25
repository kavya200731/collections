import java.util.LinkedList;

class MainLinked {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        tasks.add("Learn Java");
        tasks.add("Learn SQL");
        tasks.add("Learn React");

        tasks.addFirst("Start Training");
        tasks.addLast("Build Project");

        System.out.println(tasks);

        tasks.removeFirst();
        tasks.removeLast();

        System.out.println(tasks);
    }
}