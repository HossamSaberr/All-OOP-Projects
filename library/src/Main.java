public class Main {
    public static void main(String[] args) {
        libraryManager libraryManager1 = new libraryManager();

        // Adding Libraries
        library library1 = new library(1, "Main Campus Library");
        library library2 = new library(2, "CS Library");
        libraryManager1.addLibrary(library1);
        libraryManager1.addLibrary(library2);
        book book1 = new book(1, 1, "Introduction to Java", "Daniel Liang", "Pearson", 2010, "On shelf", 10);
        libraryManager1.addBook(book1);
        subscriber subscriber1 = new subscriber(1, "regular", "Mohamed", "123 Street", "123456789", "mohamed@example.com");
        subscriber subscriber2 = new subscriber(2, "golden", "Ahmed", "456 Avenue", "987654321", "ahmed@example.com");
        libraryManager1.addSubcriber(subscriber1);
        libraryManager1.addSubcriber(subscriber2);
        libraryManager1.borrowBook(2, 1);
        libraryManager1.printOverdueReports();
    }
}