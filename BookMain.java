class Book {
    private String authorName;

    public Book(String authorName) {
        this.authorName = authorName;

    }

    public void displayPublication() {
        System.out.println("Author name-" + authorName);
    }
}

class Book_Publication extends Book {
    private String title;

    public Book_Publication(String authorname, String title) {
        super(authorname);
        this.title = title;
    }

    public void displayPublication() {
        super.displayPublication();
        System.out.println("Book title-" + title);
    }
}

class Paper_Publication extends Book {
    private String title;

    public Paper_Publication(String authorName, String title) {
        super(authorName);
        this.title = title;
    }

    public void displayPublication() {
        super.displayPublication();
        System.out.println("paper title-" + title);
    }
}

public class BookMain {
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
