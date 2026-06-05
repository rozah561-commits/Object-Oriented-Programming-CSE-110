/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;
 class Document {
    public String[] authors;
    public String date;
    public Document(String[] authors, String date) {
        this.authors = authors;
        this.date = date;
    }
    public String[] getAuthors() {
        return authors;
    }
    public void addAuthor(String name) {
        String[] newAuthors = new String[authors.length + 1];
        for (int i = 0; i < authors.length; i++) {
            newAuthors[i] = authors[i];
        }
        newAuthors[authors.length] = name;
        authors = newAuthors;
    }
    public String getDate() {
        return date;
    }
}
class Book extends Document {
    public String title;
    public Book(String[] authors, String date, String title) {
        super(authors, date);
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
class Email extends Document {
    public String subject;
    public String[] to;
    public Email(String[] authors, String date, String subject, String[] to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }
    public String getSubject() {
        return subject;
    }
    public String[] getTo() {
        return to;
    }
}
public class DocumentTest {
    public static void main(String[] args) {
        String[] authors = {"Ali", "joy"};
        String[] recipients = {"Mita", "Rita"};

         Book book = new Book(authors, "2025-04-01", "Graph Theory Essentials");
        Email email = new Email(authors, "2025-04-02", "Meeting Reminder", recipients);

        System.out.println("Book Details:");
        System.out.println("Title: " + book.getTitle());
        System.out.println("Authors: " + book.getAuthors()[0] + ", " + book.getAuthors()[1]);
        System.out.println("Date: " + book.getDate());

        System.out.println("\nEmail Details:");
        System.out.println("Subject: " + email.getSubject());
        System.out.println("Authors: " + email.getAuthors()[0] + ", " + email.getAuthors()[1]);
        System.out.println("Recipients: " + email.getTo()[0] + ", " + email.getTo()[1]);
        System.out.println("Date: " + email.getDate());
    }
}