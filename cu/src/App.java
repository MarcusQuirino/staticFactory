public class App {
    public static void main(String[] args) {
        StataticBookFactory novel = StataticBookFactory.createNovel("The Great Gatsby", "F. Scott Fitzgerald");
        StataticBookFactory textbook = StataticBookFactory.createTextbook("Introduction to Algorithms",
                "Thomas H. Cormen");

        System.out.println(novel);
        System.out.println(textbook);
    }
}
