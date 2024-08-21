package src.main.java.blog;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        // Erstellen von User-Objekten
        User alice = new User("Alice");
        User bob = new User("Bob");
        User charlie = new User("Charlie");
        User dave = new User("Dave");

        // Erstellen einer Liste von durchsuchbaren Objekten
        ArrayList<Searchable> searchableList = new ArrayList<>();

        // Fügen von Blog-Einträgen zur Liste hinzu
        searchableList.add(new Blog("Java Basics", "Java is a popular programming language", alice));
        searchableList.add(new Blog("Advanced Java", "Deep dive into Java", bob));

        // Fügen von Kommentaren zur Liste hinzu
        searchableList.add(new Comment("Great article about Java!", charlie));
        searchableList.add(new Comment("I love Java", dave));
        searchableList.add(new Comment("Thanks for the info", dave));

        // Definieren des Such-Strings (z.B. "Java")
        String searchString = "Java";
        int count = 0;

        // Iterieren über die Liste und Prüfen, ob der Such-String enthalten ist
        for (Searchable item : searchableList) {
            if (item.getSearchString().contains(searchString)) {
                System.out.println("Gefunden in: " + item.getSearchString());
                count++;
            }
        }

        // Ergebnis anzeigen
        System.out.println("Der Such-String '" + searchString + "' wurde " + count + " Mal gefunden.");
    }
}
