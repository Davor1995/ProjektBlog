package src.main.java.blog;

public interface Searchable {
    String SEPARATOR = "-";
    //String getSearchString();

    // Default-Implementation von getSearchString
    default String getSearchString() {
        return this.toString();
    }
}

