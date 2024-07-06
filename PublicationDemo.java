class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public void displayPublication() {
        System.out.println("Author: " + author_name);
    }
}

class BookPublication extends Book {
    private String title;

    public BookPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void displayPublication() {
        super.displayPublication();
        System.out.println("Book Title: " + title);
    }
}

class PaperPublication extends Book {
    private String title;

    public PaperPublication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

   
    public void displayPublication() {
        super.displayPublication();
        System.out.println("Paper Title: " + title);
    }
}

public class PublicationDemo {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Usage: java PublicationDemo <author_name> <publication_type> <title>");
            return;
        }

        String author_name = args[0];
        String publicationType = args[1];
        String title = args[2];

        Book publication;

        if ("book".equalsIgnoreCase(publicationType)) {
            publication = new BookPublication(author_name, title);
        } else if ("paper".equalsIgnoreCase(publicationType)) {
            publication = new PaperPublication(author_name, title);
        } else {
            System.out.println("Invalid publication type. Please use 'book' or 'paper'.");
            return;
        }

        publication.displayPublication();
    }
}
