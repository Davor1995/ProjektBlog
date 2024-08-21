package src.main.java.blog;

public final class User implements Searchable {
    private final String name;

    // Konstruktor
    public User(String name) {
        this.name = name;
    }

    // Getter für den Namen
    public String getName() {
        return name;
    }

    // Überschreiben der toString-Methode
    @Override
    public String toString() {
        return "name: " + name;
    }
}
