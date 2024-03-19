public abstract class StataticBookFactory {
    private String title;
    private String author;

    protected StataticBookFactory(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public static StataticBookFactory createNovel(String title, String author) {
        return new Novel(title, author);
    }

    public static StataticBookFactory createTextbook(String title, String author) {
        return new Textbook(title, author);
    }

    private static class Novel extends StataticBookFactory {
        public Novel(String title, String author) {
            super(title, author);
        }
    }

    private static class Textbook extends StataticBookFactory {
        public Textbook(String title, String author) {
            super(title, author);
        }
    }
}
