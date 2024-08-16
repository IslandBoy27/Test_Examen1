import java.util.Calendar;
import java.util.GregorianCalendar;

public final class Comment {
    private int postId;
    private String author;
    private String content;
    private Calendar date;

    // Constructor
    public Comment(int postId, String author, String content) {
        this.postId = postId;
        this.author = author;
        this.content = content;
        this.date = new GregorianCalendar(); // Inicializa con la fecha y hora actual
    }

    // Método para imprimir el comentario
    public void print() {
        int day = date.get(Calendar.DAY_OF_MONTH);
        int month = date.get(Calendar.MONTH) + 1; // Enero es 0 en Calendar
        int year = date.get(Calendar.YEAR) % 100; // Últimos dos dígitos del año

        System.out.println(author + " - " + String.format("%02d/%02d/%02d", day, month, year));
        System.out.println(content);
    }

    // Getters y Setters
    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

}
