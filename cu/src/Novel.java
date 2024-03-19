public class Novel extends Book {
  private String genre; // Specific to Novel

  public Novel(String title, String author, String genre) {
    super(title, author);
    this.genre = genre;
  }

  public String getGenre() {
    return genre;
  }

  @Override
  public String toString() {
    return super.toString() + ", Genre='" + genre + '\'';
  }
}