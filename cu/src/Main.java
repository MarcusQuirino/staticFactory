public class Main {
  public static void main(String[] args) {
    // jeito paia
    Novel oldNnovel = new Novel("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
    Textbook oldTextbook = new Textbook("Introduction to Algorithms", "Thomas H. Cormen", "Computer Science");

    // jeito tri
    StaticBookFactory novel = StaticBookFactory.createNovel("The Great Gatsby", "F. Scott Fitzgerald");
    StaticBookFactory textbook = StaticBookFactory.createTextbook("Introduction to Algorithms", "Thomas H. Cormen");

    System.out.println(oldNnovel);
    System.out.println(oldTextbook);

    System.out.println(novel);
    System.out.println(textbook);
  }
}
