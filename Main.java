public class Main {
    public static void main(String[] args) {
        ListIterator<User> li = new ListIterator<>();
        li.add(new User("John", "Smith", 32));
        li.add(new User("Sarah", "Connor", 42));
        li.add(new User("Cristiano", "Ronaldo", 37));
        for (Position position : li) {
            System.out.println(position.getData());
        }

    }
}