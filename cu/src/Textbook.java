public class Textbook extends Book {
  private String subject; // Specific to Textbook

  public Textbook(String title, String author, String subject) {
    super(title, author);
    this.subject = subject;
  }

  public String getSubject() {
    return subject;
  }

  @Override
  public String toString() {
    return super.toString() + ", Subject='" + subject + '\'';
  }
}
