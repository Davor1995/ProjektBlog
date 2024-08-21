package src.main.java.blog;

public class Blog implements Searchable{
    private String title;
    private User author;
    private String content;
    public Blog(String title, String content, User author) {
        this.title = title;
        this.author = author;
        this.content = content;

    }

    @Override
    public String getSearchString() {
        return title + SEPARATOR + content;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}