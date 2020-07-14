package academy.belhard;

public class Main {

    public static void main(String[] args) {
        CustomList<String> collection = new CustomList<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");

        for (String s : collection) {
            System.out.println(s);
        }
    }
}
