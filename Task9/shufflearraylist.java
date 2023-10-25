import java.util.ArrayList;

public class ElementExistsInArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Rohith");
        list.add("Virat");
        list.add("Dhoni");
        list.add("yuvaraj");
        String elementToFind = "Rohith";
        if (list.contains(elementToFind)) {
            System.out.println(elementToFind + " exists in the ArrayList.");
        } else {
            System.out.println(elementToFind + " does not exist in the ArrayList.");
        }
    }
