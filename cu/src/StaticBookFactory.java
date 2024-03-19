public abstract class StaticBookFactory {
    private String title;
    private String author;

    protected StaticBookFactory(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Static factory method for a Novel
    public static StaticBookFactory createNovel(String title, String author) {
        return new Novel(title, author);
    }

    // Static factory method for a Textbook
    public static StaticBookFactory createTextbook(String title, String author) {
        return new Textbook(title, author);
    }

    private static class Novel extends StaticBookFactory {
        public Novel(String title, String author) {
            super(title, author);
        }
    }

    private static class Textbook extends StaticBookFactory {
        public Textbook(String title, String author) {
            super(title, author);
        }
    }
}
