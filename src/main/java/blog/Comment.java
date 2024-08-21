package src.main.java.blog;

public class Comment implements Searchable {
    private String content;
    private User author;
    public Comment(String content, User author) {
        this.content = content;
        this.author = author;

    }

    @Override
    public String getSearchString() {
        return content;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public User getAuthor() {
        return author;
    }
    public void setAuthor(User author) {
        this.author = author;
    }

}
